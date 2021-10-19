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
		
		System.out.print("1번째 선수 이름>>>");
		String name = sc.next();
		Person person1 = new Person(name);
		System.out.print("2번째 선수 이름>>>");
		name =sc.next();
		Person person2 = new Person(name);
		arr = sc.nextLine();
		
		while(true) {		//둘중 한명이 세개 모두 같을때까지 수행
			System.out.print("["+person1.name+"]:<Enter>");
			arr = sc.nextLine();
			if(person1.game()) {
				System.out.println(person1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			
			System.out.print("["+person2.name+"]:<Enter>");
			arr = sc.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		
		sc.close();
	}
}
