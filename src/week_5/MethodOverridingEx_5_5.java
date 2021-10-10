package week_5;

class Shape1 { 		// 슈퍼 클래스
	public Shape1 next;
	public Shape1() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}
class Line1 extends Shape1 {
	public void draw() { 	// 메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect1 extends Shape1 {
	public void draw() { 	// 메소드 오버라이딩
	System.out.println("Rect");
	}
}
class Circle1 extends Shape1 {
	public void draw() { 	// 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx_5_5 {

	static void paint(Shape1 p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출.
		// 동적 바인딩
	}
	public static void main(String[] args) {
		Line1 line = new Line1();
		paint(line);
		paint(new Shape1());
		paint(new Line1());
		paint(new Rect1());
		paint(new Circle1());
	}

}
