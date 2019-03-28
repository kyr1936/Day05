package com.yr.mart;

public class ProductView {
	
	//제품의 정보를 출력하는 메서드
	public void info(Product product) {
		System.out.println("제품명 : " + product.brand);
		System.out.println("가격 : " + product.price);
		System.out.println("수량 : " + product.amount);
		System.out.println("세일 : " + product.sale);
	
	}
	
	
	
}
