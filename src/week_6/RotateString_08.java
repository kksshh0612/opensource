package week_6;

import java.util.Scanner;
public class RotateString_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �ѱ�, ���� ��� �˴ϴ�.");
		str = sc.nextLine();		//���� ���� ���ڿ� ���� �Է�
		
		for(int i = 1; i <= str.length() ;i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0, i));
		}
		sc.close();
	}

}
