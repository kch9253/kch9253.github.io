import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Main {
	String[] number = {"구매선택" , "1회" , "2회" , "3회" , "4회" , "5회\t(최대)"};
    public static void main(String[] args) throws IOException {
    	
        new Main();
    }

    public Main() throws IOException {
    	
        BufferedImage bufferedImage = ImageIO.read(new File("D:\\E.KCH\\로또로고.png"));
        Image image = bufferedImage.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(image);
        
		JButton btn1 = new JButton("구매하기");
		JButton btn2 = new JButton("회원가입");
		JButton btn3 = new JButton("결과확인");
		JLabel jb = new JLabel(); // 회차출력
        JFrame frame = new JFrame();
        JComboBox jc = new JComboBox<>(number);      
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);

        JLabel jLabel = new JLabel();
        jLabel.setIcon(icon);
        frame.add(jc);
        frame.add(jb);
        frame.add(jLabel);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
       
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}