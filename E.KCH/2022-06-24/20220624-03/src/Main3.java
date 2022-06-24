import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main3 extends JFrame{
	public Main3() {
		JPanel pnl = new JPanel();
		JCheckBox box1 = new JCheckBox();
		JLabel lblprice = new JLabel("가격표시");
		
		pnl.add(box1);
		pnl.add(lblprice);
		
		add(pnl);
		
//		box1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				boolean isSel = box1.isSelected();
//				lblprice.setText(isSel ? "선택됨" : "선택해제");
//			}
//		});
		
		box1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lblprice.setText(e.getStateChange() == ItemEvent.SELECTED ? "선택됨" : "선택헤제");
			}
		});
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		public static void main3Test(String[] args) {
//			new Main3().setVisible(true);
//		}

	}
}
