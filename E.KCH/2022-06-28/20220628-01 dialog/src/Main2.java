import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// �ݱ��ư �������� �˾�â �߰��ϴ�

class ExitDialog extends JDialog {
	private boolean exit;
	
	public ExitDialog(JFrame owner) {
		super(owner, "�����Ͻðڽ��ϱ�?" , true);
		
		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("����");
		JButton btnNo = new JButton("���");
		
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exit = (e.getSource() == btnYes);
				dispose();
			}
		};
		btnYes.addActionListener(actionListener);
		btnNo.addActionListener(actionListener);
		
		pnl.add(btnYes);
		pnl.add(btnNo);
		
		add(pnl);
		setSize(250,250);
	}
	
	public boolean ShowDialog() {
		setVisible(true);
		
		return exit;
	}
}

public class Main2 extends JFrame{
	public Main2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { // �������� �Ҷ�
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				boolean result = dialog.ShowDialog();
				
				int result = JOptionPane.showConfirmDialog // JOptionPane = â�� �ݱ�� ��Ҹ� �����ϰ� �����ϱ�����
				(Main2.this , "�����Ͻðڽ��ϱ�?", "����Ȯ��", JOptionPane.YES_NO_OPTION);
//				JOptionPane.showInputDialog(Main2.this, "�Է�â");
				
				if (result == JOptionPane.YES_NO_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
			}
		});
		
		setSize(500,500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // �ݱ��ư�� �������� �۵����� / �̺�Ʈ�� �߻������� �ൿ������
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
