package week_5;

class Point {
	private int x, y; 		//private�� PointŬ���� ���ο����� ���. ����Ŭ���������� ���� �Ұ�
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color; // ���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}

public class ColorPointEx_5_1 {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);		//ColorPoint�� ����Ŭ���� Point�� �Լ�
		cp.setColor("red");
		cp.showColorPoint();
	}

}
