package week4_2;
import java.util.Scanner;

class Phone {
	protected String name;
	protected int tel;
	
	public Phone() {
		name = "";
		tel = 0;
	}
	public Phone(String name, int tel) {
		this.name = name;
		this.tel = tel;
	}
	public void print_info() {
		System.out.println(name + "�� ��ȣ�� " + tel + "�Դϴ�.");
	}
}

public class PhoneBook_08 {

	public static void main(String[] args) {
		int people_num = 0;
		String name = "";
		int tel = 0;
		int check = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� ��>>");
		people_num = sc.nextInt();
		Phone phone[] = new Phone[people_num];		//��ü �迭 ����
		
		for(int i=0; i<phone.length; i++) {			//���� �Է�
			System.out.print("�̸��� ��ȭ��ȣ ���� ��ĭ���� �Է�>>");
			name = sc.next();
			tel = sc.nextInt();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�....");
		//�˻�
		while(true) {		//�Է°��� �׸��� �ƴҶ����� �ݺ�
			System.out.print("�˻��� �̸�>>> ");
			name = sc.next();
			if(name.equals("�׸�")) {		//�׸� �Է��ϸ� Ż��
				break;
			}
			check = 0;
			for(int i=0; i<phone.length; i++) {		//phone ��ü ����ŭ ���鼭 Ȯ��
				if(name.equals(phone[i].name)) {
					phone[i].print_info();
					check = 1;
				}
			}
			if(check == 0) {		//��ã������
				System.out.println(name + "��(��) �����ϴ�");
			}
		}
		
		sc.close();
	}
}
