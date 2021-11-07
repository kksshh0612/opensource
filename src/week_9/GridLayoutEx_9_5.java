package week_9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx_9_5 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutEx_9_5 window = new GridLayoutEx_9_5();
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
	public GridLayoutEx_9_5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 5, 4, 2));

		
		JLabel Name_Label = new JLabel("\uC774\uB984");
		frame.getContentPane().add(Name_Label);
		
		textField = new JTextField();
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel StudentCode_Label = new JLabel("\uD559\uBC88");
		frame.getContentPane().add(StudentCode_Label);
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Major_Label = new JLabel("\uD559\uACFC");
		frame.getContentPane().add(Major_Label);
		
		textField_3 = new JTextField();
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel Subject_Label = new JLabel("\uACFC\uBAA9");
		frame.getContentPane().add(Subject_Label);
		
		textField_2 = new JTextField();
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}

}
