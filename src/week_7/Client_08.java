package week_7;

import java.util.*;
public class Client_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		String name = "";
		int point = 0;
		System.out.println("**����Ʈ ���� ���α׷��Դϴ�**");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			point = sc.nextInt();
			if(hashmap.get(name) != null) {
				hashmap.put(name, hashmap.get(name)+point);	//�ؽ��ʿ� ����
			}
			else {
				hashmap.put(name, point);	//�ؽ��ʿ� ����
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
