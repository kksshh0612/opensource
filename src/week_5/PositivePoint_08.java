package week_5;

//Point3를 상속
public class PositivePoint_08 extends Point3{

	public PositivePoint_08() {
		super(0,0);
	}
	public PositivePoint_08(int x, int y) {
		if(x<0 || y<0) {
			super.move(0, 0);	//슈퍼클래스의 move함수
		}
		else {
			super.move(x,y);	//슈퍼클래스의 move함수
		}
	}
	
	protected void move(int x, int y) {
		if(x<0 || y<0) {
			return;
		}
		else {
			super.move(x,y);	//슈퍼클래스의 move함수
		}
	}
	
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}
	
	public static void main(String[] args) {
		PositivePoint_08 p = new PositivePoint_08();
		p.move(10,10);
		System.out.println(p.toString() + "입니다");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다");
		
		PositivePoint_08 p2 = new PositivePoint_08(10, -10);
		System.out.println(p2.toString() + "입니다");
	}

}
