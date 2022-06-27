import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
		JTabbedPane tab = new JTabbedPane();
		tab.add("»¡°­", red);
		tab.add("ÆÄ¶û", blue);
		add(tab);
		
//		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, red, blue);
//		split.setDividerLocation(150);
//		add(split);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}