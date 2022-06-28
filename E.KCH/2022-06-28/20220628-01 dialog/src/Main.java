import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog { // JDialog 를 쓸경우 최소화버튼,확장버튼이 사라진다. (JFrame 같은경우 최소화,확장있음)
	private JTextField tf;
	
	public SubWindow(JFrame owner) { // (JFrame owner) 부가창을 부모생성자로 전달받기위해 밑에 제이프레임을 호출해준다
		super(owner, true);
		setTitle("부가 창");
		
		tf = new JTextField(10); // 텍스트를 입력하기위한
		add(tf, "North");
		
		// setModal(true); // 창을 생성했을때 다른작업 , 기능을 구현할수없도록 제어하는기능 (창열어 놓고 다른거 클릭하면 클릭안됨)
		
		JButton btn = new JButton("다른 버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() { // 액션리스너를 통해 부가창 출력 
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 프로그램을 종료하는 것이 아니라, 현재의 frame만 종료
			}
		});
		
		setSize(500, 500);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 메인창이든 서브창이든 둘중하나를 닫으면 꺼지는걸 방지하기위한
	}								// 창을 여러개만들어도 기존 EXIT_ON_CLOSE 를 통해 창을 닫으면 전부다꺼진다
									// 액션리스너에 디스포즈 생성해둠 
	public String showDialog() {
		setVisible(true); // 서브창에서 값을 입력한후 창을 닫으면 메인창으로 값이 출력된다
			
		return tf.getText();
	}
}								


public class Main extends JFrame{
	public Main() {
		super("주요 창");	
		
		JButton btn = new JButton("버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() { // 액션리스너를 통해 부가창 출력 
			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main.this); // 서브창 입력한값을 메인창으로 출력하기위한
				String result = dialog.showDialog(); // 서브창 입력한값을 메인창으로 출력하기위한
				System.out.println("이문장은 언제 호출됨?");
				
				btn.setText(result); // 서브창 입력한값을 메인창으로 출력하기위한
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
