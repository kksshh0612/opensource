package week_7;

import java.util.*;
public class Average_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> mylist = new ArrayList<Double>(6);
		double sum = 0;
		System.out.print("6���� ������ ��ĭ���� �и� �Է�>> ");
		for(int i=0; i<6; i++) {
			String str = sc.next();
			if(str.equals("A")) {
				mylist.add(4.0);
			}
			else if(str.equals("B")) {
				mylist.add(3.0);
			}
			else if(str.equals("C")) {
				mylist.add(2.0);
			}
			else if(str.equals("D")) {
				mylist.add(1.0);
			}
			else if(str.equals("F")) {
				mylist.add(0.0);
			}
		}
		for(int i=0; i<6; i++) {
			sum += mylist.get(i);
		}
		System.out.println(sum/6);
		
		sc.close();

	}
	
}
