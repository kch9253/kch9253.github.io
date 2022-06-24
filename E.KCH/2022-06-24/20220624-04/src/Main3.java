import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.acl.Group;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main3 extends JFrame{
	public Main3() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1"); // 체크박스 하나만 체크되기위한 값  / 다중체크 X
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		
		ButtonGroup group = new ButtonGroup(); // 체크박스 3개를 하나의 그룹으로 묶는 값인데 그룹으로 영역지정해둔거라 생각하면된다
		group.add(rdb1); // JRadioButton 는 하나씩 체크할수있는 기능인데 이 기능들을 버튼그룹으로 인해 영역지정을 해주고 그 영역에 해당하는 애들만 JRadioButton 값이 설정되도록 지정해줬다.
		group.add(rdb2); // JRadioButton 영역안에 지정되어있어야만 체크를 하나만 하는 기능을 구현할수있다 
		group.add(rdb3); // JRadioButton 영역을 지정안해준다면 하나씩 다중체크를 할수있다.
		
//		JRadioButton rdb4 = new JRadioButton("라디오4"); // 얘들은 그룹지정을 안해줬기때문에 따로 체크지정이 가능하다. 4번5번 중 하나만 체크가능.
//		JRadioButton rdb5 = new JRadioButton("라디오5");
		
		rdb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange() == ItemEvent.SELECTED);				
			}
		});
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
//		pnl.add(rdb4);
//		pnl.add(rdb5);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
