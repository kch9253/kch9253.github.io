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
	private String[] number = {"���ż���" , "1ȸ" , "2ȸ" , "3ȸ" , "4ȸ" , "5ȸ\t(�ִ�)"};

	public Main2() throws IOException {		
		setTitle("Lotto");
		BufferedImage bf = ImageIO.read(new File("D:\\E.KCH\\�ζǷΰ�.png"));
		Image image = bf.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon icon = new ImageIcon(image);
		
		
	
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("�����ϱ�");
		JButton btn2 = new JButton("ȸ������");
		JButton btn3 = new JButton("���Ȯ��");
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
	
