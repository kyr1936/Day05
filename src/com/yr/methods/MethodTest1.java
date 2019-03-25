package com.yr.methods;

import java.util.Scanner;

public class MethodTest1 {

	//메서드 선언-정의
	//멤버메서드 hap
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}

	//메서드명 minus
	//10-20 의 결과물 출력
	public void minus(String name, int age, double ki, Scanner sc) {
		System.out.println(10-20);
	}

	//메서드명 bark
	//메서드 내에 size변수 선언- 값 입력
	//size 90 보다 크면 대형견 - 컹컹컹 / 60~90 이면 중형견 - 멍멍멍 / 그 외 소형견 - 왈왈왈
	public void bark(int size) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("size 를 입력하세요");
		//int size = 0;
		
		if(size>=90) {
			System.out.println("컹컹컹");
		} else if (size>=60) {
			System.out.println("멍멍멍");
		} else{
			System.out.println("왈왈왈");
		}
	}





}
