package week_7;

import java.util.*;
public class ArrayListEx_7_3 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("�̸� �Է�>>>");
			String str = sc.next();
			a.add(str);		//��̸���Ʈ�� ���ڿ� ����
		}
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		sc.close();	
	}

}
