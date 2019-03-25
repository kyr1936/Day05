package com.yr.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher iu = new Teacher();
		System.out.println("선생님의 이름을 입력 : ");
		iu.name=sc.next();
		System.out.println("선생님의 과목을 입력 : ");
		iu.subject=sc.next();

		int select = 0;
		boolean check = true;
		int count =0;



		while (check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 전체 정보 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 프로그램 종료");
			select = sc.nextInt();
			// 선생님의 학생의 수 입력 - 학생 수 만큼 정보 입력


			switch(select) {
			case 1: System.out.println("학생의 수를 입력 : ");

			count = sc.nextInt();
			iu.students = new Student[count];

			for(int i =0; i<iu.students.length; i++) {
				Student student = new Student();
				System.out.println("학생의 이름 입력 : ");
				student.name=sc.next();
				System.out.println("학생의 번호 입력 : ");
				student.num=sc.nextInt();
				System.out.println("국어 점수 입력 : ");
				student.kor=sc.nextInt();
				System.out.println("영어 점수 입력 : ");
				student.eng=sc.nextInt();
				System.out.println("수학 점수 입력 : ");
				student.math=sc.nextInt();

				student.total= student.kor+student.eng+student.math;
				student.avg=student.total/3.0;

				iu.students[i]=student;
			}	break;
			case 2 : 
				if(iu.students!=null) {
					for(int i =0; i<iu.students.length; i++) {
						System.out.println("이름 : " + iu.students[i].name + ", 번호 : " + iu.students[i].num + 
								", 국어 점수 : " + iu.students[i].kor + ", 영어 점수 : " + iu.students[i].eng + 
								", 수학 점수 : " + iu.students[i].math + ", 총점 : "+ iu.students[i].total + 
								", 평균 : "+ iu.students[i].avg);
						System.out.println("==========================================================================================");
					}
				} else System.out.println("학생 정보가 없습니다.");

				break;
			case 3 : if(iu.students!=null) {
				System.out.println("검색할 번호를 입력하세요");
				select=sc.nextInt();
				boolean find = true;

				for(int i=0; i<iu.students.length;i++) {
					if(select==iu.students[i].num) {
						System.out.println("이름 : " + iu.students[i].name + ", 번호 : " + iu.students[i].num + 
								", 국어 점수 : " + iu.students[i].kor + ", 영어 점수 : " + iu.students[i].eng + 
								", 수학 점수 : " + iu.students[i].math + ", 총점 : "+ iu.students[i].total + 
								", 평균 : "+ iu.students[i].avg);
						System.out.println("=========================================================================================");
						find =! find;
						break;
					} //if문
				} //for문
				if(find)  System.out.println("없는 번호입니다.");
				 
			}
				break;

			default : check=!check; 
			System.out.println("프로그램을 종료합니다");
			}



			} //while

		}



	}
