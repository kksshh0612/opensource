package week4_2;

class Rectangle {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
		
	public Rectangle() {	//����Ʈ ������
		x = 0;
		y = 0;
		width = 0;
		height = 0;
	}
	public Rectangle(int x, int y, int width, int height) {		//�Ű����� �ִ� ������
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + square() + "�� �簢��");
	}
	public boolean contains(Rectangle r) {
		if(r.x >= this.x && r.y >=this.y) {
			if((r.width + r.x) <= (this.width + this.x) && (r.height + r.y) <= (this.height + this.y)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}

public class Rectangle_04 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) {
			System.out.println("t�� r�� �����մϴ�.");
		}
		if(t.contains(s)) {
			System.out.println("t�� s�� �����մϴ�");
		}

	}

}
