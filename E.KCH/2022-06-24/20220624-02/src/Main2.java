import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {
	public static void main(String[] args) {
		// CLI
		
		// GUI
		// AWT / SWING = (AWT Ȯ�� - > SWING)
		// JavaFX
		
		// Android
		
		JFrame frame = new JFrame("�����Դϴ�");
		// frame.setTitle("�����Դϴ�"); // ���� ������ ���̶� ����������
		
		frame.getContentPane().add(new JLabel("Hello world")); // â�ȿ� ���ڸ� �������ִ�
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� �ݱ����� , â���ݾƶ�
		
		frame.setSize(500, 500); // â ������ 500x500
		frame.setVisible(true); // �� ������ 
	}
}
