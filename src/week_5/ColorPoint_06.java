package week_5;

class Point3 {
	private int x, y;
	public Point3() {
		this.x = 0;
		this.y = 0;
	}
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPoint_06 extends Point3 {
	protected String color;
	public ColorPoint_06() {
		super(0,0);
		color = "black";
	}
	public ColorPoint_06(int x, int y) {
		move(x,y);
		color = "black";
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String str) {
		color = str;
	}
	public String toString() {
		return color + "색의" + "(" + getX() + "," + getY() + ")의 점";
	}
	
	public static void main(String[] args) {
		ColorPoint_06 zeroPoint = new ColorPoint_06();
		System.out.println(zeroPoint.toString() + "입니다");
		
		ColorPoint_06 cp = new ColorPoint_06(10,10)
;
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다");
	}

}
