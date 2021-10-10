package week_5;

class TV {			//슈퍼클래스
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
class IPTV extends TV {			//서브클래스
	protected String address;
	protected int color;
	public IPTV(String address, int size, int color) {
		super(size);		//슈퍼클래스 생성자 호출
		this.address = address;
		this.color = color;
	}
	public void printProperty() {		//출력함수
		System.out.println("나의 IPTV는 " + address + "주소의 " + getSize() + "인치 " + color + "컬러");
	}
	
}

public class ColorTV_02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}

}
