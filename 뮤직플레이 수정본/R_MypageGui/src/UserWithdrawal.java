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

// ȸ��Ż�� ����â
class UserWithdrawal extends JDialog implements MouseListener {
	private ImageIcon icon2;
	private JTextField textField;
	private JTextField textField_1;
	
	
	public UserWithdrawal(JFrame owner) {
		super(owner, true);
		
		icon2 = new ImageIcon("src/imgs/��������������.png");
		JPanel unsubscribe = new JPanel() {
			public void paintComponent(Graphics g) {
				setTitle("Unsubscribe");
				g.drawImage(icon2.getImage(), 0, 0, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};
		
		getContentPane().add(unsubscribe);
		SpringLayout sl_unsubscribe = new SpringLayout();
		unsubscribe.setLayout(sl_unsubscribe);
		
		textField_1 = new JTextField("1��");
		sl_unsubscribe.putConstraint(SpringLayout.NORTH, textField_1, 130, SpringLayout.NORTH, unsubscribe);
		sl_unsubscribe.putConstraint(SpringLayout.EAST, textField_1, -102, SpringLayout.EAST, unsubscribe);
		unsubscribe.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("src/imgs/������й�ȣ.png"));
		sl_unsubscribe.putConstraint(SpringLayout.WEST, lblNewLabel_1, 68, SpringLayout.WEST, unsubscribe);
		unsubscribe.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("src/imgs/������й�ȣ.png"));
		sl_unsubscribe.putConstraint(SpringLayout.WEST, textField_1, 8, SpringLayout.EAST, lblNewLabel);
		sl_unsubscribe.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, textField_1);
		sl_unsubscribe.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, textField_1);
		sl_unsubscribe.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_unsubscribe.putConstraint(SpringLayout.EAST, lblNewLabel, -278, SpringLayout.EAST, unsubscribe);
		unsubscribe.add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton(new ImageIcon("src/imgs/���ư�������.png"));
		sl_unsubscribe.putConstraint(SpringLayout.WEST, btnNewButton, 206, SpringLayout.WEST, unsubscribe);
		sl_unsubscribe.putConstraint(SpringLayout.SOUTH, btnNewButton, -70, SpringLayout.SOUTH, unsubscribe);
		btnNewButton.addActionListener(new ActionListener() { // ���ư��� ��ư
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		unsubscribe.add(btnNewButton);
		btnNewButton.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton.setFocusPainted(false);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("src/imgs/�������.png"));
		sl_unsubscribe.putConstraint(SpringLayout.NORTH, btnNewButton_1, 31, SpringLayout.SOUTH, lblNewLabel_1);
		sl_unsubscribe.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -58, SpringLayout.SOUTH, unsubscribe);
		sl_unsubscribe.putConstraint(SpringLayout.EAST, btnNewButton_1, -18, SpringLayout.WEST, btnNewButton);
		unsubscribe.add(btnNewButton_1);
		btnNewButton_1.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_1.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_1.setFocusPainted(false);
		
		textField = new JTextField("2��");
		sl_unsubscribe.putConstraint(SpringLayout.NORTH, btnNewButton, 41, SpringLayout.SOUTH, textField);
		sl_unsubscribe.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, textField);
		sl_unsubscribe.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, textField);
		sl_unsubscribe.putConstraint(SpringLayout.EAST, lblNewLabel_1, -6, SpringLayout.WEST, textField);
		sl_unsubscribe.putConstraint(SpringLayout.SOUTH, textField_1, -30, SpringLayout.NORTH, textField);
		sl_unsubscribe.putConstraint(SpringLayout.NORTH, textField, 190, SpringLayout.NORTH, unsubscribe);
		sl_unsubscribe.putConstraint(SpringLayout.SOUTH, textField, -171, SpringLayout.SOUTH, unsubscribe);
		sl_unsubscribe.putConstraint(SpringLayout.WEST, textField, 124, SpringLayout.WEST, unsubscribe);
		sl_unsubscribe.putConstraint(SpringLayout.EAST, textField, -102, SpringLayout.EAST, unsubscribe);
		unsubscribe.add(textField);
		textField.setColumns(10);
		
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
