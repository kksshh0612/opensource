package week_4;

public class Book_2 {
	String title;		//접근지정자 자동으로 private
	String author;
	
	public Book_2() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public Book_2(String title) {		//매개변수 하나
		this(title, "작자미상");
	}
	public Book_2(String title, String author) {		//매개변수 두개
		this.title = title;
		this.author = author;
	}
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	
	public static void main(String[] args) {
		Book_2 littlePrince = new Book_2("어린왕자", "생텍쥐페리");
		Book_2 loveStory = new Book_2("춘향전");
		Book_2 emptybook = new Book_2();
		littlePrince.show();
		loveStory.show();
		emptybook.show();		//아무것도 출력 안됨. 그래서 다음 줄 한 칸 띄워짐
		System.out.println("-----------");
	}

}
