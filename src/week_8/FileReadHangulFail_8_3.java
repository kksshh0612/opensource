package week_8;

import java.io.*;
public class FileReadHangulFail_8_3 {

	public static void main(String[] args) {
		FileInputStream fin=null;
		InputStreamReader in = null;
		try {
			fin = new FileInputStream("8-2.txt");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
	}
	
}



