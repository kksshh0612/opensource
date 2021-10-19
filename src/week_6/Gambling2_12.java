package week_6;

import java.util.Scanner;

public class Gambling2_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = "";
		int person_num = 0;
		
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		person_num = sc.nextInt();
		Person[] person = new Person[person_num];
		
		for(int i=0; i<person_num; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			String name = sc.next();
			person[i] = new Person(name);
		}
		arr = sc.nextLine();
		
		while(true) {		//한명이라도 셋 다 같은게 나오면 종료
			for(int i=0; i<person_num; i++) {
				System.out.print("["+person[i].name+"]:<Enter>");
				arr = sc.nextLine();
				if(person[i].game()) {		//한명이 이기면 종료
					System.out.println(person[i].name+"님이 이겼습니다!");
					sc.close();
					return;
				}
				System.out.println("아쉽군요!");
			}
		}

	}

}
