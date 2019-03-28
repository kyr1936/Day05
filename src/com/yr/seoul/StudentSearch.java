package com.yr.seoul;

import java.util.Scanner;

public class StudentSearch {

	// 
	public Student search(Student[] students) {
		// 학생 번호를 입력받아라
		//배열에서 학생번호랑 일치하는 학생을 찾아서 리턴
		Scanner sc = new Scanner(System.in);
		int sNum = sc.nextInt();
		Student student = null;
		for(int i=0; i<students.length;i++) {
			if(sNum==students[i].num) {
				student = students[i];	// 배열에서 학생 1명을 Student에 담기
				break;
			}
			
		} return student; 
		
	}
}
