package week_3;

import java.util.Scanner;
public class num_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int cost = 0;
		System.out.print("금액을 입력하시오>> ");
		cost = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "원짜리: " + cost/unit[i] + "개" );
			cost %=unit[i];
		}	
		sc.close();
	}
}
