package com.yr.school;

public class SchoolMain {

	public static void main(String[] args) {
		// Student Class 를 참조해서  Student 객체를 생성
		// 클래스명 변수명 = new 클래스명 ();
		 Student std = new Student();
		 System.out.println(std);
		 System.out.println(std.name); //인덱스가 아닌 변수명 사용
		 System.out.println(std.num);
		 
		 std.name="a";
		 std.num=1;
		 System.out.println(std.name);
		 System.out.println(std.num);
		 
		 
		 
		 
		 
		 Student std2 = new Student();
		 System.out.println(std2);
		 System.out.println(std2.name);
		 System.out.println(std2.num);
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
