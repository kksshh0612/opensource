package week_10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx_4 extends JFrame{
	private JLabel label = new JLabel("hello");
	
	public MouseListenerEx_4() {
		setTitle("마우스 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.addMouseListener(new MyMouseListener());
		
		container.setLayout(null);
		label.setSize(50, 20);
		label.setLocation(30, 30);
		container.add(label);
		setSize(250, 250);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		label.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx_4();

	}

}
