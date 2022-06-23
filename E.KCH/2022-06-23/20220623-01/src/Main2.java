import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {
	public static void main(String[] args) {
		// CLI
		
		// GUI
		// AWT / SWING = (AWT 확장 - > SWING)
		// JavaFX
		
		// Android
		
		JFrame frame = new JFrame("제목입니다");
		// frame.setTitle("제목입니다"); // 위에 선언한 값이랑 같은개념임
		
		frame.getContentPane().add(new JLabel("Hello world")); // 창안에 글자를 넣을수있는
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫기위한 , 창을닫아라
		
		frame.setSize(500, 500); // 창 사이즈 500x500
		frame.setVisible(true); // 참 거짓값 
	}
}
