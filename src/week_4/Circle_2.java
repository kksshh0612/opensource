package week_4;

public class Circle_2 {
	protected int radius;
	protected String name;
	
	public Circle_2() {
		radius = 1;
		name = "";
	}
	public Circle_2(int r, String name) {
		radius = r;
		this.name = name;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle_2 pizza = new Circle_2(5, "��ȣ����"); 
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle_2 donut = new Circle_2(); 
		donut.name = "��ȣ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);

	}

}
