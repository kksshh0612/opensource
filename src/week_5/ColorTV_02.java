package week_5;

class TV {			//����Ŭ����
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
class IPTV extends TV {			//����Ŭ����
	protected String address;
	protected int color;
	public IPTV(String address, int size, int color) {
		super(size);		//����Ŭ���� ������ ȣ��
		this.address = address;
		this.color = color;
	}
	public void printProperty() {		//����Լ�
		System.out.println("���� IPTV�� " + address + "�ּ��� " + getSize() + "��ġ " + color + "�÷�");
	}
	
}

public class ColorTV_02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}

}
