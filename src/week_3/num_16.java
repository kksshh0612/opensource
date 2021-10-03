package week_3;

import java.util.Scanner;
public class num_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rsp[] = {"가위", "바위", "보"};
		String my_rsp;
		int idx = 0;
		//같은거 연속 내면 작동 안함 왜?????????
		System.out.println("컴퓨터와 가위바위보를 합니다");
		do {
			System.out.print("가위 바위 보!!!>> ");
			my_rsp = sc.next();
			idx = (int)(Math.random()*3);
			
			if(my_rsp.equals(rsp[idx])) {			//비겼을때
				System.out.println("사용자= " + my_rsp + ", 컴퓨터= " + rsp[idx] + ", 비겼습니다");
			}
			else if(my_rsp.equals("주먹")) {			//비기지 않고 내가 주먹 냈을 때
				if(rsp[idx].equals("가위")) {
					System.out.println("사용자= " + my_rsp + ", 컴퓨터= " + rsp[idx] + ", 이겼습니다");
				}
				else {
					System.out.println("사용자= " + my_rsp + ", 컴퓨터= " + rsp[idx] + ", 졌습니다");
				}
			}
			else if(my_rsp.equals("가위")) {			//비기지 않고 내가 가위 냈을 때
				if(rsp[idx].equals("보")) {
					System.out.println("사용자= " + my_rsp + ", 컴퓨터= " + rsp[idx] + ", 이겼습니다");
				}
				else {
					System.out.println("사용자= " + my_rsp + ", 컴퓨터= " + rsp[idx] + ", 졌습니다");
				}
			}
			else if(my_rsp.equals("보")) {			//비기지 않고 내가 보 냈을 때
				if(rsp[idx].equals("주먹")) {
					System.out.println("사용자= " + my_rsp + ", 컴퓨터= " + rsp[idx] + ", 이겼습니다");
				}
				else {
					System.out.println("사용자= " + my_rsp + ", 컴퓨터= " + rsp[idx] + ", 졌습니다");
				}
			}
			else if(!my_rsp.equals("그만")){			//가위바위보 아니고 그만이 아닐 때
				System.out.println("Wrong Input!!");		//예외처리. 잘못입력
			}
		}while(!my_rsp.equals("그만"));		//입력이 그만이 아닐때 반복
		
		sc.close();

	}

}
