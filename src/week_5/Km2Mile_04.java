package week_5;

import java.util.Scanner;

abstract class Converter {		//�߻�Ŭ����
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�" );
		System.out.print(getSrcString() + "�� �Է��ϼ���>>>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�");
		sc.close();
	}
}

public class Km2Mile_04 extends Converter {	//�߻�Ŭ������ ��ӹ޴� ����Ŭ����
	public Km2Mile_04(double src) {
		ratio = src;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "Mile";
	}
	
	public static void main(String[] args) {
		Km2Mile_04 tomile = new Km2Mile_04(1.6);
		tomile.run();
	}

}
