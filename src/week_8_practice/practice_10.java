package week_8_practice;

import java.io.*;
import java.util.*;
public class practice_10 {

	private String fileName = "phone.txt";
	private HashMap<String, String> phoneMap = new HashMap<String, String>();
	
	public practice_10() { }

	private void readPhoneFile() {
		try {
			Scanner fScanner = new Scanner(new FileReader(new File(fileName)));
			while(fScanner.hasNext()) {
				String name = fScanner.next(); // �̸� �б�
				String tel = fScanner.next(); // ��ȭ��ȣ �б�
				phoneMap.put(name, tel); // �ؽøʿ� ����
			}			
			fScanner.close();	
		} 
		catch (IOException e) { // ������ ������ �� ���� ��� ����
			e.printStackTrace();
		}
		
		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
	}
	
	private void processQuery() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�̸�>> ");
			String name = scanner.next(); // �̸� �Է�
			if(name.equals("�׸�"))
				break;
			String tel = phoneMap.get(name);
			if(tel == null) {
				System.out.println("ã�� �̸��� �����ϴ�.");			
			}
			else{
				System.out.println(tel);
			}
		}

		scanner.close();
	}
	
	public void run() {
		readPhoneFile();
		processQuery();
	}
	
	public static void main(String[] args) {
		practice_10 phoneExplorer = new practice_10();
		phoneExplorer.run();

	}

}