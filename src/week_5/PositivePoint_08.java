package week_5;

//Point3�� ���
public class PositivePoint_08 extends Point3{

	public PositivePoint_08() {
		super(0,0);
	}
	public PositivePoint_08(int x, int y) {
		if(x<0 || y<0) {
			super.move(0, 0);	//����Ŭ������ move�Լ�
		}
		else {
			super.move(x,y);	//����Ŭ������ move�Լ�
		}
	}
	
	protected void move(int x, int y) {
		if(x<0 || y<0) {
			return;
		}
		else {
			super.move(x,y);	//����Ŭ������ move�Լ�
		}
	}
	
	public String toString() {
		return "(" + getX() + "," + getY() + ")�� ��";
	}
	
	public static void main(String[] args) {
		PositivePoint_08 p = new PositivePoint_08();
		p.move(10,10);
		System.out.println(p.toString() + "�Դϴ�");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�");
		
		PositivePoint_08 p2 = new PositivePoint_08(10, -10);
		System.out.println(p2.toString() + "�Դϴ�");
	}

}
