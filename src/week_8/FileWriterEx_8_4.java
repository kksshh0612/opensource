package week_8;

import java.io.*;
import java.util.*;
public class FileWriterEx_8_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("8-2.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length()==0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println("����� ����");
		}
		sc.close();
	}

}
