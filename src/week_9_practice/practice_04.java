package week_9_practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;

public class practice_04 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice_04 window = new practice_04();
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
	public practice_04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setBackground(Color.RED);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.setBackground(Color.PINK);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.setBackground(Color.ORANGE);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(Color.GREEN);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.setBackground(Color.YELLOW);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("6");
		btnNewButton_2.setBackground(Color.MAGENTA);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setBackground(Color.CYAN);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("8");
		btnNewButton.setBackground(Color.BLUE);
		frame.getContentPane().add(btnNewButton);
	}

}
