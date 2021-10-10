package week_5;

import java.util.Scanner;

abstract class Shape { 			//슈퍼 클래스
	public Shape next;
	public Shape() { 
		next = null; 
	}
	public void setNext(Shape obj) {
		next = obj;
	}
	public Shape getNext() {	//객체를 반환
		return next;
	}
	public void draw() {}
}

class Line extends Shape {
	public void draw() { 	// 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { 	// 메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() { 	// 메소드 오버라이딩
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
			obj = L;	//업캐스팅
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
			System.out.println("잘못선택하셨습니다");
			break;
		}
		}
		if(start == null) {		//리스트에 아무것도 안들어가있을 때
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
		System.out.println("삭제할 도형의 위치>> ");
		n = sc.nextInt();
		
		Shape curr = start;
		Shape prev = start;
		
		if(start == null) {		//리스트가 비었을 때
			return false;
		}
		for (int i=0; i<n; i++) {
			prev = curr;
			curr = curr.getNext(); 		//다음 원소로 이동
			if (curr == null) 			//인덱스가 리스트 원소 갯수보다 큰 경우
				return false;
		}
		if (start == end) { 		//리스트에 원소가 한개밖에 없는 경우
			start = end = null;
			return true;
		}
		if (curr == start) {		//첫번째 원소를 삭제하는 경우
			start = start.getNext(); //다음 원소가 첫번째 원소가 됨
		}
		else if (curr == end) {	//마지막 원소를 삭제하는 경우
			end = prev; 		//이전 원소가 마지막 원소가 됨
			end.setNext(null);
		} 
		else {
			prev.setNext(curr.getNext()); // 현재 원소를 리스트에서 삭제
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
		System.out.println("그래픽 에디터 beauty를 실행합니다");
		
		//Shape start = null;
		//Shape end = null;
		
		GraphicEditor_12 GE = new GraphicEditor_12();
		do {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>>");
			menu = sc.nextInt();
			switch (menu) {
			case 1: {
				GE.insert(sc);
				break;
			}
			case 2: {
				if(!GE.delete(sc)) {
					System.out.println("삭제할 수 없습니다");
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
			case 4: {		//종료
				System.out.println("beauty를 종료합니다");
				loop = false;
				break;
			}
			default:		//menu값에 1,2,3,4 외에 예외처리
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
		} while(loop);
	}
}

	
	
	
	
	
	