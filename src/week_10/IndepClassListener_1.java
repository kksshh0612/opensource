package week_10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}

public class IndepClassListener_1 extends JFrame {
	public IndepClassListener_1() {		//생성자
		setTitle("이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//창 닫으면 프로그램도 종료
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action 리스너 달기
		container.add(btn);
		
		setSize(350, 150);
		setVisible(true); 
	}
	public static void main(String[] args) {
		new IndepClassListener_1();

	}

}
