package week_2;

import java.util.Scanner;
public class num_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=0,b=0,c=0;
		
		System.out.print("Á¤¼ö 3°³ ÀÔ·Â>>> ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a > b) {
			if(a < c) {
				System.out.println("Áß¾Ó°ªÀº "+ a);
			}
			else if(b > c) {
				System.out.println("Áß¾Ó°ªÀº "+ b);
			}
			else {
				System.out.println("Áß¾Ó°ªÀº "+ c);
			}
		}
		else { 
			if(b < c) {
				System.out.println("Áß¾Ó°ªÀº "+ b);
			}
			else if(a > c) {
				System.out.println("Áß¾Ó°ªÀº "+ a);
			}
			else {
				System.out.println("Áß¾Ó°ªÀº "+ c);
			}
		}
		
		sc.close();
	}

}
