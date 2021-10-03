package week4_2;
import java.util.Scanner;

class Seat {
	protected String S[] = new String[10];
	protected String A[] = new String[10];
	protected String B[] = new String[10];
	
	public Seat() {
		for(int i=0; i<S.length; i++) {		//����Ʈ ������. ��� �ڸ� ---���� �ʱ�ȭ
			S[i] = "---";
			A[i] = "---";
			B[i] = "---";
		}
	}
	
	public int select_row(Scanner sc) {
		System.out.print("�¼����� S(1), A(2), B(3)>> ");
		int row = sc.nextInt();		//�¼� �Է�
		
		return row;
	}
	
	public String input_name(Scanner sc) {	//�̸� �Է�
		System.out.print("�̸�>> ");
		String name = sc.next();
		
		return name;
	}

	public int input_seat(Scanner sc) {		//�¼� �Է�
		System.out.print("��ȣ>> ");
		int seat_num = sc.nextInt();
		if(seat_num > 10) {
			System.out.println("�߸��� �¼� �����Դϴ�. 1-10���� �����ϼ���");
		}
		
		return seat_num;
	}

	public void print_row(int row) {		//�ش� �� ���
		switch (row) {
		case 1: {
			System.out.print("S>> ");
			for(int i=0; i<S.length; i++) {
				System.out.print(S[i] + " ");
			}
			break;
		}
		case 2: {
			System.out.print("A>> ");
			for(int i=0; i<A.length; i++) {
				System.out.print(A[i] + " ");
			}
			break;
		}
		case 3: {
			System.out.print("B>> ");
			for(int i=0; i<B.length; i++) {
				System.out.print(B[i] + " ");
			}
			break;
		}
		default:
			break;
		}
	}
	
	public void reserve(Scanner sc) {	//����(1)
		int row = select_row(sc);
		if(row < 1 || row > 3) {
			System.out.println("�߸��� �¼� �����Դϴ�. 1,2,3 �߿��� �����ϼ���");
			return;
		}
		print_row(row);				//�ش� �� ���
		String name = input_name(sc);	//�̸� �Է�
		int col = input_seat(sc);		//�¼� �Է�
		if(col < 1 || col > 10) {
			return;
		}
		
		switch (row) {
		case 1: {
			if(S[col-1].equals("---")) {	//�� �¼��̸�
				S[col-1] = name;		//�迭�� �ε����� 0����, �¼���ȣ�� 1����
			}
			else {
				System.out.println("�ش� �¼��� �̹� ����Ǿ����ϴ�. �ٸ� �¼��� �����ϼ���");
			}
			break;
		}
		case 2: {
			if(A[col-1].equals("---")) {	//�� �¼��̸�
				A[col-1] = name;		//�迭�� �ε����� 0����, �¼���ȣ�� 1����
			}
			else {
				System.out.println("�ش� �¼��� �̹� ����Ǿ����ϴ�. �ٸ� �¼��� �����ϼ���");
			}
			break;
		}
		case 3: {
			if(B[col-1].equals("---")) {	//�� �¼��̸�
				B[col-1] = name;		//�迭�� �ε����� 0����, �¼���ȣ�� 1����
			}
			else {
				System.out.println("�ش� �¼��� �̹� ����Ǿ����ϴ�. �ٸ� �¼��� �����ϼ���");
			}
			break;
		}
		default:
			break;
		}
	}
	
	public void check_seat() {		//��ȸ(2)
		System.out.print("S>> ");
		for(int i=0; i<S.length; i++) {
			System.out.print(S[i] + " ");
		}
		System.out.println();
		
		System.out.print("A>> ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		System.out.print("B>> ");
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�>>>");
	}
	
	public void cancel(Scanner sc) {		//���(3)
		int check = 0;
		int row = select_row(sc);
		
		if(row < 1 || row > 3) {
			System.out.println("�߸��� �¼� �����Դϴ�. 1,2,3 �߿��� �����ϼ���");
			return;
		}
		
		print_row(row);				//�ش� �� ���
		String name = input_name(sc);
		switch (row) {
		case 1: {
			for(int i=0; i<S.length; i++) {
				if(S[i].equals(name)) {
					S[i] = "---";		//������ �̸� ---�� ����
					check  = 1;
				}
			}
			System.out.println();
			break;
		}
		case 2: {
			for(int i=0; i<A.length; i++) {
				if(A[i].equals(name)) {
					A[i] = "---";		//������ �̸� ---�� ����
					check  = 1;
				}
			}
			System.out.println();
			break;
		}
		case 3: {
			for(int i=0; i<S.length; i++) {
				if(B[i].equals(name)) {
					B[i] = "---";		//������ �̸� ---�� ����
					check  = 1;
				}
			}
			System.out.println();
			break;
		}
		default:
			break;
		}
		if(check == 0) {
			System.out.println("�ش� �ο��� ã�� ���߽��ϴ�.");
		}
	}
	
}

public class Reservation_12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		Seat seat = new Seat();
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		while(true) {
			System.out.print("����: 1 / ��ȸ: 2 / ���: 3 / ����: 4 >>>");
			menu = sc.nextInt();
			switch (menu) {
			case 1: {				//����
				seat.reserve(sc);
				break;
			}
			case 2: {				//��ȸ
				seat.check_seat();
				break;
			}
			case 3: {				//���
				seat.cancel(sc);
				break;
			}
			case 4: {				//����
				sc.close();
				return;
			}
			default:				//����ó��
				System.out.println("�߸��� �޴� �����Դϴ�.");
				break;
			}
		}
	}	

}
