import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

class SignUp extends JDialog implements MouseListener {
	private ImageIcon icon;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public SignUp(JFrame owner) {
		super(owner, true);

		icon = new ImageIcon("src/img/ȸ�����Ծ�����1.png");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				setTitle("Sign Up");
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};
		setSize(400, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().add(background);
		setResizable(false);
		SpringLayout sl_background = new SpringLayout();
		background.setLayout(sl_background);

		JButton btnNewButton_1 = new JButton(new ImageIcon("src/img/�˻�������.png")); // �ߺ�Ȯ�� ��ư
		sl_background.putConstraint(SpringLayout.EAST, btnNewButton_1, -79, SpringLayout.EAST, background);
		background.add(btnNewButton_1);
		btnNewButton_1.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_1.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_1.setFocusPainted(false);

		JButton btnNewButton = new JButton(new ImageIcon("src/img/�Ϸ��ư.png")); // ���ԿϷ� ��ư
		sl_background.putConstraint(SpringLayout.WEST, btnNewButton, 78, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, btnNewButton, -205, SpringLayout.EAST, background);
		background.add(btnNewButton);
		btnNewButton.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton.setFocusPainted(false);

		textField = new JTextField("1��");
		sl_background.putConstraint(SpringLayout.NORTH, textField, 115, SpringLayout.NORTH, background);
		sl_background.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, textField);
		sl_background.putConstraint(SpringLayout.WEST, btnNewButton_1, 6, SpringLayout.EAST, textField);
		sl_background.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 0, SpringLayout.SOUTH, textField);
		sl_background.putConstraint(SpringLayout.WEST, textField, 121, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, textField, -115, SpringLayout.EAST, background);
		background.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField("2��");
		sl_background.putConstraint(SpringLayout.NORTH, textField_1, 167, SpringLayout.NORTH, background);
		sl_background.putConstraint(SpringLayout.SOUTH, textField_1, -272, SpringLayout.SOUTH, background);
		sl_background.putConstraint(SpringLayout.SOUTH, textField, -20, SpringLayout.NORTH, textField_1);
		sl_background.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		sl_background.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		background.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField("3��");
		sl_background.putConstraint(SpringLayout.NORTH, textField_2, 21, SpringLayout.SOUTH, textField_1);
		sl_background.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
		sl_background.putConstraint(SpringLayout.SOUTH, textField_2, 53, SpringLayout.SOUTH, textField_1);
		sl_background.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		background.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField("4��");
		sl_background.putConstraint(SpringLayout.NORTH, btnNewButton, 36, SpringLayout.SOUTH, textField_3);
		sl_background.putConstraint(SpringLayout.NORTH, textField_3, 19, SpringLayout.SOUTH, textField_2);
		sl_background.putConstraint(SpringLayout.SOUTH, textField_3, 51, SpringLayout.SOUTH, textField_2);
		sl_background.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
		sl_background.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
		background.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel = new JLabel(new ImageIcon("src/img/���̵�1.png"));
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel, 115, SpringLayout.NORTH, background);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel, 82, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.WEST, textField);
		background.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("src/img/�н�����.png")); // �н������
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel, -73, SpringLayout.NORTH, lblNewLabel_1);
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 53, SpringLayout.NORTH, textField_1);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, textField_2);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		background.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("src/img/�н�����.png")); // �н������
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 51, SpringLayout.NORTH, textField_2);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, textField_3);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
		background.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(new ImageIcon("src/img/�̸�������.png")); // �̸���
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 0, SpringLayout.NORTH, textField_1);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_3, 82, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -104, SpringLayout.SOUTH, textField_3);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel);
		background.add(lblNewLabel_3);

		JButton btnNewButton_2 = new JButton(new ImageIcon("src/img/���ư���.png"));
		sl_background.putConstraint(SpringLayout.NORTH, btnNewButton_2, 36, SpringLayout.SOUTH, textField_3);
		sl_background.putConstraint(SpringLayout.WEST, btnNewButton_2, 3, SpringLayout.EAST, btnNewButton);
		sl_background.putConstraint(SpringLayout.EAST, btnNewButton_2, -91, SpringLayout.EAST, background);
		background.add(btnNewButton_2);
		btnNewButton_2.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_2.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
