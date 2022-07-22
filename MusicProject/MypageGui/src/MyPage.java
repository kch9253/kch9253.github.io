import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MyPage extends JFrame implements MouseListener {
	private JLabel jl; // ID라벨
	private JLabel jl1; // 이름라벨
	private JTextField jt; // ID 
	private JTextField jt1; // 이름
	private JButton jb; // 비밀번호변경
	private JButton jb1; // 회원탈퇴
	
	public MyPage() {
		super("MyPage");
		
		JPanel pnl = new JPanel();
		jl = new JLabel("회원ID: ");
		jl1 = new JLabel("회원이름: ");
		jt = new JTextField("id텍스트");
		jt1 = new JTextField("이름텍스트");
		jb = new JButton("비밀번호변경"); // 누르면 비번변경 서브창 떠야함
		jb1 = new JButton("회원탈퇴"); // 누르면 회원탈퇴 서브창 떠야함
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PasswordChange dialog = new PasswordChange(MyPage.this); // 비번변경 서브창 생성
				dialog.show();
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserWithdrawal dialog1 = new UserWithdrawal(MyPage.this); // 회원탈퇴 서브창 생성
				dialog1.show();
			}
		});
		
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, jb, 48, SpringLayout.SOUTH, jl1);
		sl_pnl.putConstraint(SpringLayout.WEST, jb1, 31, SpringLayout.EAST, jb);
		sl_pnl.putConstraint(SpringLayout.EAST, jb1, -143, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, jb, 15, SpringLayout.EAST, jl);
		sl_pnl.putConstraint(SpringLayout.WEST, jb, 70, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jb1, 45, SpringLayout.SOUTH, jt1);
		sl_pnl.putConstraint(SpringLayout.NORTH, jt1, 18, SpringLayout.SOUTH, jt);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl1, 3, SpringLayout.NORTH, jt1);
		sl_pnl.putConstraint(SpringLayout.EAST, jl1, 0, SpringLayout.EAST, jl);
		sl_pnl.putConstraint(SpringLayout.EAST, jt1, 0, SpringLayout.EAST, jt);
		sl_pnl.putConstraint(SpringLayout.WEST, jt1, 0, SpringLayout.WEST, jt);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl, 68, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, jl, -19, SpringLayout.WEST, jt);
		sl_pnl.putConstraint(SpringLayout.NORTH, jt, 65, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, jt, 194, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, jt, -158, SpringLayout.EAST, pnl);
		pnl.setLayout(sl_pnl);
		
		pnl.add(jl);
		pnl.add(jl1);
		pnl.add(jt);
		pnl.add(jt1);
		pnl.add(jb);
		pnl.add(jb1);
		getContentPane().add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
	
public static void main(String[] args) {
			new MyPage().setVisible(true);
	}
	

	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}


		
	


