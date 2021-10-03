package week_2;

import java.util.Scanner;
import java.lang.Math;
public class num_10 {

	public static void main(String[] args) {
		//원이 겹치는지->원의 중심거리<원의 반지름 합 일때 겹침
		Scanner sc = new Scanner(System.in);
		int c1_x=0, c1_y=0, c2_x=0, c2_y=0, c1_radius=0, c2_radius=0;
		double distance=0;
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		c1_x = sc.nextInt();
		c1_y = sc.nextInt();
		c1_radius = sc.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>> ");
		c2_x = sc.nextInt();
		c2_y = sc.nextInt();
		c2_radius = sc.nextInt();
		
		distance = Math.sqrt((c1_x-c2_x)*(c1_x-c2_x) + (c1_y-c2_y)*(c1_y-c2_y));
		if(distance <= c1_radius+c2_radius) {
			System.out.println("두 원이 서로 겹칩니다");
		}
		else {
			System.out.println("두 원이 서로 겹치지 않습니다");
		}
		
		
		
		
		sc.close();

	}

}
