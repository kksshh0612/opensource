package week_2;

import java.util.Scanner;
public class num_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=0,b=0,c=0;
		
		System.out.print("���� 3�� �Է�>>> ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a > b) {
			if(a < c) {
				System.out.println("�߾Ӱ��� "+ a);
			}
			else if(b > c) {
				System.out.println("�߾Ӱ��� "+ b);
			}
			else {
				System.out.println("�߾Ӱ��� "+ c);
			}
		}
		else { 
			if(b < c) {
				System.out.println("�߾Ӱ��� "+ b);
			}
			else if(a > c) {
				System.out.println("�߾Ӱ��� "+ a);
			}
			else {
				System.out.println("�߾Ӱ��� "+ c);
			}
		}
		
		sc.close();
	}

}
