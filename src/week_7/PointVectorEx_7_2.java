package week_7;

import java.util.Vector;
class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")"; 
	}
}

public class PointVectorEx_7_2 {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();		//Ŭ������ �ڷ������� ���� ����
		v.add(new Point(2,3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1); //�ε��� 1�� ����
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // ���Ϳ��� i ��° Point ��ü ����
			System.out.println(p); // p.toString()�� �̿��Ͽ� ��ü p ���
		}
	}

}
