import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

// 회원탈퇴 서브창
class UserWithdrawal extends JDialog implements MouseListener {
	private JTextField jt; // 기존 pw입력 텍스트필드
	private JTextField jt1; // 새 pw입력 텍스트필드
	private JTextField jt2; // 새 pw재입력 텍스트필드
	private JLabel jl; // 기존 pw입력 
	private JLabel jl1; // 새 pw입력
	private JLabel jl2; // 새 pw재입력
	private JButton jb; // 변경완료 버튼
	private JButton jb1; // 돌아가기버튼
	
	public UserWithdrawal(JFrame owner) {
		super(owner, true);
		setTitle("회원탈퇴");
		
		JPanel jpnl = new JPanel();
		jt = new JTextField("ID입력");
		jt1 = new JTextField("PW입력");
		jt2 = new JTextField("PW재확인");
		jl = new JLabel("아이디: ");
		jl1 = new JLabel("패스워드: ");
		jl2 = new JLabel("패스워드 확인: ");
		jb = new JButton("탈퇴하기");
		jb1 = new JButton("돌아가기");
		SpringLayout sl_jpnl = new SpringLayout();
		sl_jpnl.putConstraint(SpringLayout.NORTH, jl2, 3, SpringLayout.NORTH, jt2);
		sl_jpnl.putConstraint(SpringLayout.EAST, jl2, 0, SpringLayout.EAST, jl);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jl1, 3, SpringLayout.NORTH, jt1);
		sl_jpnl.putConstraint(SpringLayout.EAST, jl1, -14, SpringLayout.WEST, jt1);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jb, 0, SpringLayout.NORTH, jb1);
		sl_jpnl.putConstraint(SpringLayout.EAST, jb, 0, SpringLayout.EAST, jl);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jb1, 43, SpringLayout.SOUTH, jt2);
		sl_jpnl.putConstraint(SpringLayout.WEST, jb1, 0, SpringLayout.WEST, jt);
		sl_jpnl.putConstraint(SpringLayout.EAST, jt2, 0, SpringLayout.EAST, jt);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jl, 105, SpringLayout.NORTH, jpnl);
		sl_jpnl.putConstraint(SpringLayout.WEST, jt, 10, SpringLayout.EAST, jl);
		sl_jpnl.putConstraint(SpringLayout.EAST, jt, -262, SpringLayout.EAST, jpnl);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jt2, 26, SpringLayout.SOUTH, jt1);
		sl_jpnl.putConstraint(SpringLayout.WEST, jt2, 0, SpringLayout.WEST, jt);
		sl_jpnl.putConstraint(SpringLayout.EAST, jt1, 0, SpringLayout.EAST, jt);
		sl_jpnl.putConstraint(SpringLayout.WEST, jl, 84, SpringLayout.WEST, jpnl);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jt1, 18, SpringLayout.SOUTH, jt);
		sl_jpnl.putConstraint(SpringLayout.WEST, jt1, 0, SpringLayout.WEST, jt);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jt, -3, SpringLayout.NORTH, jl);
		jpnl.setLayout(sl_jpnl);
		
		jpnl.add(jt);
		jpnl.add(jt1);
		jpnl.add(jt2);
		jpnl.add(jl);
		jpnl.add(jl1);
		jpnl.add(jl2);
		jpnl.add(jb);
		jpnl.add(jb1);
		getContentPane().add(jpnl);
		
		setSize(500,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		jb1.addActionListener(new ActionListener() { // 돌아가기 버튼
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	@Override
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
