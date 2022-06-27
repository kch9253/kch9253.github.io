import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit(); // 이미지 파일을 가져오는
		
		URL url = Main4.class.getClassLoader().getResource("images/1.png"); // 이미지를 찾아주는클래스
		ImageIcon image = new ImageIcon(kit.getImage(url));
		URL url2 = Main4.class.getClassLoader().getResource("images/2.png"); // 이미지를 찾아주는클래스
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
//		Image image = kit.getImage("1.png"); // 이미지클래스를 사용하여 참조할수있게 설정해둠
//		Image image2 = kit.getImage("2.png");
		
		JLabel lbl = new JLabel(image); // ImageIcon 이미지 호출
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(image2);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
