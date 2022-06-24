import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Dimension;

public class AwtCheckboxControl {
	private Frame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public AwtCheckboxControl() {
		prepareGUI();
	}
	
//	static JPanel page1=new JPanel() {
//		Image background=new ImageIcon(Main.class.getResource("../img/다운로드.jpg")).getImage();
//		public void paint(Graphics g) {//그리는 함수
//			g.drawImage(background, 0, 0, null);//background를 그려줌		
//		}
//	};

	public static void main(String[] args) {
		AwtCheckboxControl awtControlDemo = new AwtCheckboxControl();
		awtControlDemo.showCheckbox();
	}

	private void prepareGUI() {
		// Frame 에 대한 셋팅
		mainFrame = new JFrame("메뉴판");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		controlPanel = new JPanel();
		controlPanel.setPreferredSize(new Dimension(500, 500));
		mainFrame.add(controlPanel);
		mainFrame.setVisible(true);
	}

	private void showCheckbox() {

		JCheckBox chk1 = new JCheckBox("짜장면");
		JCheckBox chk2 = new JCheckBox("짬뽕");
		JCheckBox chk3 = new JCheckBox("탕수육");

		chk1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("짜장면 : " + 
				(e.getStateChange() == 1 ? "2500원" : "NoCheck"));
			}
		});

		chk2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("짬뽕 : " + 
				(e.getStateChange() == 1 ? "3000원" : "NoCheck"));
			}
		});

		chk3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("탕수육 : " + 
				(e.getStateChange() == 1 ? "5000원" : "NoCheck"));
			}
		});
		SpringLayout sl_controlPanel = new SpringLayout();
		sl_controlPanel.putConstraint(SpringLayout.NORTH, chk2, 50, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.WEST, chk1, 0, SpringLayout.WEST, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, chk1, -6, SpringLayout.NORTH, chk2);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, chk3, 6, SpringLayout.SOUTH, chk2);
		sl_controlPanel.putConstraint(SpringLayout.WEST, chk3, 0, SpringLayout.WEST, chk1);
		sl_controlPanel.putConstraint(SpringLayout.WEST, chk2, 0, SpringLayout.WEST, controlPanel);
		controlPanel.setLayout(sl_controlPanel);

		controlPanel.add(chk1);
		controlPanel.add(chk2);
		controlPanel.add(chk3);
		
				// 상단에 있는 라벨
				headerLabel = new JLabel();
				controlPanel.add(headerLabel);
				headerLabel.setAlignmentX(Label.CENTER);
				headerLabel.setText("MENU");
				
						// 하단 상태값 라벨
						statusLabel = new JLabel();
						sl_controlPanel.putConstraint(SpringLayout.NORTH, statusLabel, 0, SpringLayout.NORTH, chk2);
						sl_controlPanel.putConstraint(SpringLayout.EAST, statusLabel, -116, SpringLayout.EAST, controlPanel);
						controlPanel.add(statusLabel);
						//statusLabel.setText("");
						statusLabel.setAlignmentX(Label.CENTER);
						statusLabel.setSize(350, 100);

		mainFrame.setVisible(true);
	}
}