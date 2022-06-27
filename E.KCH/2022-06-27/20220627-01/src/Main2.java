import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main2 extends JFrame{
	public Main2() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("버튼");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 발생");
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {  // MouseAdapter = 추상클래스 / 마우스이벤트 전부 호출하지않고 필요한것만 사용하기위해
			@Override // 오버라이트를 통해 필요한 요소만 호출하여 사용하면됨
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 preessed");
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
