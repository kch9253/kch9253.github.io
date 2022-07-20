package Dialog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class ListPlzDialog2 extends JFrame implements ActionListener {
 
    public ListPlzDialog2() {
        setSize(500, 300);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize(); 
        setLocation(screenSize.width /2 - 250 ,screenSize.height/2 - 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel lbl = new JLabel("음악 목록 보기에서 재생할 음악을 선택해 주세요.");
        Font font = new Font("D2Coding", Font.BOLD, 20);
        lbl.setHorizontalAlignment((int)CENTER_ALIGNMENT);
        lbl.setFont(font);
        getContentPane().add(lbl, BorderLayout.CENTER);
        
        JButton btn = new JButton("확인");
        btn.addActionListener(this);
        getContentPane().add(btn, BorderLayout.SOUTH);
        
        setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        
    }
}
