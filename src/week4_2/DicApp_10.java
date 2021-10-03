package week4_2;
import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return "���� ������ �����ϴ�";
	}
}

public class DicApp_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "";
		String print_word = "";
		Dictionary dic = new Dictionary();
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ۴ܾ� �Է�>> ");
			word = sc.next();
			if(word.equals("�׸�")) break;
			print_word = dic.kor2Eng(word);
			System.out.println(word + "��(��) " + print_word);
		}
		
		sc.close();
	}

}
