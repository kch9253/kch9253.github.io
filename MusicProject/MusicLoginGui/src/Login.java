import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Login extends JFrame implements MouseListener{
	private JTextField jt;
	private JTextField jt1;
	public Login() {
		
		super("WaterMelon");
		JPanel pnl = new JPanel();
		jt = new JTextField();
		jt1 = new JTextField();
		// jt.addMouseListener(this);
		JLabel jb = new JLabel("ID 입력:");
		JLabel jb1 = new JLabel("PW 입력:");
		JButton btn = new JButton("로그인");
		JButton btn1 = new JButton("회원가입"); // 누르면 회원가입창 뜨게 ㄱㄱ
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignUp dialog = new SignUp(Login.this);
				dialog.show();
			}
		});
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, btn1, 37, SpringLayout.SOUTH, jt);
		sl_pnl.putConstraint(SpringLayout.WEST, btn1, 210, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, btn1, -272, SpringLayout.SOUTH, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, btn1, -171, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, btn, 0, SpringLayout.NORTH, btn1);
		sl_pnl.putConstraint(SpringLayout.WEST, btn, 95, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, btn, -272, SpringLayout.SOUTH, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, btn, -19, SpringLayout.WEST, btn1);
		sl_pnl.putConstraint(SpringLayout.NORTH, jt, 30, SpringLayout.SOUTH, jt1);
		sl_pnl.putConstraint(SpringLayout.NORTH, jb1, 3, SpringLayout.NORTH, jt);
		sl_pnl.putConstraint(SpringLayout.EAST, jb1, -6, SpringLayout.WEST, jt);
		sl_pnl.putConstraint(SpringLayout.WEST, jt, 0, SpringLayout.WEST, jt1);
		sl_pnl.putConstraint(SpringLayout.EAST, jt, -171, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jb, 54, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, jb, -341, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jt1, -3, SpringLayout.NORTH, jb);
		sl_pnl.putConstraint(SpringLayout.WEST, jt1, 6, SpringLayout.EAST, jb);
		sl_pnl.putConstraint(SpringLayout.EAST, jt1, -171, SpringLayout.EAST, pnl);
		pnl.setLayout(sl_pnl);
		
		pnl.add(jt);
		pnl.add(jt1);
		pnl.add(btn);
		pnl.add(btn1);
		pnl.add(jb);
		pnl.add(jb1);
		getContentPane().add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			jt.setText("");
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

	public static void main(String[] args) {
		new Login().setVisible(true);
	}
}