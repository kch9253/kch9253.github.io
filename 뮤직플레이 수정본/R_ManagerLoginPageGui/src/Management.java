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


// 음원관리 클릭시 서브창 생성해야함
// 회원관리 클릭시 서브창 생성해야함
public class Management extends JDialog implements MouseListener{
	private ImageIcon icon1;
	
	public Management(JFrame owner) {
		super(owner, true);
		
		icon1 = new ImageIcon("src/img/관리자메인.png");
		JPanel Manager = new JPanel() {
			public void paintComponent(Graphics g) {
				setTitle("Password Change");
				g.drawImage(icon1.getImage(), 0, 0, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		
		getContentPane().add(Manager);
		SpringLayout sl_Manager = new SpringLayout();
		Manager.setLayout(sl_Manager);
		// 음원관리 클릭시 음원관리 서브창 전환시켜야함
		JButton btnNewButton = new JButton(new ImageIcon("src/img/음원관리버튼.png")); // 음원관리
		
//		btnNewButton_1.addActionListener(new ActionListener() {       음원관리 클릭할시 서브창 구현할수있는 메소드 ( 음원관리클래스필요 )
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Management dialog = new Management(ManagerLogin.this); // 비번변경 서브창 생성
//				dialog.show();
//			}
//		}); 
		btnNewButton.setBorderPainted(false); // 버튼외곽선 없애줌
		btnNewButton.setContentAreaFilled(false); // 버튼 투명하게설정
		btnNewButton.setFocusPainted(false);
		sl_Manager.putConstraint(SpringLayout.NORTH, btnNewButton, 104, SpringLayout.NORTH, Manager);
		sl_Manager.putConstraint(SpringLayout.WEST, btnNewButton, -300, SpringLayout.EAST, Manager);
		sl_Manager.putConstraint(SpringLayout.SOUTH, btnNewButton, -122, SpringLayout.SOUTH, Manager);
		sl_Manager.putConstraint(SpringLayout.EAST, btnNewButton, -203, SpringLayout.EAST, Manager);
		Manager.add(btnNewButton);
		// 회원관리 클릭시 회원관리 서브창 전환시켜야함
		JButton btnNewButton_1 = new JButton(new ImageIcon("src/img/회원관리버튼.png")); // 회원관리
		
//		btnNewButton_1.addActionListener(new ActionListener() {       회원관리 클릭시 서브창 구현할수있는 메소드 ( 회원관리클래스필요 )
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Management dialog = new Management(ManagerLogin.this); // 비번변경 서브창 생성
//				dialog.show();
//			}
//		});
		btnNewButton_1.setBorderPainted(false); // 버튼외곽선 없애줌
		btnNewButton_1.setContentAreaFilled(false); // 버튼 투명하게설정
		btnNewButton_1.setFocusPainted(false);
		sl_Manager.putConstraint(SpringLayout.NORTH, btnNewButton_1, 104, SpringLayout.NORTH, Manager);
		sl_Manager.putConstraint(SpringLayout.WEST, btnNewButton_1, 21, SpringLayout.EAST, btnNewButton);
		sl_Manager.putConstraint(SpringLayout.EAST, btnNewButton_1, 118, SpringLayout.EAST, btnNewButton);
		Manager.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("src/img/나갈껴.png")); // 로그아웃 
		
		btnNewButton_2.addActionListener(new ActionListener() { // 로그아웃 누를시 창닫힘 (로그아웃 DB설정해야함)
			public void actionPerformed(ActionEvent e) { // 로그아웃 실행되고 나가져야함
				dispose();
			}
		});
		btnNewButton_2.setBorderPainted(false); // 버튼외곽선 없애줌
		btnNewButton_2.setContentAreaFilled(false); // 버튼 투명하게설정
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
