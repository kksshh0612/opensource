package week_7;

import java.util.*;
public class IteratorEx_7_4 {		//Vector, ArrayList, LinkedList가 상속받는 인터페이스

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(5);
		v.add(-1);
		v.add(2,100);	//인덱스 2번에 100삽입하고 원래 값 뒤로 미룸
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n= it.next();
			System.out.println(n);
		}
		int sum = 0;
		it = v.iterator(); 		// Iterator 객체 얻기
		while(it.hasNext()) {		//방문할 요소가 있으면 true 리턴
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
