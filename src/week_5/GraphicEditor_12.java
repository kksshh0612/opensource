package week_5;

import java.util.Scanner;

abstract class Shape { 			//���� Ŭ����
	public Shape next;
	public Shape() { 
		next = null; 
	}
	public void setNext(Shape obj) {
		next = obj;
	}
	public Shape getNext() {	//��ü�� ��ȯ
		return next;
	}
	public void draw() {}
}

class Line extends Shape {
	public void draw() { 	// �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { 	// �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() { 	// �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class GraphicEditor_12 {
	protected Shape start = null;
	protected Shape end = null;
	
	public void insert(Scanner sc) {
		int n = 0;
		System.out.println("Line(1), Rect(2), Circle(3)>>>");
		n = sc.nextInt();
		
		Shape obj = null;
		
		switch (n) {
		case 1: {
			Line L = new Line();
			obj = L;	//��ĳ����
			break;
		}
		case 2: {
			Rect R = new Rect();
			obj = R;
			break;
		}
		case 3: {
			Circle C = new Circle();
			obj = C;
			break;
		}
		default: {
			System.out.println("�߸������ϼ̽��ϴ�");
			break;
		}
		}
		if(start == null) {		//����Ʈ�� �ƹ��͵� �ȵ����� ��
			start = obj;
			end = obj;
		}
		else {
			end.setNext(obj);
			end = obj;
		}
	}
		
	public boolean delete(Scanner sc) {
		int n = 0;
		System.out.println("������ ������ ��ġ>> ");
		n = sc.nextInt();
		
		Shape curr = start;
		Shape prev = start;
		
		if(start == null) {		//����Ʈ�� ����� ��
			return false;
		}
		for (int i=0; i<n; i++) {
			prev = curr;
			curr = curr.getNext(); 		//���� ���ҷ� �̵�
			if (curr == null) 			//�ε����� ����Ʈ ���� �������� ū ���
				return false;
		}
		if (start == end) { 		//����Ʈ�� ���Ұ� �Ѱ��ۿ� ���� ���
			start = end = null;
			return true;
		}
		if (curr == start) {		//ù��° ���Ҹ� �����ϴ� ���
			start = start.getNext(); //���� ���Ұ� ù��° ���Ұ� ��
		}
		else if (curr == end) {	//������ ���Ҹ� �����ϴ� ���
			end = prev; 		//���� ���Ұ� ������ ���Ұ� ��
			end.setNext(null);
		} 
		else {
			prev.setNext(curr.getNext()); // ���� ���Ҹ� ����Ʈ���� ����
		}
		return true;
		
	}
	public void showAll(Scanner sc) {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean loop = true;
		System.out.println("�׷��� ������ beauty�� �����մϴ�");
		
		//Shape start = null;
		//Shape end = null;
		
		GraphicEditor_12 GE = new GraphicEditor_12();
		do {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4)>>>");
			menu = sc.nextInt();
			switch (menu) {
			case 1: {
				GE.insert(sc);
				break;
			}
			case 2: {
				if(!GE.delete(sc)) {
					System.out.println("������ �� �����ϴ�");
				}
				break;
			}
			case 3: {
				Shape p = GE.start;
				while(p != null) {
					p.draw();
					p = p.getNext();
				}
				break;
			}
			case 4: {		//����
				System.out.println("beauty�� �����մϴ�");
				loop = false;
				break;
			}
			default:		//menu���� 1,2,3,4 �ܿ� ����ó��
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
		} while(loop);
	}
}

	
	
	
	
	
	