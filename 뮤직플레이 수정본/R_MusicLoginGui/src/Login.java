

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class Login extends JFrame implements MouseListener {
    JScrollPane scrollPane;
    private ImageIcon icon;
    private JTextField textField;
    private JTextField textField_1;
 
    public Login() {
    
        icon = new ImageIcon("src/img/����3.png");
       
        //��� Panel ������ �������������� ����      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
            	setTitle("Water Melon");
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); //�׸��� ǥ���ϰ� ����,�����ϰ� ����
                super.paintComponent(g);
            }
        };
       
        SpringLayout sl_background = new SpringLayout();
        background.setLayout(sl_background);
       
        JButton button = new JButton(new ImageIcon("src/img/�α���1.png"));
        sl_background.putConstraint(SpringLayout.WEST, button, 52, SpringLayout.WEST, background);
        sl_background.putConstraint(SpringLayout.EAST, button, -60, SpringLayout.EAST, background);
        button.setForeground(Color.darkGray);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        background.add(button);
        
        JButton button1 = new JButton(new ImageIcon("src/img/ȸ������.png"));
        sl_background.putConstraint(SpringLayout.SOUTH, button, -6, SpringLayout.NORTH, button1);
        sl_background.putConstraint(SpringLayout.NORTH, button1, 360, SpringLayout.NORTH, background);
        button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignUp dialog = new SignUp(Login.this);
				dialog.show();
			}
		});
        sl_background.putConstraint(SpringLayout.SOUTH, button1, -70, SpringLayout.SOUTH, background);
        sl_background.putConstraint(SpringLayout.WEST, button1, 223, SpringLayout.WEST, background);
        sl_background.putConstraint(SpringLayout.EAST, button1, -60, SpringLayout.EAST, background);
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.setBorderPainted(false); // ��ư�ܰ��� ������
        button1.setContentAreaFilled(false); // ��ư �����ϰԼ���
        button1.setFocusPainted(false);
        background.add(button1);
        scrollPane = new JScrollPane(background);
        
        textField = new JTextField("2��");
        sl_background.putConstraint(SpringLayout.NORTH, button, 17, SpringLayout.SOUTH, textField);
        sl_background.putConstraint(SpringLayout.SOUTH, textField, -151, SpringLayout.SOUTH, background);
        sl_background.putConstraint(SpringLayout.NORTH, textField, 261, SpringLayout.NORTH, background);
        sl_background.putConstraint(SpringLayout.WEST, textField, 98, SpringLayout.WEST, background);
        sl_background.putConstraint(SpringLayout.EAST, textField, -106, SpringLayout.EAST, background);
        background.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField("1��");
        sl_background.putConstraint(SpringLayout.NORTH, textField_1, 189, SpringLayout.NORTH, background);
        sl_background.putConstraint(SpringLayout.WEST, textField_1, 98, SpringLayout.WEST, background);
        sl_background.putConstraint(SpringLayout.EAST, textField_1, -106, SpringLayout.EAST, background);
        background.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel = new JLabel(new ImageIcon("src/img/���̵�1.png"));
        sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel, 158, SpringLayout.NORTH, background);
        sl_background.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, button);
        sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, textField_1);
        background.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel(new ImageIcon("src/img/�н�����.png"));
        sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 239, SpringLayout.NORTH, background);
        sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -5, SpringLayout.NORTH, textField);
        sl_background.putConstraint(SpringLayout.SOUTH, textField_1, -15, SpringLayout.NORTH, lblNewLabel_1);
        sl_background.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
        sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, button);
        sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_1, -221, SpringLayout.EAST, background);
        background.add(lblNewLabel_1);
        setContentPane(scrollPane);
    }
 
    public static void main(String[] args) {
    	Login frame = new Login();
    	frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 480);
        frame.setVisible(true);
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