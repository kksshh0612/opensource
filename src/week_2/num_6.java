package week_2;

import java.util.Scanner;
public class num_6 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1-99������ ������ �Է��Ͻÿ�>>>" );
		int integ = sc.nextInt();		//�Է�
		
		num1 = integ/10;	//�����ڸ� ��
		num2 = integ%10;	//�����ڸ� ��
		
		if(num1%3==0 && num2%3==0) {		//3,6,9 ���� �ΰ��� ��
			System.out.println("�ڼ�¦¦");
		}
		else if(num1%3==0 || num2%3==0) {	//3,6,9 ���� �Ѱ��� ��
			System.out.println("�ڼ�¦");
		}
		
		sc.close();
	}

}
