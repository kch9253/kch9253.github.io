package Music01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicPlayerGUI {

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
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 642, 252);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 10, 602, 99);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_info = new JLabel("Music info");
		lbl_info.setForeground(Color.WHITE);
		lbl_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_info.setBackground(Color.BLACK);
		lbl_info.setFont(new Font("���� ���", Font.PLAIN, 20));
		panel.add(lbl_info, "name_160341214313800");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 116, 602, 87);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_3 = new JButton("\u25C0\u25C0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.prePlay();
				Music song = mp.play();
				lbl_info.setText(mp.musicInfo(song));
			}
		});
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 25));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("\u25B6");
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

		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\u25A0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.stop();
				lbl_info.setText("STOP");
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 25));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\u25B6\u25B6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.nextPlay();
				Music song = mp.play();
				lbl_info.setText(mp.musicInfo(song));
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 25));
		panel_1.add(btnNewButton);
			
				


				
	}
}
