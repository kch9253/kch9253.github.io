import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private int x;
	private int y;
	
	public Main() {
		JPanel pnl = new JPanel(null);
		JLabel lbl = new JLabel("입력");
		x = 100;
		y = 100;
		lbl.setBounds(x,y,50,50);
		
		pnl.add(lbl);
		
		add(pnl);
		
		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				if (code == KeyEvent.VK_LEFT) {
					System.out.println("왼쪽 화살표 누름");
					x -= 5;
				} else if (code == KeyEvent.VK_RIGHT) {
					x += 5;
				} else if (code == KeyEvent.VK_UP) {
					y -= 5;
				} else if (code == KeyEvent.VK_DOWN) {
					y += 5;
				}
				lbl.setLocation(x , y); // 화살표 방향이 움직이도록하는
//				char c = e.getKeyChar();
//				lbl.setText(String.valueOf(c));
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}