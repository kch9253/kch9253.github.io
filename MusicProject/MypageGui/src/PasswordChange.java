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

// ������� ����â
class PasswordChange extends JDialog implements MouseListener {
	private JTextField jt; // ���� pw�Է� �ؽ�Ʈ�ʵ�
	private JTextField jt1; // �� pw�Է� �ؽ�Ʈ�ʵ�
	private JTextField jt2; // �� pw���Է� �ؽ�Ʈ�ʵ�
	private JLabel jl; // ���� pw�Է� 
	private JLabel jl1; // �� pw�Է�
	private JLabel jl2; // �� pw���Է�
	private JButton jb; // ����Ϸ� ��ư
	private JButton jb1; // ���ư����ư
	
	public PasswordChange(JFrame owner) {
		super(owner, true);
		setTitle("��й�ȣ����");
		
		JPanel jpnl = new JPanel();
		jt = new JTextField("���� pw�Է�");
		jt1 = new JTextField("�� pw�Է�");
		jt2 = new JTextField("�� ��pw�Է�");
		jl = new JLabel("���� ��й�ȣ: ");
		jl1 = new JLabel("�� ��й�ȣ: ");
		jl2 = new JLabel("��й�ȣȮ��: ");
		jb = new JButton("����Ϸ�");
		jb1 = new JButton("���ư���");
		SpringLayout sl_jpnl = new SpringLayout();
		sl_jpnl.putConstraint(SpringLayout.NORTH, jl2, 3, SpringLayout.NORTH, jt2);
		sl_jpnl.putConstraint(SpringLayout.EAST, jl2, 0, SpringLayout.EAST, jl);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jl1, 3, SpringLayout.NORTH, jt1);
		sl_jpnl.putConstraint(SpringLayout.EAST, jl1, 0, SpringLayout.EAST, jl);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jt, 93, SpringLayout.NORTH, jpnl);
		sl_jpnl.putConstraint(SpringLayout.WEST, jt, 151, SpringLayout.WEST, jpnl);
		sl_jpnl.putConstraint(SpringLayout.EAST, jt, -202, SpringLayout.EAST, jpnl);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jl, 3, SpringLayout.NORTH, jt);
		sl_jpnl.putConstraint(SpringLayout.EAST, jl, -18, SpringLayout.WEST, jt);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jb, 0, SpringLayout.NORTH, jb1);
		sl_jpnl.putConstraint(SpringLayout.EAST, jb, -24, SpringLayout.WEST, jb1);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jb1, 38, SpringLayout.SOUTH, jt2);
		sl_jpnl.putConstraint(SpringLayout.EAST, jb1, 0, SpringLayout.EAST, jt);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jt2, 25, SpringLayout.SOUTH, jt1);
		sl_jpnl.putConstraint(SpringLayout.WEST, jt2, 151, SpringLayout.WEST, jpnl);
		sl_jpnl.putConstraint(SpringLayout.EAST, jt2, 0, SpringLayout.EAST, jt);
		sl_jpnl.putConstraint(SpringLayout.NORTH, jt1, 20, SpringLayout.SOUTH, jt);
		sl_jpnl.putConstraint(SpringLayout.WEST, jt1, 151, SpringLayout.WEST, jpnl);
		sl_jpnl.putConstraint(SpringLayout.EAST, jt1, 0, SpringLayout.EAST, jt);
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
		
		jb1.addActionListener(new ActionListener() { // ���ư��� ��ư
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
