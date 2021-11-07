package week_8;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx_8_7 {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("8-7.txt");
			BufferedOutputStream out = new
					BufferedOutputStream(System.out, 5);
			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			// ���� �����Ͱ� ��� ��µ� ����
			new Scanner(System.in).nextLine();
			out.flush(); // ���ۿ� ���� �ִ� ���� ��� ���
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
