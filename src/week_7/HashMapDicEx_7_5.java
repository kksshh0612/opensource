package week_7;

import java.util.*;
public class HashMapDicEx_7_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("baby", "�Ʊ�"); // "baby"�� key, "�Ʊ�"�� value
		dic.put("love", "���");
		dic.put("apple", "���");
		
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			String kor = dic.get(eng);		//Ű���� �ش�Ǵ� value ã��
			if(kor==null) {
				System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			}
			else System.out.println(kor);
		}
		sc.close();
	}

}
