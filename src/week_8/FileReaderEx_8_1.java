package week_8;

import java.io.*;
public class FileReaderEx_8_1 {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin=new FileReader("8-1.txt");
			int c;
			while((c=fin.read())!=-1) {		//read()�� ���� ���� �����ϸ� -1 ����
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
