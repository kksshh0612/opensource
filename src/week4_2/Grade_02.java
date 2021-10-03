package week4_2;

import java.util.Scanner;

class Grade {
	protected int math;
	protected int science;
	protected int english;
	
	public Grade() {
		math = 0;
		science = 0;
		english = 0;
	}
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		return (math+science+english)/3;
	}
}

public class Grade_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade my_score = new Grade(math, science, english);		//Grade 객체 생성
		System.out.println("평균: " + my_score.average());
		
		sc.close();
	}
}
