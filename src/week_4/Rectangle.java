package week_4;

import java.util.Scanner;
public class Rectangle {
	protected int width, height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[]args) {
		Rectangle rect = new Rectangle();	//������ �ڵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("width, height �Է�>> ");
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		
		sc.close();
	}

}