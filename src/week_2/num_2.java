package week_2;

import java.util.Scanner;
public class num_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.print("2자리수 정수 입력(10-99)>>> ");
		num= sc.nextInt();		//문자열 입력
		
		if(num%10 == num/10) {		//십의자리와 일의자리가 같으면
			System.out.println("YES!! 10의자리와 1의자리가 같습니다.");
		}
		else {
			System.out.println("NO!! 10의자리와 1의자리가 다릅니다.");
		}
		
		sc.close();
	}
}
