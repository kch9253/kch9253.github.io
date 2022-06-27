import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	public Main() {
		MouseListener listner = new MouseListener() { // �г�â�� ���콺�̺�Ʈ�߻�
			
			@Override
			public void mouseReleased(MouseEvent e) { // �ѹ�Ŭ���� ���ؼ� Released or Pressed �����ϳ�������
				System.out.println("��");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("����");
			}
			
			@Override
			public void mouseExited(MouseEvent e) { // ���콺�� �г� ������ ���� ������
				System.out.println("����");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) { // ���콺�� �г� ������ ������ ������
				System.out.println("����");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println("1��"); // ���콺 ���ʴ����� 1��
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2��"); // ���콺 �� ������ 2��
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3��"); // ���콺 ������ ������ 3��
				}
				
				System.out.println("���ʹ�ư��? " + SwingUtilities.isLeftMouseButton(e));
				// SwingUtilities.isLeftMouseButton = ��,��,������ Ŭ�������� ��,���������� ���� ������ �´��� �ƴ��� �˷���
				// isLeftMouseButton = ���ʼ����� �س��� ������ ���������� true ���̶�
				
				if (e.getClickCount() == 2) { // getClickCount = ����Ŭ���Ҷ� �ַξ���
					System.out.println("����Ŭ��");
				}
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) { // ���콺�� �����̴°��� e.getX,Y ������ ��ǥ�� Ȯ���Ҽ��ִ�
				System.out.println("���콺 ������" + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		};
		
		JPanel pnl = new JPanel();
		//pnl.addMouseListener(listner);  // �� ���콺�̺�Ʈ ȣ��
		pnl.addMouseMotionListener(motion); // �� ���콺��Ǹ����� (���콺������ , ��ǥ) ȣ��
	
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
