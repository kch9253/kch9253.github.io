import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame{
	private int number = 0;
	public MyCounter() {
		super("ī����");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("����");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				lbl.setText(String.valueOf(number));
			}
		});
		
		JButton btn2 = new JButton("����");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));
			}
		});
		
		
		pnl.add(btn2);
		pnl.add(lbl);
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}

}
