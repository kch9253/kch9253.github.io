import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	public Main() {
		MouseListener listner = new MouseListener() { // 패널창에 마우스이벤트발생
			
			@Override
			public void mouseReleased(MouseEvent e) { // 한번클릭에 대해선 Released or Pressed 둘중하나를쓴다
				System.out.println("땜");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("누름");
			}
			
			@Override
			public void mouseExited(MouseEvent e) { // 마우스를 패널 밖으로 빼면 반응함
				System.out.println("나감");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) { // 마우스를 패널 안으로 들어오면 반응함
				System.out.println("들어옴");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println("1번"); // 마우스 왼쪽누르면 1번
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2번"); // 마우스 휠 누르면 2번
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3번"); // 마우스 오른쪽 누르면 3번
				}
				
				System.out.println("왼쪽버튼임? " + SwingUtilities.isLeftMouseButton(e));
				// SwingUtilities.isLeftMouseButton = 왼,휠,오른쪽 클릭했을때 참,거짓값으로 내가 누른게 맞는지 아닌지 알려줌
				// isLeftMouseButton = 왼쪽설정을 해놔서 왼쪽을 눌렀을때만 true 값이뜸
				
				if (e.getClickCount() == 2) { // getClickCount = 더블클릭할때 주로쓰임
					System.out.println("더블클릭");
				}
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) { // 마우스가 움직이는것을 e.getX,Y 를통해 좌표를 확인할수있다
				System.out.println("마우스 움직임" + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		};
		
		JPanel pnl = new JPanel();
		//pnl.addMouseListener(listner);  // 위 마우스이벤트 호출
		pnl.addMouseMotionListener(motion); // 위 마우스모션리스너 (마우스움직임 , 좌표) 호출
	
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
