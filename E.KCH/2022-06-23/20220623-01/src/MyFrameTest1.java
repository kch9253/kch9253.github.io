import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		
		JButton button = new JButton("��ư1");
		JButton button2 = new JButton("��ư2");
		
		setLayout(new FlowLayout());
		add(button);
		add(button2);
				
		setVisible(true);
		
//		setLayout(new FlowLayout());
//		JButton button = new JButton("��ư");
//		this.add(button);
		
	}	
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
