import java.io.File;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
//		chooser.showOpenDialog(null); // ����â�� ���� ���ϵ��� �����ش�
		int result = chooser.showSaveDialog(null); // ����â�� �����ش�
		if (result == JFileChooser.APPROVE_OPTION) {
			System.out.println(result); // ������ �����ϸ� 0 , �ݱ��ư�� 1
			
			File file = chooser.getSelectedFile();
			System.out.println("����ڰ� ���������� : " + file.getAbsolutePath());
		}
	
		
	}
}
