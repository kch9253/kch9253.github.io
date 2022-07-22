import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

class SignUp extends JDialog implements MouseListener{
	private JButton jb0; // 가입완료
	private JButton jb1; // 중복확인
	private JButton jb; // 돌아가기
	private JTextField jf; // id입력 텍스트필드
	private JTextField jf2; // pw입력 텍스트필드
	private JTextField jf3; // pw재입력 텍스트필드
	private JTextField jf4; // 이름입력 텍스트필드

	public SignUp(JFrame owner) {
		super(owner, true);
		setTitle("Signup");
		JPanel pnl = new JPanel();
		JLabel jl = new JLabel("ID 입력: ");
		JLabel jl2 = new JLabel("PW 입력: ");		
		JLabel jl3 = new JLabel("PW 재입력: ");		
		JLabel jl4 = new JLabel("이름 입력: ");		
		jf = new JTextField("id입력");  
		//jf.addMouseListener(this);
		jf2 = new JTextField("pw입력"); 
		//jf2.addMouseListener(this);
		jf3 = new JTextField("pw재입력");
		jf4 = new JTextField("이름입력");
		
		jb0 = new JButton("가입완료");
		jb1 = new JButton("중복확인");
		jb = new JButton("돌아가기");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jb1.addActionListener(new ActionListener() { // 돌아가기 버튼
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, jb, 0, SpringLayout.NORTH, jb0);
		sl_pnl.putConstraint(SpringLayout.WEST, jb, 48, SpringLayout.EAST, jb0);
		sl_pnl.putConstraint(SpringLayout.EAST, jb, -199, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jb0, 43, SpringLayout.SOUTH, jf3);
		sl_pnl.putConstraint(SpringLayout.WEST, jb0, 0, SpringLayout.WEST, jl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jf3, -3, SpringLayout.NORTH, jl3);
		sl_pnl.putConstraint(SpringLayout.WEST, jf3, 14, SpringLayout.EAST, jl3);
		sl_pnl.putConstraint(SpringLayout.EAST, jf3, -232, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl3, 18, SpringLayout.SOUTH, jl2);
		sl_pnl.putConstraint(SpringLayout.WEST, jl3, 0, SpringLayout.WEST, jl);
		sl_pnl.putConstraint(SpringLayout.WEST, jf4, 12, SpringLayout.EAST, jl4);
		sl_pnl.putConstraint(SpringLayout.EAST, jf4, -215, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jf2, -3, SpringLayout.NORTH, jl2);
		sl_pnl.putConstraint(SpringLayout.WEST, jf2, 120, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, jf2, 0, SpringLayout.EAST, jf4);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl2, 22, SpringLayout.SOUTH, jl4);
		sl_pnl.putConstraint(SpringLayout.WEST, jl2, 0, SpringLayout.WEST, jl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jf4, -3, SpringLayout.NORTH, jl4);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl4, 16, SpringLayout.SOUTH, jf);
		sl_pnl.putConstraint(SpringLayout.WEST, jl4, 0, SpringLayout.WEST, jl);
		sl_pnl.putConstraint(SpringLayout.WEST, jl, 48, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, jb1, 319, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, jb1, -81, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jf, 46, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, jf, 7, SpringLayout.EAST, jl);
		sl_pnl.putConstraint(SpringLayout.EAST, jf, -84, SpringLayout.WEST, jb1);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl, 3, SpringLayout.NORTH, jf);
		sl_pnl.putConstraint(SpringLayout.NORTH, jb1, 43, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, jb1, -392, SpringLayout.SOUTH, pnl);
		pnl.setLayout(sl_pnl);
		
		pnl.add(jl);
		pnl.add(jl2);
		pnl.add(jl3);
		pnl.add(jl4);
		pnl.add(jf);
		pnl.add(jf2);
		pnl.add(jf3);
		pnl.add(jf4);
		pnl.add(jb);
		pnl.add(jb0);
		pnl.add(jb1);
		getContentPane().add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
				jf2.setText(""); 
		}
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