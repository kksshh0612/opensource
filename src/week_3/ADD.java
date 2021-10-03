package week_3;

import java.util.Scanner;
public class ADD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String []arr = new String[5];	//크기 5인 배열 생성
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();		//값 다섯개 입력
			try {
				sum += Integer.parseInt(arr[i]);
			}catch(NumberFormatException e) {		//number이 아니면
				arr[i] = "0";		//0으로 처리
				sum += Integer.parseInt(arr[i]);
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}
