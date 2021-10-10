package week4_2;

class Sample {
	public int a;
	private int b;
	int c;
}
public class AccessEx_4_10 {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10;	//b는 private이기 때문에 클래스 내부에서만 접근 가능. -> 오류
		aClass.c = 10;
	}
}
