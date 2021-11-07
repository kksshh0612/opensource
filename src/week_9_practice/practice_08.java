package week_9_practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;

public class practice_08 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice_08 window = new practice_08();
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
	public practice_08() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 434, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uC5F4\uAE30");
		btnNewButton_1.setBounds(78, 5, 57, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB2EB\uAE30");
		btnNewButton_2.setBounds(182, 5, 57, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uB098\uAC00\uAE30");
		btnNewButton_3.setBounds(292, 5, 69, 23);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 212, 434, 49);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("word input");
		btnNewButton.setBounds(28, 10, 97, 23);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(137, 11, 285, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 32, 434, 181);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setSize(10, 10);
			lblNewLabel.setLocation(x, y);
			lblNewLabel.setBackground(Color.BLUE);
			lblNewLabel.setOpaque(true);
			panel_2.add(lblNewLabel);
			
		}
	}
}
