import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

// ������� ����â
class PasswordChange extends JDialog implements MouseListener {
	private ImageIcon icon1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public PasswordChange(JFrame owner) {
		super(owner, true);
		
		icon1 = new ImageIcon("src/imgs/��������������.png");
		JPanel passwordpnl = new JPanel() {
			public void paintComponent(Graphics g) {
				setTitle("Password Change");
				g.drawImage(icon1.getImage(), 0, 0, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};
		
		SpringLayout sl_passwordpnl = new SpringLayout();
		passwordpnl.setLayout(sl_passwordpnl);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("src/imgs/��й�ȣ����Ϸ�.png"));
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -43, SpringLayout.SOUTH, passwordpnl);
		btnNewButton_2.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_2.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_2.setFocusPainted(false);
		passwordpnl.add(btnNewButton_2);
		
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("src/imgs/���ư�������.png"));
		sl_passwordpnl.putConstraint(SpringLayout.EAST, btnNewButton_2, -20, SpringLayout.WEST, btnNewButton_1);
		sl_passwordpnl.putConstraint(SpringLayout.NORTH, btnNewButton_1, 260, SpringLayout.NORTH, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -55, SpringLayout.SOUTH, passwordpnl);
		
		btnNewButton_1.addActionListener(new ActionListener() { // ���ư��� ��ư
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		sl_passwordpnl.putConstraint(SpringLayout.WEST, btnNewButton_1, 204, SpringLayout.WEST, passwordpnl);
		btnNewButton_1.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_1.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_1.setFocusPainted(false);
		passwordpnl.add(btnNewButton_1);
		
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("src/imgs/������й�ȣ.png"));
		sl_passwordpnl.putConstraint(SpringLayout.WEST, lblNewLabel_1, 78, SpringLayout.WEST, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.EAST, lblNewLabel_1, -276, SpringLayout.EAST, passwordpnl);
		passwordpnl.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("src/imgs/�����Һ�й�ȣ.png"));
		sl_passwordpnl.putConstraint(SpringLayout.WEST, lblNewLabel_2, 78, SpringLayout.WEST, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -205, SpringLayout.SOUTH, passwordpnl);
		passwordpnl.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("src/imgs/�����Һ�й�ȣ.png"));
		sl_passwordpnl.putConstraint(SpringLayout.WEST, lblNewLabel, 78, SpringLayout.WEST, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, lblNewLabel, -156, SpringLayout.SOUTH, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.NORTH, btnNewButton_2, 25, SpringLayout.SOUTH, lblNewLabel);
		passwordpnl.add(lblNewLabel);
		
		textField_2 = new JTextField("1��");
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, textField_2);
		sl_passwordpnl.putConstraint(SpringLayout.NORTH, textField_2, 113, SpringLayout.NORTH, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.WEST, textField_2, 124, SpringLayout.WEST, passwordpnl);
		passwordpnl.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField("2��");
		sl_passwordpnl.putConstraint(SpringLayout.EAST, lblNewLabel_2, -6, SpringLayout.WEST, textField);
		sl_passwordpnl.putConstraint(SpringLayout.NORTH, textField, 162, SpringLayout.NORTH, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, textField, -205, SpringLayout.SOUTH, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, textField_2, -25, SpringLayout.NORTH, textField);
		sl_passwordpnl.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		sl_passwordpnl.putConstraint(SpringLayout.WEST, textField, 124, SpringLayout.WEST, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.EAST, textField, -104, SpringLayout.EAST, passwordpnl);
		passwordpnl.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("3��");
		sl_passwordpnl.putConstraint(SpringLayout.NORTH, textField_1, 25, SpringLayout.SOUTH, textField);
		sl_passwordpnl.putConstraint(SpringLayout.SOUTH, textField_1, -25, SpringLayout.NORTH, btnNewButton_2);
		sl_passwordpnl.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, textField_1);
		sl_passwordpnl.putConstraint(SpringLayout.WEST, textField_1, 124, SpringLayout.WEST, passwordpnl);
		sl_passwordpnl.putConstraint(SpringLayout.EAST, textField_1, -104, SpringLayout.EAST, passwordpnl);
		passwordpnl.add(textField_1);
		textField_1.setColumns(10);
		
		getContentPane().add(passwordpnl);
		setSize(400,420);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		

		
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
