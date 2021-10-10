package week_5;

interface Shape2 {
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle3 implements Shape2 {
	private int radius;
	public Circle3(int radius) {
		this.radius = radius;
    }
	public void draw() {
	    System.out.println("반지름이 "+radius+"인 원입니다.");
	}
    public double getArea() {
    	return PI*radius*radius;
	}
}

class Oval implements Shape2 {
	private int a, b;
	public Oval(int a, int b) {
	   	this.a  = a;
	   	this.b = b;
	}
	public void draw() {
		System.out.println(a+"x"+b+"에 내접하는 타원입니다.");
	}
	public double getArea() {
		return PI*a*b;
	}
}

class Rect3 implements Shape2 {
	private int a, b;
	public Rect3(int a, int b) {
		this.a  = a;
	    this.b = b;
	}
	public void draw() {
		System.out.println(a+"x"+b+"크기의 사각형 입니다.");
	}
    public double getArea() {
        return a*b;
	}
}

public class RunInterface_14 {

	public static void main(String[] args) {
		Shape2[] list = new Shape2[3];
		list[0] = new Circle3(10);
		list[1] = new Oval(20,40);
		list[2] = new Rect3(10,40);
		
		for(int i=0; i<list.length; i++) {
			list[i].redraw();
		}
		for(int i=0; i<list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}

}
