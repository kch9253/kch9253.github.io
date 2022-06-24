import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Dimension;
import javax.swing.JLabel;

public class Main2 extends JFrame{
	public Main2() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("1"); // 체크가 가능한 박스생성
		JCheckBox check2 = new JCheckBox("2");
		JCheckBox check3 = new JCheckBox("3");
		JPanel pn2 = new JPanel();
		JCheckBox name1 = new JCheckBox("짜장면");
		JCheckBox name2 = new JCheckBox("짬뽕");
		JCheckBox name3 = new JCheckBox("탕수육");
		
		pnl.add(check1); // j페널안에있는 체크박스 3개를 호출하여
		pnl.add(check2);
		pnl.add(check3);
		SpringLayout sl_pn2 = new SpringLayout();
		sl_pn2.putConstraint(SpringLayout.NORTH, name3, 69, SpringLayout.SOUTH, name2);
		sl_pn2.putConstraint(SpringLayout.EAST, name3, 97, SpringLayout.WEST, name1);
		sl_pn2.putConstraint(SpringLayout.NORTH, name2, 6, SpringLayout.SOUTH, name1);
		sl_pn2.putConstraint(SpringLayout.WEST, name2, 0, SpringLayout.WEST, pn2);
		sl_pn2.putConstraint(SpringLayout.SOUTH, name2, -205, SpringLayout.SOUTH, pn2);
		sl_pn2.putConstraint(SpringLayout.EAST, name2, -266, SpringLayout.EAST, pn2);
		sl_pn2.putConstraint(SpringLayout.WEST, name3, 0, SpringLayout.WEST, name1);
		sl_pn2.putConstraint(SpringLayout.WEST, name1, 0, SpringLayout.WEST, pn2);
		sl_pn2.putConstraint(SpringLayout.EAST, name1, -317, SpringLayout.EAST, pn2);
		sl_pn2.putConstraint(SpringLayout.SOUTH, name1, 157, SpringLayout.NORTH, pn2);
		sl_pn2.putConstraint(SpringLayout.NORTH, name1, 10, SpringLayout.NORTH, pn2);
		pn2.setLayout(sl_pn2);
		
//		check1.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				lblNewLabel.setText("짜장 Checkbox: " + 
//				(e.getStateChange() == 1 ? "checked" : "unchecked"));
//			}
//		});
		
		pn2.add(name1);
		pn2.add(name2);
		pn2.add(name3);
		
		getContentPane().add(pnl);
		getContentPane().add(pn2);
		
		JLabel lblNewLabel = new JLabel("2500원");
		sl_pn2.putConstraint(SpringLayout.NORTH, lblNewLabel, 66, SpringLayout.NORTH, name1);
		pn2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("3000원");
		sl_pn2.putConstraint(SpringLayout.WEST, lblNewLabel_1, 103, SpringLayout.EAST, name2);
		sl_pn2.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		sl_pn2.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 39, SpringLayout.NORTH, name2);
		pn2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("5000원");
		sl_pn2.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, name3);
		sl_pn2.putConstraint(SpringLayout.WEST, lblNewLabel_2, 224, SpringLayout.EAST, name3);
		pn2.add(lblNewLabel_2);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 닫기위한
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
