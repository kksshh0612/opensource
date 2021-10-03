package week_4;

import java.util.Scanner;
public class BookArray {

	public static void main(String[] args) {
		Book [] book = new Book[2]; // Book 배열 선언
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {
		System.out.print("제목>>");
		String title = scanner.nextLine();	//엔터 치기 전까지 모두 입력. next()는 공백 전까지 입력
		System.out.print("저자>>");
		String author = scanner.nextLine();
		book[i] = new Book(title, author); // 배열 원소 객체 생성
		}
		
		for(int i=0; i<book.length; i++)
		System.out.print("(" + book[i].title + ", " + book[i].author + ") ");
		
		scanner.close();
	}
}
