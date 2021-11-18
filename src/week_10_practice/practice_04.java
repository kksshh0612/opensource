package week_10_practice;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class practice_04 extends JFrame {
	JLabel label;
	String text = "love java";
	
	public practice_04() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Love Java");
		c.add(j);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					String text=j.getText();
					j.setText(text.substring(1)+text.charAt(0));
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				String text=label.getText();
				label.setText(text.substring(1)+text.charAt(0));
			}
		}
	}
	public static void main(String[] args) {
		new practice_04(); 
	}
}
