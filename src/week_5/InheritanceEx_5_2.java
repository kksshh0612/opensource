package week_5;

class Person1 {
	private int weight;
	int age;
	protected int height;
	public String name;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student1 extends Person1 {
	public void set() {
		age = 30; // ���� Ŭ������ ����Ʈ ��� ���� ����
		name = "ȫ�浿"; // ���� Ŭ������ public ��� ���� ����
		height = 175; // ���� Ŭ������ protected ��� ���� ����
		// weight = 99; // ����. ���� Ŭ������ private ���� �Ұ�
		setWeight(99); // private ��� weight�� setWeight()���� ���� ����
	}
}

public class InheritanceEx_5_2 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.set();
	}

}
