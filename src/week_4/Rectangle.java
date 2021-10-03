package week_4;

import java.util.Scanner;
public class Rectangle {
	protected int width, height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[]args) {
		Rectangle rect = new Rectangle();	//생성자 자동 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("width, height 입력>> ");
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		sc.close();
	}

}