package week_10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx_7 extends JFrame{
	private JLabel label = new JLabel();
	
	public KeyCodeEx_7() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(label);
		setSize(300,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		Container d = getContentPane();
		public void keyPressed(KeyEvent e) {
			label.setText(e.getKeyText(e.getKeyCode()));
		
		if(e.getKeyChar() == '%')
			d.setBackground(Color.YELLOW);
		else if(e.getKeyCode() == KeyEvent.VK_F1)
			d.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new KeyCodeEx_7();

	}

}
