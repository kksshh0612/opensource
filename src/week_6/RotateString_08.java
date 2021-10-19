package week_6;

import java.util.Scanner;
public class RotateString_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.println("문자열을 입력하세요. 빈칸이나 한글, 영어 모두 됩니다.");
		str = sc.nextLine();		//공백 포함 문자열 한줄 입력
		
		for(int i = 1; i <= str.length() ;i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0, i));
		}
		sc.close();
	}

}
