

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class MusicPlayerGUI {
	private ImageIcon icon;
	private JFrame frame;
	MusicPlayer mp = new MusicPlayer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerGUI window = new MusicPlayerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MusicPlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.black); // ��üâ ��׶�����
		frame.setBounds(100, 100, 390, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 12, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 71, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 372, SpringLayout.WEST, frame.getContentPane());
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lbl_info = new JLabel(new ImageIcon("src/img/����̹���.png"));
		sl_panel.putConstraint(SpringLayout.NORTH, lbl_info, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lbl_info, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lbl_info, 61, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lbl_info, 360, SpringLayout.WEST, panel);
		lbl_info.setForeground(Color.white);
		lbl_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_info.setBackground(Color.BLACK);
		lbl_info.setFont(new Font(" ���", Font.PLAIN, 18));
		panel.add(lbl_info);
		
		JButton btnNewButton_3 = new JButton(new ImageIcon("src/img/�ڷΰ���.png"));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 418, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 33, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_3, 479, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, 109, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_3.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_3.setFocusPainted(false);
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.prePlay();
				Music song = mp.play();
				lbl_info.setText(mp.musicInfo(song));
			}
		});
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 25));
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("src/img/���.png"));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 418, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 116, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 479, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, 192, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_2.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_2.setFocusPainted(false);
		
		//��ư�� �׼��� ������ �� �ִ� �׼Ǻο�
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music song = mp.play();
				//��ư�� ������ ���� ����� ���� ����ֱ� -> musicinfo()
				//�󺧿� ������ ���� ���� ����!!!!!!!!!!!!!!
				//�󺧿� ������ �����ϱ� ���� �޼ҵ�
				//get�ؽ���� �༮�� 
				lbl_info.setText(mp.musicInfo(song));
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 25));
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("src/img/������ư.png"));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 418, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 194, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 479, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 270, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton_1.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton_1.setFocusPainted(false);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.stop();
				lbl_info.setText("STOP");
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 25));
		
		JButton btnNewButton = new JButton(new ImageIcon("src/img/�����ΰ���.png"));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 418, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 274, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 479, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 350, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setBorderPainted(false); // ��ư�ܰ��� ������
		btnNewButton.setContentAreaFilled(false); // ��ư �����ϰԼ���
		btnNewButton.setFocusPainted(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.nextPlay();
				Music song = mp.play();
				lbl_info.setText(mp.musicInfo(song));
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 25));
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("src/img/����.png"));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 341, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 116, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 408, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 270, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("src/img/������.jpg"));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 22, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 22, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -32, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -10, SpringLayout.EAST, panel);
		frame.getContentPane().add(lblNewLabel_1);
		
		
			
		
		


				
	}
}
