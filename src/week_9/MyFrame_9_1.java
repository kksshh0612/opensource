package week_9;

import javax.swing.JFrame;

public class MyFrame_9_1 extends JFrame {
	public MyFrame_9_1() {
		setTitle("300X300 스윙 프레임 만들기");
		setSize(300, 300);
		setLocationRelativeTo(null);		//가운데 정렬
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame_9_1 frame = new MyFrame_9_1();

	}

}
