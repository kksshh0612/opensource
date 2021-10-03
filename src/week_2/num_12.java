package week_2;

import java.util.Scanner;
public class num_12 {
	public static void calc_ifelse(double num1, double num2, String operator) {
		if(operator.equals("+")) {		//equals�� ���ڿ� �� �ż���
			System.out.println(num1 + "+" + num2 + "�� ��� ����� " + (num1+num2));
		}
		else if(operator.equals("-")) {
			System.out.println(num1 + "-" + num2 + "�� ��� ����� " + (num1-num2));
		}
		else if(operator.equals("*")) {
			System.out.println(num1 + "*" + num2 + "�� ��� ����� " + (num1*num2));
		}
		else if(operator.equals("/")) {
			if(num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else {
				System.out.println(num1 + "/" + num2 + "�� ��� ����� " + (num1/num2));
			}
		}
		else {
			System.out.println("����� �� ���� �������Դϴ�");
		}
	}
	
	public static void calc_switch(double num1, double num2, String operator) {
		switch(operator) {
		case "+": 
			System.out.println(num1 + "+" + num2 + "�� ��� ����� " + (num1+num2));
			break;
		case "-": 
			System.out.println(num1 + "-" + num2 + "�� ��� ����� " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "�� ��� ����� " + (num1*num2));
			break;
		case "/":
			if(num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else {
				System.out.println(num1 + "/" + num2 + "�� ��� ����� " + (num1/num2));
			}
			break;
		default:
			System.out.println("����� �� ���� �������Դϴ�");	
		}
	}
	
	public static void main(String[] args) {
		double num1=0, num2=0;
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.print("����>> ");	
		num1 = sc.nextInt();			//�ǿ�����, ������ �Է�
		op = sc.next();
		num2 = sc.nextInt();
		
		System.out.println("===if-else�� Ȱ���� ���===");
		calc_ifelse(num1, num2, op);
		System.out.println("===switch�� Ȱ���� ���===");
		calc_switch(num1, num2, op);
		
		sc.close();
	}

}
