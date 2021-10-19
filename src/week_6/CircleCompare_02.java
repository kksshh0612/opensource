package week_6;

class Circle {
	protected int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String info() {
		return "Circle(" + x + "," + y + ") 반지름" + radius; 
	}
	
	public boolean equals(Circle c) {
		if(this.x == c.x && this.y == c.y) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class CircleCompare_02 {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,10);
		System.out.println("원 a: " +a.info());
		System.out.println("원 b: " +b.info());
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("다른 원");
		}

	}

}
