package week_7;

import java.util.*;
public class IteratorEx_7_4 {		//Vector, ArrayList, LinkedList�� ��ӹ޴� �������̽�

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(5);
		v.add(-1);
		v.add(2,100);	//�ε��� 2���� 100�����ϰ� ���� �� �ڷ� �̷�
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n= it.next();
			System.out.println(n);
		}
		int sum = 0;
		it = v.iterator(); 		// Iterator ��ü ���
		while(it.hasNext()) {		//�湮�� ��Ұ� ������ true ����
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}

}
