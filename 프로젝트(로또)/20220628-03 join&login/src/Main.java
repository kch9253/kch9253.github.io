import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

// 텍스트 필드에 클릭했을때 초기화되어야함

public class Main extends JFrame implements MouseListener{
	private JTextField jt;

	public Main() {
				
		setTitle("Login");
		JPanel pnl = new JPanel();
		jt = new JTextField("");
//		jt.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		JLabel jb = new JLabel("ID입력 :");
		JButton btn = new JButton("로그인");
		JButton btn1 = new JButton("회원가입");
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.WEST, jt, 8, SpringLayout.EAST, jb);
		sl_pnl.putConstraint(SpringLayout.EAST, jt, -49, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jb, 7, SpringLayout.NORTH, jt);
		sl_pnl.putConstraint(SpringLayout.WEST, jb, 0, SpringLayout.WEST, btn);
		sl_pnl.putConstraint(SpringLayout.NORTH, btn1, 6, SpringLayout.SOUTH, jt);
		sl_pnl.putConstraint(SpringLayout.SOUTH, btn1, -25, SpringLayout.SOUTH, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, btn, 6, SpringLayout.SOUTH, jt);
		sl_pnl.putConstraint(SpringLayout.SOUTH, btn, -25, SpringLayout.SOUTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, btn1, 170, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, btn1, -49, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, btn, 42, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, btn, -13, SpringLayout.WEST, btn1);
		sl_pnl.putConstraint(SpringLayout.SOUTH, jt, -60, SpringLayout.SOUTH, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jt, 22, SpringLayout.NORTH, pnl);
		pnl.setLayout(sl_pnl);
		
		pnl.add(jt);
		pnl.add(btn);
		pnl.add(btn1);
		pnl.add(jb);
		
		getContentPane().add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 150);
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			jt.setText("");
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}



	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
}