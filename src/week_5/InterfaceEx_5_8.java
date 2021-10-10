package week_5;

interface PhoneInterface { // �������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall(); // �߻� �޼ҵ�
	void receiveCall(); // �߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}
class SamsungPhone implements PhoneInterface { // �������̽� ����
// PhoneInterface�� ��� �޼ҵ� ����
	public void sendCall() {
		System.out.println("�츮������");
	}

	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
// �޼ҵ� �߰� �ۼ�
	public void flash() { 
		System.out.println("��ȭ�⿡ ���� �������ϴ�."); 
	}
}
public class InterfaceEx_5_8 {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
