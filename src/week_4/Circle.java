package week_4;

public class Circle {
	protected int radius;
	protected String name;
	public Circle() {};		//생성자
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[]args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "성호피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle donut = new Circle();
		donut.radius = 4;
		donut.name = "성호도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
	}

}
