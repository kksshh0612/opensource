package week_5;

class Point {
	private int x, y; 		//private는 Point클래스 내부에서만 사용. 서브클래스에서도 접근 불가
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color; // 점의 색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}

public class ColorPointEx_5_1 {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);		//ColorPoint의 슈퍼클래스 Point의 함수
		cp.setColor("red");
		cp.showColorPoint();
	}

}
