package week_3;

import java.util.Scanner;
public class num_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int check = 0;
		String course[] = {"java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 63, 55};
		do {
			System.out.print("�����̸�: ");
			str = sc.next();
			check = 0;
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(str)) {
					System.out.println(str + "�� ������ " + score[i]);
					check = 1;
				}
			}
			if(check==0) {
				System.out.println("���� �̸��Դϴ�");
			}
		}while(!str.equals("�׸�"));		//str�� "�׸�"�� �ƴҶ� �ݺ�
		sc.close();
	}

}
