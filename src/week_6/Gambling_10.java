package week_6;

import java.util.Scanner;

class Person {
	protected int num1, num2, num3;
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	public boolean game() {
		num1 = (int) ((Math.random()*3)+1);
		num2 = (int) ((Math.random()*3)+1);
		num3 = (int) ((Math.random()*3)+1);
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		if(num1 == num2 && num2 == num3) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Gambling_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = "";
		
		System.out.print("1��° ���� �̸�>>>");
		String name = sc.next();
		Person person1 = new Person(name);
		System.out.print("2��° ���� �̸�>>>");
		name =sc.next();
		Person person2 = new Person(name);
		arr = sc.nextLine();
		
		while(true) {		//���� �Ѹ��� ���� ��� ���������� ����
			System.out.print("["+person1.name+"]:<Enter>");
			arr = sc.nextLine();
			if(person1.game()) {
				System.out.println(person1.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
			
			System.out.print("["+person2.name+"]:<Enter>");
			arr = sc.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
		}
		
		sc.close();
	}
}
