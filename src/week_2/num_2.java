package week_2;

import java.util.Scanner;
public class num_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.print("2�ڸ��� ���� �Է�(10-99)>>> ");
		num= sc.nextInt();		//���ڿ� �Է�
		
		if(num%10 == num/10) {		//�����ڸ��� �����ڸ��� ������
			System.out.println("YES!! 10���ڸ��� 1���ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("NO!! 10���ڸ��� 1���ڸ��� �ٸ��ϴ�.");
		}
		
		sc.close();
	}
}
