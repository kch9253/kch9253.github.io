
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import kr.co.green.DBUtil;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class SignUpGUI extends JDialog implements MouseListener {
	private ImageIcon icon;
	private JButton jb0; // 가입완료
	private JButton jb1; // 중복확인
	private JButton jb; // 돌아가기
	private JTextField jf; // id입력 텍스트필드
	private JPasswordField pf; // pw입력 텍스트필드
	private JPasswordField pf2; // pw재입력 텍스트필드
	private JTextField jfName; // 이름입력 텍스트필드
	private boolean idCheck;
	private boolean pwCheck;
	private UserDaoImp dao = new UserDaoImp();
	private WorkingLogin wl = new WorkingLogin();

	public SignUpGUI(JFrame owner) {
		super(owner, true);

		
		URL signup = getClass().getClassLoader().getResource("img/회원가입아이콘1.png");
		URL signup1 = getClass().getClassLoader().getResource("img/검색아이콘.png");
		URL signup2 = getClass().getClassLoader().getResource("img/완료버튼.png");
		URL signup3 = getClass().getClassLoader().getResource("img/아이디1.png");
		URL signup4 = getClass().getClassLoader().getResource("img/패스워드.png");
		URL signup5 = getClass().getClassLoader().getResource("img/이름아이콘.png");
		URL signup6 = getClass().getClassLoader().getResource("img/돌아가기.png");
		
		
		icon = new ImageIcon(signup);
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				setTitle("Sign Up");
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		setSize(400, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().add(background);
		setResizable(false);
		SpringLayout sl_background = new SpringLayout();
		background.setLayout(sl_background);

		JButton btnNewButton_1 = new JButton(new ImageIcon(signup1)); // 중복확인 버튼
		sl_background.putConstraint(SpringLayout.EAST, btnNewButton_1, -79, SpringLayout.EAST, background);
		background.add(btnNewButton_1);
		btnNewButton_1.setBorderPainted(false); // 버튼외곽선 없애줌
		btnNewButton_1.setContentAreaFilled(false); // 버튼 투명하게설정
		btnNewButton_1.setFocusPainted(false);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = jf.getText();
				try {
					if (wl.isIDSame(id)) {

						JOptionPane.showMessageDialog(null, "사용가능한 아이디", "확인", JOptionPane.DEFAULT_OPTION);

						idCheck = true;
					} else {
						JOptionPane.showMessageDialog(null, "중복된 아이디입니다.", "확인", JOptionPane.DEFAULT_OPTION);
						idCheck = false;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnNewButton = new JButton(new ImageIcon(signup2)); // 가입완료 버튼
		sl_background.putConstraint(SpringLayout.WEST, btnNewButton, 78, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, btnNewButton, -205, SpringLayout.EAST, background);
		background.add(btnNewButton);
		btnNewButton.setBorderPainted(false); // 버튼외곽선 없애줌
		btnNewButton.setContentAreaFilled(false); // 버튼 투명하게설정
		btnNewButton.setFocusPainted(false);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (idCheck && pwCheck) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다", "확인", JOptionPane.DEFAULT_OPTION);
					dispose();
					Connection conn = null;
					try {
						conn = DBUtil.getConnection();
						int result = dao.create(conn, jf.getText(), pf.getText(), jfName.getText());
					} catch (SQLException e1) {
						e1.printStackTrace();
					} finally {
						DBUtil.closeConn(conn);
					}
				} else {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인 해 주세요", "확인", JOptionPane.DEFAULT_OPTION);
				}

			}
		});

		jf = new JTextField();
		sl_background.putConstraint(SpringLayout.NORTH, jf, 115, SpringLayout.NORTH, background);
		sl_background.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, jf);
		sl_background.putConstraint(SpringLayout.WEST, btnNewButton_1, 6, SpringLayout.EAST, jf);
		sl_background.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 0, SpringLayout.SOUTH, jf);
		sl_background.putConstraint(SpringLayout.WEST, jf, 121, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, jf, -115, SpringLayout.EAST, background);
		background.add(jf);
		jf.setColumns(10);

		jfName = new JTextField();
		sl_background.putConstraint(SpringLayout.SOUTH, jf, -20, SpringLayout.NORTH, jfName);
		sl_background.putConstraint(SpringLayout.SOUTH, jfName, -265, SpringLayout.SOUTH, background);
		sl_background.putConstraint(SpringLayout.WEST, jfName, 0, SpringLayout.WEST, jf);
		sl_background.putConstraint(SpringLayout.EAST, jfName, 0, SpringLayout.EAST, jf);
		background.add(jfName);
		jfName.setColumns(10);

		pf = new JPasswordField();
		sl_background.putConstraint(SpringLayout.NORTH, pf, 17, SpringLayout.SOUTH, jfName);
		sl_background.putConstraint(SpringLayout.WEST, pf, 0, SpringLayout.WEST, jf);
		sl_background.putConstraint(SpringLayout.SOUTH, pf, -216, SpringLayout.SOUTH, background);
		sl_background.putConstraint(SpringLayout.EAST, pf, 0, SpringLayout.EAST, jf);
		background.add(pf);
		pf.setColumns(10);

		pf2 = new JPasswordField();
		sl_background.putConstraint(SpringLayout.SOUTH, pf2, -166, SpringLayout.SOUTH, background);
		sl_background.putConstraint(SpringLayout.NORTH, btnNewButton, 34, SpringLayout.SOUTH, pf2);
		sl_background.putConstraint(SpringLayout.NORTH, pf2, 18, SpringLayout.SOUTH, pf);
		sl_background.putConstraint(SpringLayout.WEST, pf2, 0, SpringLayout.WEST, jf);
		sl_background.putConstraint(SpringLayout.EAST, pf2, 0, SpringLayout.EAST, jf);
		background.add(pf2);
		pf2.setColumns(10);

		pf2.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				super.keyReleased(e);
				if (wl.isPassWordSame(pf.getText(), pf2.getText())) {
					System.out.println("비번 사용가능");
					pwCheck = true;
				} else {
					System.out.println("비번 다릅니다");
					pwCheck = false;
				}
			}
		});

		JLabel lblNewLabel = new JLabel(new ImageIcon(signup3));
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel, 115, SpringLayout.NORTH, background);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel, 82, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.WEST, jf);
		background.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(signup4));
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		background.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(signup4));
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -10, SpringLayout.NORTH, lblNewLabel_2);
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 6, SpringLayout.SOUTH, pf);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -34, SpringLayout.NORTH, btnNewButton);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
		background.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(signup5));
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 13, SpringLayout.SOUTH, lblNewLabel_3);
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel, -20, SpringLayout.NORTH, lblNewLabel_3);
		sl_background.putConstraint(SpringLayout.NORTH, jfName, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 167, SpringLayout.NORTH, background);
		sl_background.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -272, SpringLayout.SOUTH, background);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_3, 82, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel);
		background.add(lblNewLabel_3);

		JButton btnNewButton_2 = new JButton(new ImageIcon(signup6));
		sl_background.putConstraint(SpringLayout.NORTH, btnNewButton_2, 34, SpringLayout.SOUTH, pf2);
		sl_background.putConstraint(SpringLayout.WEST, btnNewButton_2, 3, SpringLayout.EAST, btnNewButton);
		sl_background.putConstraint(SpringLayout.EAST, btnNewButton_2, -91, SpringLayout.EAST, background);
		background.add(btnNewButton_2);
		btnNewButton_2.setBorderPainted(false); // 버튼외곽선 없애줌
		btnNewButton_2.setContentAreaFilled(false); // 버튼 투명하게설정
		btnNewButton_2.setFocusPainted(false);
		
		JLabel lblNewLabel_4 = new JLabel("      돌아가기");
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 6, SpringLayout.SOUTH, btnNewButton_2);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_4, 10, SpringLayout.WEST, btnNewButton_2);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_4, -10, SpringLayout.EAST, btnNewButton_2);
		background.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("   가입완료");
		sl_background.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 6, SpringLayout.SOUTH, btnNewButton);
		sl_background.putConstraint(SpringLayout.WEST, lblNewLabel_5, 93, SpringLayout.WEST, background);
		sl_background.putConstraint(SpringLayout.EAST, lblNewLabel_5, -34, SpringLayout.WEST, lblNewLabel_4);
		background.add(lblNewLabel_5);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			pf.setText("");
		}
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