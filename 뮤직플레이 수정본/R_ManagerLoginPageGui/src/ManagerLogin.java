import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ManagerLogin extends JFrame implements MouseListener {
	private ImageIcon icon;
	private JTextField textField;
	private JTextField textField_1;
	
	public ManagerLogin() {
		
		icon = new ImageIcon("src/img/�����ڸ���.png");
		JPanel pnl = new JPanel() {
            public void paintComponent(Graphics g) {
            	setTitle("Management");
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); //�׸��� ǥ���ϰ� ����,�����ϰ� ����
                super.paintComponent(g);
            }
        };
	
		
//		jb.addActionListener(new ActionListener() { // �α��� ��������,ȸ������ ����â ����
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Management dialog = new Management(ManagerLogin.this); 
//				dialog.show();
//			}
//		});
//		jb1.addActionListener(new ActionListener() { // �ݱ��ư
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
		
		getContentPane().add(pnl);
		SpringLayout sl_pnl = new SpringLayout();
		pnl.setLayout(sl_pnl);
		

		
		JButton btnNewButton = new JButton(new ImageIcon("src/img/�ݱ��ư.png"));
		
		btnNewButton.addActionListener(new ActionListener() { // ���ư��� ��ư
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		sl_pnl.putConstraint(SpringLayout.NORTH, btnNewButton, 281, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, btnNewButton, -45, SpringLayout.SOUTH, pnl);
		btnNewButton.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton.setFocusPainted(false);
		sl_pnl.putConstraint(SpringLayout.EAST, btnNewButton, -106, SpringLayout.EAST, pnl);
		pnl.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("src/img/�����ڷα���.png"));
		
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Management dialog = new Management(ManagerLogin.this); // ������� ����â ����
				dialog.show();
			}
		});
		sl_pnl.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -45, SpringLayout.SOUTH, pnl);
		btnNewButton_1.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_1.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_1.setFocusPainted(false);
		sl_pnl.putConstraint(SpringLayout.WEST, btnNewButton, 31, SpringLayout.EAST, btnNewButton_1);
		sl_pnl.putConstraint(SpringLayout.WEST, btnNewButton_1, 103, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, btnNewButton_1, -214, SpringLayout.EAST, pnl);
		pnl.add(btnNewButton_1);
		
		textField_1 = new JTextField("1��");
		sl_pnl.putConstraint(SpringLayout.NORTH, textField_1, 149, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, btnNewButton_1);
		sl_pnl.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, btnNewButton);
		pnl.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField("2��");
		sl_pnl.putConstraint(SpringLayout.SOUTH, textField_1, -45, SpringLayout.NORTH, textField);
		sl_pnl.putConstraint(SpringLayout.NORTH, btnNewButton_1, 21, SpringLayout.SOUTH, textField);
		sl_pnl.putConstraint(SpringLayout.NORTH, textField, -144, SpringLayout.SOUTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, textField, 103, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, textField, -21, SpringLayout.NORTH, btnNewButton);
		sl_pnl.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, btnNewButton);
		pnl.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("src/img/���̵�.png"));
		sl_pnl.putConstraint(SpringLayout.NORTH, lblNewLabel, -31, SpringLayout.NORTH, textField_1);
		sl_pnl.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, btnNewButton_1);
		sl_pnl.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, textField_1);
		pnl.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("src/img/���ġ��.png")); // ���
		sl_pnl.putConstraint(SpringLayout.NORTH, lblNewLabel_1, -31, SpringLayout.NORTH, textField);
		sl_pnl.putConstraint(SpringLayout.WEST, lblNewLabel_1, 103, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, textField);
		pnl.add(lblNewLabel_1);
		
		
		
		
		
	
		
		
		setResizable(false);
		setSize(400,400);
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
