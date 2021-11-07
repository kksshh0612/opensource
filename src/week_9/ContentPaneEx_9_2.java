package week_9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;

public class ContentPaneEx_9_2 {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContentPaneEx_9_2 window = new ContentPaneEx_9_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContentPaneEx_9_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton OK_Btn = new JButton("OK");
		OK_Btn.setBounds(34, 10, 97, 23);
		frame.getContentPane().add(OK_Btn);
		
		JButton Canel_Btn = new JButton("Cancel");
		Canel_Btn.setBounds(153, 10, 97, 23);
		frame.getContentPane().add(Canel_Btn);
		
		JButton Ignore_Btn = new JButton("Ignore");
		Ignore_Btn.setBounds(283, 10, 97, 23);
		frame.getContentPane().add(Ignore_Btn);
	}
}
