import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {
	public Main6() {
		JPanel pnl = new JPanel();
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
//		pnl.setLayout(flow);
//		BorderLayout border = new BorderLayout();
//		pnl.setLayout(border);
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
//		pnl.setLayout(box);
//		GridLayout grid = new GridLayout(2, 2);
//		pnl.setLayout(grid);
		pnl.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		btn1.setLocation(10, 30);
		btn1.setSize(200, 300);
		
		btn2.setBounds(220, 50, 90, 40);
		
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
//		pnl.add(btn3, "South");
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
