import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
	public Main() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째"); // 체크가 가능한 박스생성
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
//		check1.setSelected(true); // 첫번째 체크박스에 체크표시가 되어있게함
//		System.out.println(check2.isSelected());
		
//		check1.addActionListener(new ActionListener() { // 체크1번 박스를 클릭했을때 버튼을 눌렀는지 출력을 확인가능하게한
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 체크박스 누름");
//				System.out.println(check1.isSelected()); // 사용자가 체크누르면 참 , 체크없애면 거짓값뜸
//			}
//		});
		
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange(); // getStateChange = 참,거짓이 아닌 인트값으로 출력됨 체크박스 선택하면 1 선택안하면 2
				System.out.println(result == ItemEvent.DESELECTED); // 위에 getStateChange 선택하면 숫자가 출력되는데 그것을 참,거짓으로 출력되게 바꿔준값 : ItemEvent.DESELECTED
			}
		});
		
		pnl.add(check1); // j페널안에있는 체크박스 3개를 호출하여
		pnl.add(check2);
		pnl.add(check3);
		
		add(pnl); // 체크박스 전부를 나타내라
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 닫기위한
	}

	public static void main(String[] args) {
		new Main().setVisible(true); // new 를통해 위에 메인값에 지정해둔 값들을 .setVisible을 통해 구현하게함
	}

}
