package week_4;

public class Book_2 {
	String title;		//���������� �ڵ����� private
	String author;
	
	public Book_2() {
		this("","");
		System.out.println("������ ȣ���");
	}
	public Book_2(String title) {		//�Ű����� �ϳ�
		this(title, "���ڹ̻�");
	}
	public Book_2(String title, String author) {		//�Ű����� �ΰ�
		this.title = title;
		this.author = author;
	}
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	
	public static void main(String[] args) {
		Book_2 littlePrince = new Book_2("�����", "�������丮");
		Book_2 loveStory = new Book_2("������");
		Book_2 emptybook = new Book_2();
		littlePrince.show();
		loveStory.show();
		emptybook.show();		//�ƹ��͵� ��� �ȵ�. �׷��� ���� �� �� ĭ �����
		System.out.println("-----------");
	}

}
