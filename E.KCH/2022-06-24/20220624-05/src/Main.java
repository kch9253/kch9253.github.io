import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
	JButton b1;
	JTextField tf1, tf2, tf3;
	JPanel p1, p2, p3, p4;
	JLabel l1, l3, l2;

	public Main() {
		setTitle("단위변환기");
		b1 = new JButton("변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		l1 = new JLabel("cm 입력");
		l2 = new JLabel("inch 입력");
		l3 = new JLabel("값"); // b1 - p3
		p1 = new JPanel(); // l1 - p1
		p2 = new JPanel(); // l2 -
		p3 = new JPanel(); // l3 - p2
		p4 = new JPanel();
		tf1 = new JTextField(5);
		tf2 = new JTextField(5);
		tf3 = new JTextField(10);

		p1.add(b1); // 변환

		p2.add(l1); // = cm 입력
		p2.add(tf1);

		p3.add(l2); // = inch 입력
		p3.add(tf2);

		p4.add(l3); // = 값출력
		p4.add(tf3);

		add(BorderLayout.CENTER, p1); // 변환
		add(BorderLayout.SOUTH, p4); // 값출력
		add(BorderLayout.EAST, p3); // inch 입력
		add(BorderLayout.WEST, p2); // cm 입력
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		b1.addActionListener(this);
		setSize(350, 150);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(tf1.getText().length());
		if (tf1.getText().length() > 0) {
			double cm = 2.54;
			try {
				double dap = Integer.parseInt(tf1.getText()) * cm % 1000;
				String dapText = String.format("%.10f", dap); // .10 = 소수점 나타내는자리수
				tf3.setText(dapText);
				tf1.setText("");
			} catch (NumberFormatException a) {
				tf1.setText("숫자입력");
				
			}
		} else {
			double inch = 0.3937;
			try {
				double dap1 = Integer.parseInt(tf2.getText()) * inch % 1000;
				String dap1Text = String.format("%.10f", dap1); // 소수점 자리를 나타내기위해 지정한값
				tf3.setText(dap1Text);
				tf2.setText("");	
			} catch (NumberFormatException c) {
				tf2.setText("숫자입력");
			}
		}

	}

	public static void main(String[] args) {
		new Main();

	}
}