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

// 닫기버튼 눌렀을때 팝업창 뜨게하는

class ExitDialog extends JDialog {
	private boolean exit;
	
	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?" , true);
		
		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("종료");
		JButton btnNo = new JButton("취소");
		
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
			public void windowClosing(WindowEvent e) { // 닫으려고 할때
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				boolean result = dialog.ShowDialog();
				
				int result = JOptionPane.showConfirmDialog // JOptionPane = 창의 닫기와 취소를 간단하게 생성하기위한
				(Main2.this , "종료하시겠습니까?", "종료확인", JOptionPane.YES_NO_OPTION);
//				JOptionPane.showInputDialog(Main2.this, "입력창");
				
				if (result == JOptionPane.YES_NO_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
			}
		});
		
		setSize(500,500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 닫기버튼을 눌렀을때 작동안함 / 이벤트는 발생하지만 행동은안함
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
