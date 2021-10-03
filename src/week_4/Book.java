package week_4;

public class Book {
	String title;		//접근지정자 자동으로 private
	String author;
	
	public Book(String t) {		//생성자 만들었기 때문에 디폴트 생성자 자동 생성 안됨. 좋지 않은 코드.
		title = t;
		author = "작자미상";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
