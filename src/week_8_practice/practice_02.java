package week_8_practice;

import java.io.*;
public class practice_02 {

	public static void main(String[] args) {
		
		File file = new File("phone.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			System.out.println(file.getPath() + "�� ����մϴ�.");
			while(true) {
				String line = br.readLine();
				if(line == null) // end of file
					break;
				System.out.print(line+"\n");
			}
			br.close();
		} 
		catch (IOException e) { // ������ ������ �� ���� ��� ����
			e.printStackTrace();
		}

	}

}



