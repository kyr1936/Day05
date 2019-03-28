package com.yr.school;

public class StudentView {
	// 메서드명 listView - 학생 정보 전체 출력
	
	public void listView(Student[] students) {
		
	/*	System.out.println("이름 : " +  + ", 번호 : " +  + 
				", 국어 점수 : " +  + ", 영어 점수 : " +  + 
				", 수학 점수 : " +  + ", 총점 : "+  + 
				", 평균 : "+ ); */
		System.out.println(students.length);
	}
	
	// 메서드명 view - 한 명의 학생정보 출력
	public void view(Student student) {
		System.out.println("이름 : " + student.name + ", 번호 : " + student.num+ 
				", 국어 점수 : " + student.kor + ", 영어 점수 : " + student.eng + 
				", 수학 점수 : " + student.math + ", 총점 : "+ student.total + 
				", 평균 : "+ student.avg );

		}
		
	
	
	
}
