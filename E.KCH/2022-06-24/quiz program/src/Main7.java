import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

public class Main7 extends JFrame {
	public Main7() {
		setSize(new Dimension(309, 238));
		setPreferredSize(new Dimension(300, 300));
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		pnlBottom.setPreferredSize(new Dimension(100, 100));
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		JTextField tf1 = new JTextField(30);
		JTextField tf2 = new JTextField(30);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();
				tf2.setText(text);
				JOptionPane.showMessageDialog(Main7.this, text);
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		getContentPane().add(pnlBox);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
