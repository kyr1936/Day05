package com.yr.methods;

public class MethodMain3 {

	public static void main(String[] args) {
		MethodTest3 t3 = new MethodTest3();
		
		int n=3;
		t3.test(n);
		
		System.out.println(n);
		
		Product product = new Product();
		product.price = 700;
		t3.test2(product);
		System.out.println(product.price);
		
		t3.test3(product);
		System.out.println(product.price);
		
		
		
	}

}
