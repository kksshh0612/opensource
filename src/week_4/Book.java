package week_4;

public class Book {
	String title;		//���������� �ڵ����� private
	String author;
	
	public Book(String t) {		//������ ������� ������ ����Ʈ ������ �ڵ� ���� �ȵ�. ���� ���� �ڵ�.
		title = t;
		author = "���ڹ̻�";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
