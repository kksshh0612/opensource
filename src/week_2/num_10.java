package week_2;

import java.util.Scanner;
import java.lang.Math;
public class num_10 {

	public static void main(String[] args) {
		//���� ��ġ����->���� �߽ɰŸ�<���� ������ �� �϶� ��ħ
		Scanner sc = new Scanner(System.in);
		int c1_x=0, c1_y=0, c2_x=0, c2_y=0, c1_radius=0, c2_radius=0;
		double distance=0;
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
		c1_x = sc.nextInt();
		c1_y = sc.nextInt();
		c1_radius = sc.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
		c2_x = sc.nextInt();
		c2_y = sc.nextInt();
		c2_radius = sc.nextInt();
		
		distance = Math.sqrt((c1_x-c2_x)*(c1_x-c2_x) + (c1_y-c2_y)*(c1_y-c2_y));
		if(distance <= c1_radius+c2_radius) {
			System.out.println("�� ���� ���� ��Ĩ�ϴ�");
		}
		else {
			System.out.println("�� ���� ���� ��ġ�� �ʽ��ϴ�");
		}
		
		
		
		
		sc.close();

	}

}
