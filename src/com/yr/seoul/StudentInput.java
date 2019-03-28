package com.yr.seoul;

import java.util.Scanner;

public class StudentInput {

	public Student[] makeStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수 입력");
		int select = sc.nextInt();
		Student[] students = new Student[select];
		
		for(int i=0; i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어점수 입력");
			student.kor = sc.nextInt();
			System.out.println("영어점수 입력");
			student.eng = sc.nextInt();
			System.out.println("수학점수 입력");
			student.math = sc.nextInt();
			student.total = student.kor+student.eng+student.math;
			student.avg = student.total/3.0;

			students[i]=student;
			
		} return students;
	}
}
