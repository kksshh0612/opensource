package week_3;

import java.util.Scanner;

public class num_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("���� �? ");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.print((int)(Math.random()*100 + 1) + " ");	
			if(i==9 || i==19) {
				System.out.println();
			}
		}
		//Math.random�� 0-0.999..������ ���� �������� �̱� ������ ���ϴ� ���ڸ�ŭ �����ְ� 1�� ���� �� int�� ����ȯ�ϸ� ���� ������ �� �ִ�.
		sc.close();
	}
}
