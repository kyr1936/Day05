package com.yr.seoul;

import java.util.Scanner;

public class SeoulMain {

	public static void main(String[] args) {	
		// start

		SeoulMenu start = new SeoulMenu();
		start.start();
		//		

//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("학생 수 입력");
//		int count = sc.nextInt();
//		Student [] students = new Student[count];



		/*while (true) {

			System.out.println("1. 정보 입력 2. 전체 정보 출력  3. 개인 정보");
			int select = sc.nextInt();

			switch(select) {
			case 1: 
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
				} break;
			case 2:
				for(int i=0; i<students.length;i++) {
					System.out.println("이름 : " + students[i].name);
					System.out.println("번호 : " + students[i].num);
					System.out.println("국어 점수 : " + students[i].kor);
					System.out.println("영어 점수 : " + students[i].eng);
					System.out.println("수학 점수: " + students[i].math);
					System.out.println("국어점수 : " + students[i].kor);
					System.out.println("총점 : " + students[i].total);
					System.out.println("평균 : " + students[i].avg);
					System.out.println("----------------------");
				}	break;
			case 3: 
				System.out.println("검색할 번호 입력");
				select=sc.nextInt();
				for(int i=0; i<students.length;i++) {
					if(select==students[i].num) {
						System.out.println("이름 : " + students[i].name);
						System.out.println("번호 : " + students[i].num);
						System.out.println("국어 점수 : " + students[i].kor);
						System.out.println("영어 점수 : " + students[i].eng);
						System.out.println("수학 점수: " + students[i].math);
						System.out.println("국어점수 : " + students[i].kor);
						System.out.println("총점 : " + students[i].total);
						System.out.println("평균 : " + students[i].avg);
					} //if문 
					if(select!=students[i].num) {
						System.out.println("없는 번호입니다");
					} 
				} break;
			default: break; 
			} //switch

		} */
	}
}

