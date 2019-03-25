package com.yr.school;

import java.util.Scanner;

public class SchoolMain4 {

	public static void main(String[] args) {
		// 1. 받은 수 만큼 학생 객체 생성
		// 2. 각 학생의 정보를 입력
		// 3. 각 학생의 정보가 출력

		Scanner sc = new Scanner(System.in);
		int select=0;
		int select2=0;

		while(true) {
			System.out.println("번호를 입력하세요.");
			System.out.println("1. 학생 등록  2. 전체 정보 조회  3. 학생 정보 검색  4. 전체 정보 총점 순으로 출력 5. 프로그램 종료");
			select = sc.nextInt();

			if(select==1) {

				System.out.println("학생의 수를 입력하세요");
				int count = sc.nextInt();
				Student st =null; // Student 타입 선언
				Student[] students = new Student[count];

				for(int i=0; i<count; i++) {
					st = new Student(); // Student 객체 생성

					System.out.print("이름");
					st.name=sc.next();
					System.out.print("번호");
					st.num=sc.nextInt();
					System.out.print("국어 점수");
					st.kor=sc.nextInt();
					System.out.print("영어 점수");
					st.eng=sc.nextInt();
					System.out.print("수학 점수");
					st.math=sc.nextInt();

					st.total=st.kor+st.eng+st.math;
					st.avg=st.total/3.0;

					System.out.println((i+1) + "번째 학생이 등록되었습니다.");

					students[i]=st; // st의 주소를 배열에 넣음

				} 
				/*
			}else if(select==2) {
					System.out.println("전체 정보를 조회합니다.");
					for(int i=0; i<count; i++) {
						System.out.println("이름 : " + students[i].name + ", 번호 : " + students[i].num +
								", 국어 점수 : " + students[i].kor + ", 영어 점수 : " + students[i].eng + 
								", 수학 점수 : " + students[i].math + ", 총점 : " + students[i].total + ", 평균 : " + students[i].avg);

					
					
					
					
					
					
					
					
					
					
				}

				for(int i=0; i<count; i++) {
					System.out.println("이름 : " + students[i].name + ", 번호 : " + students[i].num +
							", 국어 점수 : " + students[i].kor + ", 영어 점수 : " + students[i].eng + 
							", 수학 점수 : " + students[i].math + ", 총점 : " + students[i].total + ", 평균 : " + students[i].avg);
					System.out.println("=================================================================================");
*/
			}
				}


			}

		}
