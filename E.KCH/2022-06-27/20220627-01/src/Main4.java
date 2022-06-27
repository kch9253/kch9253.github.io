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
		Toolkit kit = Toolkit.getDefaultToolkit(); // �̹��� ������ ��������
		
		URL url = Main4.class.getClassLoader().getResource("images/1.png"); // �̹����� ã���ִ�Ŭ����
		ImageIcon image = new ImageIcon(kit.getImage(url));
		URL url2 = Main4.class.getClassLoader().getResource("images/2.png"); // �̹����� ã���ִ�Ŭ����
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
//		Image image = kit.getImage("1.png"); // �̹���Ŭ������ ����Ͽ� �����Ҽ��ְ� �����ص�
//		Image image2 = kit.getImage("2.png");
		
		JLabel lbl = new JLabel(image); // ImageIcon �̹��� ȣ��
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
