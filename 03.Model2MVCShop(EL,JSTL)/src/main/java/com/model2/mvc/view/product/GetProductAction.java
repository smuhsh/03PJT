package com.model2.mvc.view.product;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;


public class GetProductAction extends Action{

	@Override
	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {

		int prodNo= Integer.parseInt(request.getParameter("prodNo"));
		
		String menu= request.getParameter("menu");//2022-03-31 shhwang
		
		ProductService service = new ProductServiceImpl();
		Product vo=service.findProduct(prodNo);
		
		request.setAttribute("vo", vo);
		response.addCookie(new Cookie("history"+prodNo, prodNo+""));
		
		
		if(menu.equals("search")) {
			return "forward:/product/readProduct.jsp";
		}
		else if(menu.equals("manage")){
			return "redirect:/updateProductView.do?prodNo="+prodNo;
		}
		else {
			return "error";
		}
		
		//return "forward:/product/readProduct.jsp";//2022-04-02 shhwang
		
	}
}