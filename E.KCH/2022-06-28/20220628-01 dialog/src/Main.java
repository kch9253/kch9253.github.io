import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog { // JDialog �� ����� �ּ�ȭ��ư,Ȯ���ư�� �������. (JFrame ������� �ּ�ȭ,Ȯ������)
	private JTextField tf;
	
	public SubWindow(JFrame owner) { // (JFrame owner) �ΰ�â�� �θ�����ڷ� ���޹ޱ����� �ؿ� ������������ ȣ�����ش�
		super(owner, true);
		setTitle("�ΰ� â");
		
		tf = new JTextField(10); // �ؽ�Ʈ�� �Է��ϱ�����
		add(tf, "North");
		
		// setModal(true); // â�� ���������� �ٸ��۾� , ����� �����Ҽ������� �����ϴ±�� (â���� ���� �ٸ��� Ŭ���ϸ� Ŭ���ȵ�)
		
		JButton btn = new JButton("�ٸ� ��ư");
		add(btn);
		
		btn.addActionListener(new ActionListener() { // �׼Ǹ����ʸ� ���� �ΰ�â ��� 
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // ���α׷��� �����ϴ� ���� �ƴ϶�, ������ frame�� ����
			}
		});
		
		setSize(500, 500);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // ����â�̵� ����â�̵� �����ϳ��� ������ �����°� �����ϱ�����
	}								// â�� ���������� ���� EXIT_ON_CLOSE �� ���� â�� ������ ���δٲ�����
									// �׼Ǹ����ʿ� ������ �����ص� 
	public String showDialog() {
		setVisible(true); // ����â���� ���� �Է����� â�� ������ ����â���� ���� ��µȴ�
			
		return tf.getText();
	}
}								


public class Main extends JFrame{
	public Main() {
		super("�ֿ� â");	
		
		JButton btn = new JButton("��ư");
		add(btn);
		
		btn.addActionListener(new ActionListener() { // �׼Ǹ����ʸ� ���� �ΰ�â ��� 
			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main.this); // ����â �Է��Ѱ��� ����â���� ����ϱ�����
				String result = dialog.showDialog(); // ����â �Է��Ѱ��� ����â���� ����ϱ�����
				System.out.println("�̹����� ���� ȣ���?");
				
				btn.setText(result); // ����â �Է��Ѱ��� ����â���� ����ϱ�����
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
