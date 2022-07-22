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
	private JLabel jl; // ID��
	private JLabel jl1; // �̸���
	private JTextField jt; // ID 
	private JTextField jt1; // �̸�
	private JButton jb; // ��й�ȣ����
	private JButton jb1; // ȸ��Ż��
	
	public MyPage() {
		super("MyPage");
		
		JPanel pnl = new JPanel();
		jl = new JLabel("ȸ��ID: ");
		jl1 = new JLabel("ȸ���̸�: ");
		jt = new JTextField("id�ؽ�Ʈ");
		jt1 = new JTextField("�̸��ؽ�Ʈ");
		jb = new JButton("��й�ȣ����"); // ������ ������� ����â ������
		jb1 = new JButton("ȸ��Ż��"); // ������ ȸ��Ż�� ����â ������
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PasswordChange dialog = new PasswordChange(MyPage.this); // ������� ����â ����
				dialog.show();
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserWithdrawal dialog1 = new UserWithdrawal(MyPage.this); // ȸ��Ż�� ����â ����
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


		
	


