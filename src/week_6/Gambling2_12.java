package week_6;

import java.util.Scanner;

public class Gambling2_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = "";
		int person_num = 0;
		
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		person_num = sc.nextInt();
		Person[] person = new Person[person_num];
		
		for(int i=0; i<person_num; i++) {
			System.out.print((i+1)+"��° ���� �̸�>>");
			String name = sc.next();
			person[i] = new Person(name);
		}
		arr = sc.nextLine();
		
		while(true) {		//�Ѹ��̶� �� �� ������ ������ ����
			for(int i=0; i<person_num; i++) {
				System.out.print("["+person[i].name+"]:<Enter>");
				arr = sc.nextLine();
				if(person[i].game()) {		//�Ѹ��� �̱�� ����
					System.out.println(person[i].name+"���� �̰���ϴ�!");
					sc.close();
					return;
				}
				System.out.println("�ƽ�����!");
			}
		}

	}

}
