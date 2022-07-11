import java.io.File;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
//		chooser.showOpenDialog(null); // 열기창을 통해 파일들을 보여준다
		int result = chooser.showSaveDialog(null); // 저장창을 보여준다
		if (result == JFileChooser.APPROVE_OPTION) {
			System.out.println(result); // 파일을 선택하면 0 , 닫기버튼은 1
			
			File file = chooser.getSelectedFile();
			System.out.println("사용자가 선택한파일 : " + file.getAbsolutePath());
		}
	
		
	}
}
