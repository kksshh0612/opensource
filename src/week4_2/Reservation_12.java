package week4_2;
import java.util.Scanner;

class Seat {
	protected String S[] = new String[10];
	protected String A[] = new String[10];
	protected String B[] = new String[10];
	
	public Seat() {
		for(int i=0; i<S.length; i++) {		//디폴트 생성자. 모든 자리 ---으로 초기화
			S[i] = "---";
			A[i] = "---";
			B[i] = "---";
		}
	}
	
	public int select_row(Scanner sc) {
		System.out.print("좌석구분 S(1), A(2), B(3)>> ");
		int row = sc.nextInt();		//좌석 입력
		
		return row;
	}
	
	public String input_name(Scanner sc) {	//이름 입력
		System.out.print("이름>> ");
		String name = sc.next();
		
		return name;
	}

	public int input_seat(Scanner sc) {		//좌석 입력
		System.out.print("번호>> ");
		int seat_num = sc.nextInt();
		if(seat_num > 10) {
			System.out.println("잘못된 좌석 선택입니다. 1-10까지 선택하세요");
		}
		
		return seat_num;
	}

	public void print_row(int row) {		//해당 열 출력
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
	
	public void reserve(Scanner sc) {	//예약(1)
		int row = select_row(sc);
		if(row < 1 || row > 3) {
			System.out.println("잘못된 좌석 선택입니다. 1,2,3 중에서 선택하세요");
			return;
		}
		print_row(row);				//해당 줄 출력
		String name = input_name(sc);	//이름 입력
		int col = input_seat(sc);		//좌석 입력
		if(col < 1 || col > 10) {
			return;
		}
		
		switch (row) {
		case 1: {
			if(S[col-1].equals("---")) {	//빈 좌석이면
				S[col-1] = name;		//배열의 인덱스는 0부터, 좌석번호는 1부터
			}
			else {
				System.out.println("해당 좌석은 이미 예약되었습니다. 다른 좌석을 선택하세요");
			}
			break;
		}
		case 2: {
			if(A[col-1].equals("---")) {	//빈 좌석이면
				A[col-1] = name;		//배열의 인덱스는 0부터, 좌석번호는 1부터
			}
			else {
				System.out.println("해당 좌석은 이미 예약되었습니다. 다른 좌석을 선택하세요");
			}
			break;
		}
		case 3: {
			if(B[col-1].equals("---")) {	//빈 좌석이면
				B[col-1] = name;		//배열의 인덱스는 0부터, 좌석번호는 1부터
			}
			else {
				System.out.println("해당 좌석은 이미 예약되었습니다. 다른 좌석을 선택하세요");
			}
			break;
		}
		default:
			break;
		}
	}
	
	public void check_seat() {		//조회(2)
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
		
		System.out.println("<<<조회를 완료하였습니다>>>");
	}
	
	public void cancel(Scanner sc) {		//취소(3)
		int check = 0;
		int row = select_row(sc);
		
		if(row < 1 || row > 3) {
			System.out.println("잘못된 좌석 선택입니다. 1,2,3 중에서 선택하세요");
			return;
		}
		
		print_row(row);				//해당 줄 출력
		String name = input_name(sc);
		switch (row) {
		case 1: {
			for(int i=0; i<S.length; i++) {
				if(S[i].equals(name)) {
					S[i] = "---";		//예약자 이름 ---로 변경
					check  = 1;
				}
			}
			System.out.println();
			break;
		}
		case 2: {
			for(int i=0; i<A.length; i++) {
				if(A[i].equals(name)) {
					A[i] = "---";		//예약자 이름 ---로 변경
					check  = 1;
				}
			}
			System.out.println();
			break;
		}
		case 3: {
			for(int i=0; i<S.length; i++) {
				if(B[i].equals(name)) {
					B[i] = "---";		//예약자 이름 ---로 변경
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
			System.out.println("해당 인원을 찾지 못했습니다.");
		}
	}
	
}

public class Reservation_12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		Seat seat = new Seat();
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약: 1 / 조회: 2 / 취소: 3 / 종료: 4 >>>");
			menu = sc.nextInt();
			switch (menu) {
			case 1: {				//예약
				seat.reserve(sc);
				break;
			}
			case 2: {				//조회
				seat.check_seat();
				break;
			}
			case 3: {				//취소
				seat.cancel(sc);
				break;
			}
			case 4: {				//종료
				sc.close();
				return;
			}
			default:				//예외처리
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			}
		}
	}	

}
