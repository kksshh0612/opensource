package week_8;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_8_5 {

	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("8-5.out");
			for(int i=0; i<b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("����� ����");
			return;		//���α׷� ����
		}
		System.out.println("���� ����");
	}

}
