package week_3;

import java.util.Scanner;
public class num_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int check = 0;
		String course[] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 63, 55};
		do {
			System.out.print("과목이름: ");
			str = sc.next();
			check = 0;
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(str)) {
					System.out.println(str + "의 점수는 " + score[i]);
					check = 1;
				}
			}
			if(check==0) {
				System.out.println("없는 이름입니다");
			}
		}while(!str.equals("그만"));		//str이 "그만"이 아닐때 반복
		sc.close();
	}

}
