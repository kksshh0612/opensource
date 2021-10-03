package week4_2;
import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return "저의 사전에 없습니다";
	}
}

public class DicApp_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "";
		String print_word = "";
		Dictionary dic = new Dictionary();
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글단어 입력>> ");
			word = sc.next();
			if(word.equals("그만")) break;
			print_word = dic.kor2Eng(word);
			System.out.println(word + "은(는) " + print_word);
		}
		
		sc.close();
	}

}
