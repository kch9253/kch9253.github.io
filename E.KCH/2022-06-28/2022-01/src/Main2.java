import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Main2 extends JFrame{
	private String[] number = {"구매선택" , "1회" , "2회" , "3회" , "4회" , "5회\t(최대)"};

	public Main2() throws IOException {		
		setTitle("Lotto");
		BufferedImage bf = ImageIO.read(new File("D:\\E.KCH\\로또로고.png"));
		Image image = bf.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon icon = new ImageIcon(image);
		
		
	
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("구매하기");
		JButton btn2 = new JButton("회원가입");
		JButton btn3 = new JButton("결과확인");
		JLabel jb = new JLabel();
		JComboBox jc = new JComboBox<>(number);
		
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

}
	
