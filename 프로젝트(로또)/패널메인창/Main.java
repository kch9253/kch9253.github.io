import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Main extends JFrame  {
	private String[] number = {"구매선택" , "1회" , "2회" , "3회" , "4회" , "5회\t(최대)"};
	public void size(Graphics g) {	
	}
	public Main() {		
		setTitle("Lotto");
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("구매하기");
		JButton btn2 = new JButton("회원가입");
		JButton btn3 = new JButton("결과확인");
		JLabel jb = new JLabel();
		JComboBox jc = new JComboBox<>(number);
		
		Toolkit kit = Toolkit.getDefaultToolkit(); // 이미지 파일을 가져오는
		
		URL url = Main.class.getClassLoader().getResource("image/로또로고.png"); // 이미지를 찾아주는클래스
		Image image = kit.getImage(url);
		
		image = image.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon icon = new ImageIcon(image);
		
		JLabel lbl = new JLabel(icon); // ImageIcon 이미지 호출
		pnl.add(lbl);
		
		pnl.setBackground(Color.white);
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
		pnl.add(jb);
		pnl.add(jc);
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}