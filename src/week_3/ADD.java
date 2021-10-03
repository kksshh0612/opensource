package week_3;

import java.util.Scanner;
public class ADD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String []arr = new String[5];	//ũ�� 5�� �迭 ����
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();		//�� �ټ��� �Է�
			try {
				sum += Integer.parseInt(arr[i]);
			}catch(NumberFormatException e) {		//number�� �ƴϸ�
				arr[i] = "0";		//0���� ó��
				sum += Integer.parseInt(arr[i]);
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}
