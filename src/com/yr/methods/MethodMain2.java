package com.yr.methods;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int sal = 0;
		MethodTest2 tax = new MethodTest2();
		
		while(check) {
			System.out.println("1. 급여 입력");
			System.out.println("2. 고용보험료");
			System.out.println("3. 의료험료");
			System.out.println("4. 국민연급");
			System.out.println("5. 산재보험료");
			System.out.println("6. 종료");
			int select=sc.nextInt();
			

			switch(select) {
			case 1 : System.out.println("급여를 입력하세요");
				sal = sc.nextInt();
				break;
			case 2 : tax.m1(sal);
				break;
			case 3 : tax.m2(sal);
				break;
			case 4 : tax.m3(sal);
				break;
			case 5 : tax.m4(sal);
				break;
			default :
				check=!check; 
				System.out.println("종료");
				
			} // switch





		} 





	}

}
