package week_9_practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class practice_06 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice_06 window = new practice_06();
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
	public practice_06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		for(int i=0; i<20; i++) {
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setSize(10, 10);
			lblNewLabel.setLocation(x, y);
			lblNewLabel.setBackground(Color.BLUE);
			lblNewLabel.setOpaque(true);
			frame.getContentPane().add(lblNewLabel);
			
		}
		
	}
}
