import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JoinFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfUsername;
	private JTextField tfPassword;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame frame = new JoinFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JoinFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblJoin = new JLabel("회원가입");
		Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(159, 41, 101, 20);
		contentPane.add(lblJoin);
		
		JLabel lblUsername = new JLabel("패스워드");
		lblUsername.setBounds(69, 163, 69, 20);
		contentPane.add(lblUsername);
		
		JLabel lblUsername1 = new JLabel("패스워드확인");
		lblUsername1.setBounds(69, 213, 79, 20);
		contentPane.add(lblUsername1);
		
		JLabel label = new JLabel("아이디");
		label.setBounds(69, 113, 69, 20);
		contentPane.add(label);
		
		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(159, 106, 186, 35);
		contentPane.add(tfUsername);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(159, 206, 186, 35);
		contentPane.add(tfPassword);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(159, 156, 186, 35);
		contentPane.add(tfPassword);
		
		
		joinCompleteBtn = new JButton("회원가입완료");
		joinCompleteBtn.setBounds(205, 350, 139, 29);
		contentPane.add(joinCompleteBtn);
		
		setVisible(true);
		//회원가입완료 액션
		joinCompleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
				dispose();
			}
		});
	}
}


