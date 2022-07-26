//MenuJTabaleExam.java
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.SpringLayout;
import javax.swing.JScrollBar;


public class MenuJTabaleExam extends JFrame implements ActionListener {
	 JMenu m = new JMenu("관리");
	JMenuItem insert = new JMenuItem("가입");  // 회원가입할때쓰는거
	JMenuItem update = new JMenuItem("수정");
	JMenuItem delete = new JMenuItem("삭제");
	JMenuItem quit = new JMenuItem("종료");
	private String fieldName;
	
	String[] name = { "User Key" , "User Name" , "Favorite Genre", "Total Plays", "Last access Date" , "Total Users Favorite Genre"};
	// 테이블안안에 컬럼추가기능
	
	DefaultTableModel dt = new DefaultTableModel(name, 0);
	JTable jt = new JTable(dt);
	JScrollPane jsp = new JScrollPane(jt);

	/*
	 * South 영역에 추가할 Componet들
	 */
	JPanel p = new JPanel();
	String[] comboName = {"ALL", "User Key", "User Name", "Total Users Favorite Genre"};
	// 하단 검색기능구현
	JComboBox combo = new JComboBox(comboName);
	JTextField jtf = new JTextField(20);
	JButton serach = new JButton("검색");

	UserDefaultJTableDAO dao = new UserDefaultJTableDAO();
	private final JTextField textField = new JTextField();

	/**
	 * 화면구성 및 이벤트등록
	 */
	public MenuJTabaleExam() {
		
		super("User Management");
		textField.setColumns(10);
		setResizable(false);
		
		// South영역
		p.setBackground(Color.black);
		SpringLayout sl_p = new SpringLayout();
		sl_p.putConstraint(SpringLayout.SOUTH, serach, 0, SpringLayout.SOUTH, combo);
		sl_p.putConstraint(SpringLayout.SOUTH, combo, -10, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.NORTH, serach, 5, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, jtf, -10, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.WEST, serach, 656, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.NORTH, jtf, 6, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, jtf, 425, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.NORTH, combo, 6, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, combo, 231, SpringLayout.WEST, p);
		p.setLayout(sl_p);
		p.add(combo);
		p.add(jtf);
		p.add(serach);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, p, 0, SpringLayout.SOUTH, jsp);
		springLayout.putConstraint(SpringLayout.SOUTH, p, 0, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, jsp, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, jsp, 327, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, jsp, 0, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, jsp, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, p, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, p, 0, SpringLayout.EAST, getContentPane());
		getContentPane().setLayout(springLayout);

		getContentPane().add(jsp);
		
		jsp.setColumnHeaderView(textField);
		getContentPane().add(p);
		
		JButton btnNewButton = new JButton("나가기");
		sl_p.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, combo);
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton, -85, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton, 34, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, p);
		btnNewButton.addActionListener(new ActionListener() { // 돌아가기 버튼
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		p.add(btnNewButton);

		setSize(950, 400);
		setVisible(true);

		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 이벤트등록
		insert.addActionListener(this);  // 회원가입할때쓰는거
		update.addActionListener(this);
		delete.addActionListener(this);
		quit.addActionListener(this);
		serach.addActionListener(this);

		// 모든레코드를 검색하여 DefaultTableModle에 올리기
		dao.userSelectAll(dt);
		
		//첫번행 선택.
		if (dt.getRowCount() > 0)
			jt.setRowSelectionInterval(0, 0);

	}// 생성자끝

	/**
	 * main메소드 작성
	 */
	public static void main(String[] args) {
		new MenuJTabaleExam();
	}

	/**
	 * 가입/수정/삭제/검색기능을 담당하는 메소드
	 * */

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == insert) {// 가입 메뉴아이템 클릭
			// new UserJDailogGUI(this, "가입");

		} else if (e.getSource() == update) {// 수정 메뉴아이템 클릭
			// new UserJDailogGUI(this, "수정");

		} else if (e.getSource() == delete) {// 삭제 메뉴아이템 클릭
			// 현재 Jtable의 선택된 행과 열의 값을 얻어온다.
			int row = jt.getSelectedRow();
			System.out.println("선택행 : " + row);

			Object obj = jt.getValueAt(row, 0);// 행 열에 해당하는 value
			System.out.println("값 : " + obj);

			if (dao.userDelete(obj.toString()) > 0) {
				UserJDailogGUI.messageBox(this, "레코드 삭제되었습니다.");
				
				//리스트 갱신
				dao.userSelectAll(dt);
				if (dt.getRowCount() > 0)
					jt.setRowSelectionInterval(0, 0);

			} else {
				UserJDailogGUI.messageBox(this, "레코드가 삭제되지 않았습니다.");
			}

		} else if (e.getSource() == quit) {// 종료 메뉴아이템 클릭
			System.exit(0);

		} else if (e.getSource() == serach) {// 검색 버튼 클릭
			// JComboBox에 선택된 value 가져오기
			fieldName = combo.getSelectedItem().toString();
			System.out.println("필드명 " + fieldName);

			if (fieldName.trim().equals("ALL")) {// 전체검색
				dao.userSelectAll(dt);
				if (dt.getRowCount() > 0)
					jt.setRowSelectionInterval(0, 0);
			} else {
				if (jtf.getText().trim().equals("")) {
					UserJDailogGUI.messageBox(this, "검색단어를 입력해주세요!");
					jtf.requestFocus();
				} else {// 검색어를 입력했을경우
					dao.getUserSearch(dt, fieldName, jtf.getText());
					if (dt.getRowCount() > 0)
						jt.setRowSelectionInterval(0, 0);
				}
			}
		}

	}//actionPerformed()----------
}
