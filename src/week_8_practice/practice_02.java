package week_8_practice;

import java.io.*;
public class practice_02 {

	public static void main(String[] args) {
		
		File file = new File("phone.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			System.out.println(file.getPath() + "를 출력합니다.");
			while(true) {
				String line = br.readLine();
				if(line == null) // end of file
					break;
				System.out.print(line+"\n");
			}
			br.close();
		} 
		catch (IOException e) { // 파일을 저장할 수 없는 경우 예외
			e.printStackTrace();
		}

	}

}



