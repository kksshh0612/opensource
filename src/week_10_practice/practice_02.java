package week_10_practice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class practice_02 extends JFrame{
	private JPanel panel = new JPanel();
	
	public practice_02() {
		setTitle("드래그 되는 동안 노란배경");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		panel.setBackground(Color.GREEN);	//배경색 초록으로
		panel.addMouseMotionListener(new MyMouseMotionAdapter());
		panel.addMouseListener(new MyMouseAdapter());
		setSize(400, 400);
		setVisible(true);
		
	}
	class MyMouseMotionAdapter extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			panel.setBackground(Color.YELLOW);
		}
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new practice_02(); 

	}

}
