package week_3;

import java.util.Scanner;
public class num_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rsp[] = {"����", "����", "��"};
		String my_rsp;
		int idx = 0;
		//������ ���� ���� �۵� ���� ��?????????
		System.out.println("��ǻ�Ϳ� ������������ �մϴ�");
		do {
			System.out.print("���� ���� ��!!!>> ");
			my_rsp = sc.next();
			idx = (int)(Math.random()*3);
			
			if(my_rsp.equals(rsp[idx])) {			//�������
				System.out.println("�����= " + my_rsp + ", ��ǻ��= " + rsp[idx] + ", �����ϴ�");
			}
			else if(my_rsp.equals("�ָ�")) {			//����� �ʰ� ���� �ָ� ���� ��
				if(rsp[idx].equals("����")) {
					System.out.println("�����= " + my_rsp + ", ��ǻ��= " + rsp[idx] + ", �̰���ϴ�");
				}
				else {
					System.out.println("�����= " + my_rsp + ", ��ǻ��= " + rsp[idx] + ", �����ϴ�");
				}
			}
			else if(my_rsp.equals("����")) {			//����� �ʰ� ���� ���� ���� ��
				if(rsp[idx].equals("��")) {
					System.out.println("�����= " + my_rsp + ", ��ǻ��= " + rsp[idx] + ", �̰���ϴ�");
				}
				else {
					System.out.println("�����= " + my_rsp + ", ��ǻ��= " + rsp[idx] + ", �����ϴ�");
				}
			}
			else if(my_rsp.equals("��")) {			//����� �ʰ� ���� �� ���� ��
				if(rsp[idx].equals("�ָ�")) {
					System.out.println("�����= " + my_rsp + ", ��ǻ��= " + rsp[idx] + ", �̰���ϴ�");
				}
				else {
					System.out.println("�����= " + my_rsp + ", ��ǻ��= " + rsp[idx] + ", �����ϴ�");
				}
			}
			else if(!my_rsp.equals("�׸�")){			//���������� �ƴϰ� �׸��� �ƴ� ��
				System.out.println("Wrong Input!!");		//����ó��. �߸��Է�
			}
		}while(!my_rsp.equals("�׸�"));		//�Է��� �׸��� �ƴҶ� �ݺ�
		
		sc.close();

	}

}
