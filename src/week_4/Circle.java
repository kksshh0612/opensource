package week_4;

public class Circle {
	protected int radius;
	protected String name;
	public Circle() {};		//������
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[]args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "��ȣ����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);
		
		Circle donut = new Circle();
		donut.radius = 4;
		donut.name = "��ȣ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������" + area);
	}

}
