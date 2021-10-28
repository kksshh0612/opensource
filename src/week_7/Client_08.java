package week_7;

import java.util.*;
public class Client_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		String name = "";
		int point = 0;
		System.out.println("**포인트 관리 프로그램입니다**");
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			point = sc.nextInt();
			if(hashmap.get(name) != null) {
				hashmap.put(name, hashmap.get(name)+point);	//해쉬맵에 저장
			}
			else {
				hashmap.put(name, point);	//해쉬맵에 저장
			}
			
			Set<String>keys = hashmap.keySet();
			Iterator<String>it = keys.iterator();
			while(it.hasNext()) {
				String print_name = it.next();
				int print_point = hashmap.get(print_name);
				System.out.print("(" + print_name + "," + print_point + ")");
			}
			System.out.println("");
		}
		sc.close();
	}

}
