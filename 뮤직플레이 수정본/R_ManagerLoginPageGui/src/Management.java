import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;


// �������� Ŭ���� ����â �����ؾ���
// ȸ������ Ŭ���� ����â �����ؾ���
public class Management extends JDialog implements MouseListener{
	private ImageIcon icon1;
	
	public Management(JFrame owner) {
		super(owner, true);
		
		icon1 = new ImageIcon("src/img/�����ڸ���.png");
		JPanel Manager = new JPanel() {
			public void paintComponent(Graphics g) {
				setTitle("Password Change");
				g.drawImage(icon1.getImage(), 0, 0, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};
		
		getContentPane().add(Manager);
		SpringLayout sl_Manager = new SpringLayout();
		Manager.setLayout(sl_Manager);
		// �������� Ŭ���� �������� ����â ��ȯ���Ѿ���
		JButton btnNewButton = new JButton(new ImageIcon("src/img/����������ư.png")); // ��������
		
//		btnNewButton_1.addActionListener(new ActionListener() {       �������� Ŭ���ҽ� ����â �����Ҽ��ִ� �޼ҵ� ( ��������Ŭ�����ʿ� )
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Management dialog = new Management(ManagerLogin.this); // ������� ����â ����
//				dialog.show();
//			}
//		}); 
		btnNewButton.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton.setFocusPainted(false);
		sl_Manager.putConstraint(SpringLayout.NORTH, btnNewButton, 104, SpringLayout.NORTH, Manager);
		sl_Manager.putConstraint(SpringLayout.WEST, btnNewButton, -300, SpringLayout.EAST, Manager);
		sl_Manager.putConstraint(SpringLayout.SOUTH, btnNewButton, -122, SpringLayout.SOUTH, Manager);
		sl_Manager.putConstraint(SpringLayout.EAST, btnNewButton, -203, SpringLayout.EAST, Manager);
		Manager.add(btnNewButton);
		// ȸ������ Ŭ���� ȸ������ ����â ��ȯ���Ѿ���
		JButton btnNewButton_1 = new JButton(new ImageIcon("src/img/ȸ��������ư.png")); // ȸ������
		
//		btnNewButton_1.addActionListener(new ActionListener() {       ȸ������ Ŭ���� ����â �����Ҽ��ִ� �޼ҵ� ( ȸ������Ŭ�����ʿ� )
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Management dialog = new Management(ManagerLogin.this); // ������� ����â ����
//				dialog.show();
//			}
//		});
		btnNewButton_1.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_1.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_1.setFocusPainted(false);
		sl_Manager.putConstraint(SpringLayout.NORTH, btnNewButton_1, 104, SpringLayout.NORTH, Manager);
		sl_Manager.putConstraint(SpringLayout.WEST, btnNewButton_1, 21, SpringLayout.EAST, btnNewButton);
		sl_Manager.putConstraint(SpringLayout.EAST, btnNewButton_1, 118, SpringLayout.EAST, btnNewButton);
		Manager.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("src/img/������.png")); // �α׾ƿ� 
		
		btnNewButton_2.addActionListener(new ActionListener() { // �α׾ƿ� ������ â���� (�α׾ƿ� DB�����ؾ���)
			public void actionPerformed(ActionEvent e) { // �α׾ƿ� ����ǰ� ����������
				dispose();
			}
		});
		btnNewButton_2.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_2.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_2.setFocusPainted(false);
		sl_Manager.putConstraint(SpringLayout.NORTH, btnNewButton_2, 27, SpringLayout.SOUTH, btnNewButton);
		sl_Manager.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -46, SpringLayout.SOUTH, Manager);
		sl_Manager.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -27, SpringLayout.NORTH, btnNewButton_2);
		sl_Manager.putConstraint(SpringLayout.WEST, btnNewButton_2, 112, SpringLayout.WEST, Manager);
		sl_Manager.putConstraint(SpringLayout.EAST, btnNewButton_2, -115, SpringLayout.EAST, Manager);
		Manager.add(btnNewButton_2);
		
		setResizable(false);
		setSize(400,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
