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

public class ManagerLogin extends JFrame implements MouseListener {
	private JLabel jl; // ������ ID ��
	private JLabel jl2; // ������ �н����� ��
	private JTextField jf; // id �ؽ�Ʈ
	private JTextField jf1; // �н���Ʈ �ؽ�Ʈ
	private JButton jb; // �α��ι�ư
	private JButton jb1; // �ݱ��ư
	
	public ManagerLogin() {
		super("������������");
		
		JPanel pnl = new JPanel();
		jl = new JLabel("�����ھ��̵�: ");
		jl2 = new JLabel("�н�����: ");
		jf = new JTextField("id �ؽ�Ʈ");
		jf1 = new JTextField("�н����� �ؽ�Ʈ");
		jb = new JButton("�α���");
		jb1 = new JButton("�ݱ�");
		
		jb.addActionListener(new ActionListener() { // �α��� �������� ����â ����
			@Override
			public void actionPerformed(ActionEvent e) {
				Management dialog = new Management(ManagerLogin.this); 
				dialog.show();
			}
		});
		jb1.addActionListener(new ActionListener() { // �ݱ��ư
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, jb1, 0, SpringLayout.NORTH, jb);
		sl_pnl.putConstraint(SpringLayout.WEST, jb1, 21, SpringLayout.EAST, jb);
		sl_pnl.putConstraint(SpringLayout.EAST, jb1, 85, SpringLayout.EAST, jb);
		sl_pnl.putConstraint(SpringLayout.NORTH, jb, 34, SpringLayout.SOUTH, jf1);
		sl_pnl.putConstraint(SpringLayout.WEST, jb, 94, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jf1, 30, SpringLayout.SOUTH, jf);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl2, 3, SpringLayout.NORTH, jf1);
		sl_pnl.putConstraint(SpringLayout.EAST, jl2, 0, SpringLayout.EAST, jl);
		sl_pnl.putConstraint(SpringLayout.WEST, jf1, 0, SpringLayout.WEST, jf);
		sl_pnl.putConstraint(SpringLayout.EAST, jf1, 0, SpringLayout.EAST, jf);
		sl_pnl.putConstraint(SpringLayout.NORTH, jf, -3, SpringLayout.NORTH, jl);
		sl_pnl.putConstraint(SpringLayout.WEST, jf, 24, SpringLayout.EAST, jl);
		sl_pnl.putConstraint(SpringLayout.EAST, jf, 125, SpringLayout.EAST, jl);
		sl_pnl.putConstraint(SpringLayout.NORTH, jl, 81, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, jl, 56, SpringLayout.WEST, pnl);
		pnl.setLayout(sl_pnl);
		
		pnl.add(jl);
		pnl.add(jl2);
		pnl.add(jf);
		pnl.add(jf1);
		pnl.add(jb);
		pnl.add(jb1);
		getContentPane().add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

public static void main(String[] args) {
		new ManagerLogin().setVisible(true);
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
