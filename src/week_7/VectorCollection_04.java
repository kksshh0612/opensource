package week_7;

import java.util.*;
public class VectorCollection_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vec = new Vector<Integer>();
		
		while(true) {
			int sum = 0;
			System.out.print("������ �Է�(0�Է½� ����)>>>");
			int rain = sc.nextInt();
			if(rain == 0) {		//����
				break;
			}
			vec.add(rain);
			for(int i=0; i<vec.size(); i++) {
				sum +=vec.get(i);
			}
			System.out.println("���� ���: " + sum/vec.size());
		}
		sc.close();
	}

}
