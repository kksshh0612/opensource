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
		System.out.println(name + "의 번호는 " + tel + "입니다.");
	}
}

public class PhoneBook_08 {

	public static void main(String[] args) {
		int people_num = 0;
		String name = "";
		int tel = 0;
		int check = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수>>");
		people_num = sc.nextInt();
		Phone phone[] = new Phone[people_num];		//객체 배열 생성
		
		for(int i=0; i<phone.length; i++) {			//정보 입력
			System.out.print("이름와 전화번호 각각 빈칸없이 입력>>");
			name = sc.next();
			tel = sc.nextInt();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다....");
		//검색
		while(true) {		//입력값이 그만이 아닐때까지 반복
			System.out.print("검색할 이름>>> ");
			name = sc.next();
			if(name.equals("그만")) {		//그만 입력하면 탈출
				break;
			}
			check = 0;
			for(int i=0; i<phone.length; i++) {		//phone 객체 수만큼 돌면서 확인
				if(name.equals(phone[i].name)) {
					phone[i].print_info();
					check = 1;
				}
			}
			if(check == 0) {		//못찾았을때
				System.out.println(name + "이(가) 없습니다");
			}
		}
		
		sc.close();
	}
}
