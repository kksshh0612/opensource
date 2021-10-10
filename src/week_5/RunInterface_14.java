package week_5;

interface Shape2 {
	final double PI = 3.14; // ���
	void draw(); // ������ �׸��� �߻� �޼ҵ�
	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle3 implements Shape2 {
	private int radius;
	public Circle3(int radius) {
		this.radius = radius;
    }
	public void draw() {
	    System.out.println("�������� "+radius+"�� ���Դϴ�.");
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
		System.out.println(a+"x"+b+"�� �����ϴ� Ÿ���Դϴ�.");
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
		System.out.println(a+"x"+b+"ũ���� �簢�� �Դϴ�.");
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
			System.out.println("������ " + list[i].getArea());
		}
	}

}
