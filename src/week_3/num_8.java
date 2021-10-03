package week_3;

import java.util.Scanner;

public class num_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("정수 몇개? ");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.print((int)(Math.random()*100 + 1) + " ");	
			if(i==9 || i==19) {
				System.out.println();
			}
		}
		//Math.random은 0-0.999..사이의 값을 랜덤으로 뽑기 때문에 원하는 숫자만큼 곱해주고 1을 더한 후 int로 형변환하면 번위 지정할 수 있다.
		sc.close();
	}
}
