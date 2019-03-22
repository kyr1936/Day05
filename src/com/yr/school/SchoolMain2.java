package com.yr.school;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		Student st1 = new Student();
//		Student st2 = new Student();
		// 학생 수 입력
		// 학생 수 만큼 학생 객체를 생성해서 이름과 번호를 입력하고 출력
		System.out.println("학생의 수를 입력하세요");
		int count = sc.nextInt();
		Student st =null;
		Student[] students = new Student[count];
		
		
		for(int i=0; i<count; i++) {
			st = new Student();
			System.out.println("이름");
			st.name=sc.next();
			System.out.println("번호");
			st.num=sc.nextInt();
			students[i]=st; // st의 주소를 배열에 넣음
		
		}
			for(int i=0; i<count; i++) {
				System.out.println(students[i].name);
				System.out.println(students[i].num);
			}
		
			Random rd = new Random();
			ArrayList<Character> al = new ArrayList<Character>();

	}

}
