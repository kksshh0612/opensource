package week_9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class FlowLayoutEx_9_3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutEx_9_3 window = new FlowLayoutEx_9_3();
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
	public FlowLayoutEx_9_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 70, 40));		//버튼 사이 가로:70 세로:40
		
		JButton Add_Btn = new JButton("ADD");
		frame.getContentPane().add(Add_Btn);
		
		JButton Mul_Btn = new JButton("MUL");
		frame.getContentPane().add(Mul_Btn);
		
		JButton Div_Btn = new JButton("Div");
		frame.getContentPane().add(Div_Btn);
		
		JButton Sub_Btn = new JButton("SUB");
		frame.getContentPane().add(Sub_Btn);
		
		JButton Calc_Btn = new JButton("CALCULATION");
		frame.getContentPane().add(Calc_Btn);
	}

}
