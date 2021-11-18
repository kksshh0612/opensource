package week_10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener_2 extends JFrame {
	InnerClassListener_2() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		setSize(350, 150);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
		// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
		InnerClassListener_2.this.setTitle(b.getText()); 
		}
	}
	
	public static void main(String[] args) {
		new InnerClassListener_2();


	}

}
