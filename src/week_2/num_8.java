package week_2;

import java.util.Scanner;
public class num_8 {

	public static boolean inRect(int x, int y) { 		//���簢���� �����ϴ� �� ���� x,y ��ǥ �� �ϳ��� ������ �浹 
		if((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) return true; 
		else return false; 
	}
	
	public static void main(String[] args) {
		int x1=0, y1=0, x2=0, y2=0;
		boolean result1, result2;
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		y2 = sc.nextInt();
	
		result1 = inRect(x1, y1);
		result2 = inRect(x2, y2);
		
		if(result1==true || result2==true) {
			System.out.println("�� ���簢���� �浹�մϴ�");
		}
		else {
			System.out.println("�� ���簢���� �浹�����ʽ��ϴ�");
		}
		
		sc.close();

	}

}
