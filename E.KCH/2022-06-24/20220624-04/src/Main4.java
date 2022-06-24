import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main4 extends JFrame{
	private JCheckBox box1;
	
	public Main4() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("cm->inch"); 
		JRadioButton rdb2 = new JRadioButton("inch->cm");
		box1 = new JCheckBox("변환");
		JLabel lblPrice = new JLabel("결과");
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdb1);
		group.add(rdb2); 
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(box1);
		pnl.add(lblPrice);
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	ItemListener itemListener = new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent e) {
		}
	};
	
//	private int inch() {
//		int inch = 0;
//		inch += rdb1.isSelected() ? 5000 : 0;
//		return inch;
//	}
	
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}








