import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame{
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
		
		JTextArea ta = new JTextArea(20,20); // 패널창안에 텍스트입력가능하게
		JScrollPane scr1 = new JScrollPane(ta); // 스크롤 생성
		
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
		add(scr1, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
				
			}
		});
		
		
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) { // 왼쪽 상단 텍스트입력 구간에 문자열이 무제한으로 입력받을수있게하는
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
				}
			}
		});
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
