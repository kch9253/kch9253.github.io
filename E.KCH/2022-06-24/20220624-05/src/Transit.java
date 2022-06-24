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

public class Transit extends JFrame implements ActionListener{
	JButton b1;
	JTextField tf1, tf2;
	JPanel p1, p2, p3;
	JLabel l1, l2;
	
	
	public Transit() {
		setTitle("단위변환기");
		b1 = new JButton("변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();
		l1 = new JLabel("마일 입력");
		l2 = new JLabel("KM 값");
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		tf1 = new JTextField(5);
		tf2= new JTextField(5);
		p1.add(l1); p1.add(tf1);
		p2.add(l2);p2.add(tf2);
		p3.add(b1);
		add(BorderLayout.NORTH,p1);
		add(BorderLayout.CENTER,p3);
		add(BorderLayout.SOUTH,p2);
		tf1.addActionListener(this);
		b1.addActionListener(this);
		setSize(200,200);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double km = 1.6;
		try {
			double dap = Integer.parseInt(tf1.getText())*km;
			tf2.setText(String.valueOf(dap));	
		}catch(NumberFormatException a) {
			tf1.setText("숫자입력");
		}
	}
	public static void main(String[] args) {
		new Transit();

	}
}



	
	public static void main(String[] args) {
		Transit().setVisible(true);
	}





	private static JComponent Transit() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}