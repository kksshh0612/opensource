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
		//aClass.b = 10;	//b�� private�̱� ������ Ŭ���� ���ο����� ���� ����. -> ����
		aClass.c = 10;
	}
}
