package week_2;

import java.util.Scanner;
public class num_12 {
	public static void calc_ifelse(double num1, double num2, String operator) {
		if(operator.equals("+")) {		//equals는 문자열 비교 매서드
			System.out.println(num1 + "+" + num2 + "의 계산 결과는 " + (num1+num2));
		}
		else if(operator.equals("-")) {
			System.out.println(num1 + "-" + num2 + "의 계산 결과는 " + (num1-num2));
		}
		else if(operator.equals("*")) {
			System.out.println(num1 + "*" + num2 + "의 계산 결과는 " + (num1*num2));
		}
		else if(operator.equals("/")) {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println(num1 + "/" + num2 + "의 계산 결과는 " + (num1/num2));
			}
		}
		else {
			System.out.println("사용할 수 없는 연산자입니다");
		}
	}
	
	public static void calc_switch(double num1, double num2, String operator) {
		switch(operator) {
		case "+": 
			System.out.println(num1 + "+" + num2 + "의 계산 결과는 " + (num1+num2));
			break;
		case "-": 
			System.out.println(num1 + "-" + num2 + "의 계산 결과는 " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "의 계산 결과는 " + (num1*num2));
			break;
		case "/":
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println(num1 + "/" + num2 + "의 계산 결과는 " + (num1/num2));
			}
			break;
		default:
			System.out.println("사용할 수 없는 연산자입니다");	
		}
	}
	
	public static void main(String[] args) {
		double num1=0, num2=0;
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>> ");	
		num1 = sc.nextInt();			//피연산자, 연산자 입력
		op = sc.next();
		num2 = sc.nextInt();
		
		System.out.println("===if-else를 활용한 결과===");
		calc_ifelse(num1, num2, op);
		System.out.println("===switch를 활용한 결과===");
		calc_switch(num1, num2, op);
		
		sc.close();
	}

}
