package week_5;

import java.util.Scanner;

abstract class Converter {		//추상클래스
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다" );
		System.out.print(getSrcString() + "을 입력하세요>>>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		sc.close();
	}
}

public class Km2Mile_04 extends Converter {	//추상클래스를 상속받는 서브클래스
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
