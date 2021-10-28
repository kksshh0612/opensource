package week_7;

import java.util.*;
public class VectorCollection_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vec = new Vector<Integer>();
		
		while(true) {
			int sum = 0;
			System.out.print("강수량 입력(0입력시 종료)>>>");
			int rain = sc.nextInt();
			if(rain == 0) {		//종료
				break;
			}
			vec.add(rain);
			for(int i=0; i<vec.size(); i++) {
				sum +=vec.get(i);
			}
			System.out.println("현재 평균: " + sum/vec.size());
		}
		sc.close();
	}

}
