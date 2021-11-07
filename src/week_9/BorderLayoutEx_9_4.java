package week_9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorderLayoutEx_9_4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutEx_9_4 window = new BorderLayoutEx_9_4();
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
	public BorderLayoutEx_9_4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(20, 20));
		
		JButton Add_Btn = new JButton("Add");
		frame.getContentPane().add(Add_Btn, BorderLayout.NORTH);
		
		JButton Mul_Btn = new JButton("Mul");
		frame.getContentPane().add(Mul_Btn, BorderLayout.WEST);
		
		JButton Clac_Btn = new JButton("Calculation");
		frame.getContentPane().add(Clac_Btn, BorderLayout.CENTER);
		
		JButton Div_Btn = new JButton("Div");
		frame.getContentPane().add(Div_Btn, BorderLayout.EAST);
		
		JButton Sub_Btn = new JButton("Sub");
		Sub_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(Sub_Btn, BorderLayout.SOUTH);
	}

}
