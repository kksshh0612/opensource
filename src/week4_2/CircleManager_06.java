package week4_2;
import java.util.Scanner;

class Circle {
	private double x, y;
	protected int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}
public class CircleManager_06 {		//public 클래스. 대표 클래스
	
	public static void main(String[] args) {
		double x=0, y=0;
		int r=0;
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >> ");
			 x = sc.nextDouble();
			 y = sc.nextDouble();
			 r = sc.nextInt();
			 c[i] = new Circle(x,y,r);
		}
		for(int i=0; i<c.length; i++) {
			c[i].show();
		}
		//최대값 구하는 과정
		int max = c[0].radius;
		int max_idx = 0;
		if(c[1].radius > max) {
			max = c[1].radius;
			max_idx = 1;
			if(c[2].radius > max) {
				max = c[2].radius;
				max_idx = 2;
			}
		}
		else {
			if(c[2].radius > max) {
				max = c[2].radius;
				max_idx = 2;
			}
		}
		System.out.print("면적이 가장 큰 원은 ");
		c[max_idx].show();
		sc.close();

	}
}

