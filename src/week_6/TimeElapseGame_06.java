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
		System.out.println("\t���� �� �ð� = "+ now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}
	public int game() {
		System.out.println(name+" ���� <Enter>Ű ");
		sec1 = enter();
		System.out.print("10�� ���� �� <Enter>Ű ");
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
		
		Player player1 = new Player("Ȳ����");
		Player player2 = new Player("���繮");
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		result1 = player1.game();
		result2 = player2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println("Ȳ������ ��� "+result1+", ���繮�� ��� "+result2+", ���ڴ� Ȳ����");
		else
			System.out.println("Ȳ������ ��� "+result1+", ���繮�� ��� "+result2+", ���ڴ� ���繮");
	}

}
