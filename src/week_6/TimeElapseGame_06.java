package week_6;

import java.util.Calendar;
import java.util.Scanner;

class Player {
	Calendar now = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	protected String name, arr;
	protected int sec1, sec2;
	
	public Player(String name) {
		this.name = name;
	}
	public int enter() {
		arr = sc.nextLine();
		now = Calendar.getInstance();		
		System.out.println("\t현재 초 시간 = "+ now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}
	public int game() {
		System.out.println(name+" 시작 <Enter>키 ");
		sec1 = enter();
		System.out.print("10초 예상 후 <Enter>키 ");
		sec2 = enter();
		if(sec1 < sec2) {
			return sec2-sec1;
		}
		else {
			return (60-sec1) + sec2;
		}
	}
}

public class TimeElapseGame_06 {

	public static void main(String[] args) {
		int result1 = 0, result2 = 0;
		
		Player player1 = new Player("황기태");
		Player player2 = new Player("이재문");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		result1 = player1.game();
		result2 = player2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 황기태");
		else
			System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 이재문");
	}

}
