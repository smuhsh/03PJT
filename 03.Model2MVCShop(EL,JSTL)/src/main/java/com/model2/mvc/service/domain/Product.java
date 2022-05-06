package com.model2.mvc.service.domain;

import java.sql.Date;


public class Product {
	
//	private String fileName;
//	private String manuDate;
//	private int price;
//	private String prodDetail;
//	private String prodName;
//	private int prodNo;
//	private Date regDate;
//	private String proTranCode; //이게 뭐지? product 테이블에 sequence를 생성하는 컬럼이라는데 암만 찾아봐도 없어 아 DAO보니까 그렇네
	
	//2022-03-25 shhwang
	//Field
	private String proTranCode;
	private int prodNo; //상품번호
	private String prodName; //상품명
	private String prodDetail; //상품상세정보
	private String manuDate; //상품제조일자
	private int price; //가격
	private String fileName; //상품이미지	
	private Date regDate; //등록일자
	
	//Constructor
	public Product(){
	}
	
	//Method
	public String getProTranCode() {
		return proTranCode;
	}
	public void setProTranCode(String proTranCode) {
		this.proTranCode = proTranCode;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getManuDate() {
		return manuDate;
	}
	public void setManuDate(String manuDate) {
		this.manuDate = manuDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdDetail() {
		return prodDetail;
	}
	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	// Override
	public String toString() {
		return "ProductVO : [fileName]" + fileName
				+ "[manuDate]" + manuDate+ "[price]" + price + "[prodDetail]" + prodDetail
				+ "[prodName]" + prodName + "[prodNo]" + prodNo;
	}	
}