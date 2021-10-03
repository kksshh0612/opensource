package week_2;

import java.util.Scanner;
public class num_6 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1-99사이의 정수를 입력하시오>>>" );
		int integ = sc.nextInt();		//입력
		
		num1 = integ/10;	//십의자리 수
		num2 = integ%10;	//일의자리 수
		
		if(num1%3==0 && num2%3==0) {		//3,6,9 숫자 두개일 때
			System.out.println("박수짝짝");
		}
		else if(num1%3==0 || num2%3==0) {	//3,6,9 숫자 한개일 때
			System.out.println("박수짝");
		}
		
		sc.close();
	}

}
