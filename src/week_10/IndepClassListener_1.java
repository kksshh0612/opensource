package week_10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}

public class IndepClassListener_1 extends JFrame {
	public IndepClassListener_1() {		//������
		setTitle("�̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//â ������ ���α׷��� ����
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action ������ �ޱ�
		container.add(btn);
		
		setSize(350, 150);
		setVisible(true); 
	}
	public static void main(String[] args) {
		new IndepClassListener_1();

	}

}
