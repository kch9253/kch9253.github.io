import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main2 extends JFrame{
	public Main2() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("��ư");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�׼� �̺�Ʈ �߻�");
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {  // MouseAdapter = �߻�Ŭ���� / ���콺�̺�Ʈ ���� ȣ�������ʰ� �ʿ��Ѱ͸� ����ϱ�����
			@Override // ��������Ʈ�� ���� �ʿ��� ��Ҹ� ȣ���Ͽ� ����ϸ��
			public void mousePressed(MouseEvent e) {
				System.out.println("���콺 preessed");
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
