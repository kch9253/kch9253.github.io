import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	private JButton btnEnable;
	private JButton btnDisable;
	private List<JButton> list;
	
	public Main4() {
		super("��ư Ȱ��ȭ �׽�Ʈ~");
		list = new ArrayList<>();
		
		JPanel pnl = new JPanel();
		btnEnable = new JButton("Ȱ��ȭ");
		btnDisable = new JButton("��Ȱ��ȭ");
		JButton btnNotShown = new JButton("���̳�??");
		
		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
		
//		btnDisable.setEnabled(false);
		btnNotShown.setVisible(false);
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		for (int i = 1; i <= 5; i++) {
			JButton btn = new JButton(String.valueOf(i));
			pnl.add(btn);
			
			list.add(btn);
		}
		
		add(pnl);
		
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			for (JButton btn : list) {
				btn.setEnabled(true);
			}
			} else {
				for (JButton btn : list) {
					btn.setEnabled(false);
				}
			}
		}
	
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}

