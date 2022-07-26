package UserManagement;
//MenuJTabaleExam.java
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import ManagerLogin.Management;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

import ManagerLogin.ManagerLogin;
import javax.swing.JLabel;

public class MenuJTabaleExam extends JDialog implements ActionListener {
	private String fieldName;
	
	String[] name = { "UserKey" , "UserName" , "FavoriteGenre", "TotalPlays", "LastaccessDate" };
	
	DefaultTableCellRenderer dtable = new DefaultTableCellRenderer(); // 텍스트 가운데 정렬하기위한 생성자
	
	DefaultTableModel dt = new DefaultTableModel(name,0) { // 테이블 안의 내용 더블클릭 , 수정 불가하게
		@Override
		public boolean isCellEditable(int rowlndex, int mCollndex) {
			return false;
		}
	};
	JTable jt = new JTable(dt);
	JScrollPane jsp = new JScrollPane(jt);
	/*
	 * South 영역에 추가할 Componet들
	 */
	JPanel p = new JPanel();
	String[] comboName = {"ALL", "UserKey", "UserName", "FavoriteGenre" , "LastaccessDate"};
	// 하단 검색기능구현
	JComboBox combo = new JComboBox(comboName);
	JTextField jtf = new JTextField(20);
	JButton serach = new JButton("검색");
	
	UserDefaultJTableDAO dao = new UserDefaultJTableDAO();
	/**
	 * 화면구성 및 이벤트등록
	 */
	public MenuJTabaleExam(Management management) {
		super(management , true);
		setTitle("User Management");
		
		// South영역
		p.setBackground(Color.black);
		SpringLayout sl_p = new SpringLayout();
		sl_p.putConstraint(SpringLayout.WEST, serach, 16, SpringLayout.EAST, jtf);
		sl_p.putConstraint(SpringLayout.SOUTH, serach, 0, SpringLayout.SOUTH, combo);
		sl_p.putConstraint(SpringLayout.WEST, jtf, 15, SpringLayout.EAST, combo);
		sl_p.putConstraint(SpringLayout.NORTH, serach, 0, SpringLayout.NORTH, combo);
		sl_p.putConstraint(SpringLayout.NORTH, combo, 7, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, combo, -7, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, jtf, 247, SpringLayout.EAST, combo);
		sl_p.putConstraint(SpringLayout.NORTH, jtf, 7, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.SOUTH, jtf, -7, SpringLayout.SOUTH, p);
		sl_p.putConstraint(SpringLayout.EAST, combo, -579, SpringLayout.EAST, p);
		p.setLayout(sl_p);
		p.add(combo);
		p.add(jtf);
		p.add(serach);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, jsp, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, p, 333, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, p, 0, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, jsp, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, jsp, 327, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, jsp, 0, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, p, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, p, 0, SpringLayout.EAST, getContentPane());
		getContentPane().setLayout(springLayout);

		getContentPane().add(jsp);
		
		getContentPane().add(p);
		
		JButton btnNewButton = new JButton("나가기");
		sl_p.putConstraint(SpringLayout.NORTH, btnNewButton, 7, SpringLayout.NORTH, p);
		sl_p.putConstraint(SpringLayout.WEST, btnNewButton, -85, SpringLayout.EAST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, combo);
		sl_p.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, p);
		btnNewButton.addActionListener(new ActionListener() { // 돌아가기 버튼
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		p.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Best Genre: "); // 얘는 그냥 라벨 제목임
		sl_p.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, p);
		lblNewLabel.setForeground(Color.white); // 폰트색상설정
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(13.0f)); // 폰트크기설정
		p.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("발라드말고뭐있냐"); // 얘한테 베스트장르 데이터값 집어넣어줘야함
		sl_p.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_p.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, lblNewLabel_1);
		sl_p.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, lblNewLabel_1);
		sl_p.putConstraint(SpringLayout.NORTH, lblNewLabel_1, -7, SpringLayout.NORTH, combo);
		sl_p.putConstraint(SpringLayout.WEST, lblNewLabel_1, 95, SpringLayout.WEST, p);
		sl_p.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 7, SpringLayout.SOUTH, combo);
		sl_p.putConstraint(SpringLayout.EAST, lblNewLabel_1, -6, SpringLayout.WEST, combo);
		lblNewLabel_1.setForeground(Color.white); // 폰트색상설정
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(12.0f));
		p.add(lblNewLabel_1);

		setSize(950, 400);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		// 이벤트등록
		serach.addActionListener(this);

		// 모든레코드를 검색하여 DefaultTableModle에 올리기
		dao.userSelectAll(dt);
		
		//첫번행 선택.
		if (dt.getRowCount() > 0)
			jt.setRowSelectionInterval(0, 0);
		
		jt.getTableHeader().setReorderingAllowed(false); // 테이블 열,행 조정불가
		jt.getTableHeader().setResizingAllowed(false); // 테이블 열,행 조정불가
		
		dtable.setHorizontalAlignment(SwingConstants.CENTER); // 정렬을 가운데 정렬로 지정
		  
		TableColumnModel tcolum = jt.getColumnModel(); // 정렬할 테이블(jt) 를 TableColumnModel 에 가져옴
		
		for (int i = 0; i < tcolum.getColumnCount(); i++) { // 반복문을 이용하여 추가 데이터를 계속 가운데정렬
			tcolum.getColumn(i).setCellRenderer(dtable);
		}
	}// 생성자끝

	/**
	 * main메소드 작성
	 */

	/**
	 * 가입/수정/삭제/검색기능을 담당하는 메소드
	 * */

	public void actionPerformed(ActionEvent e) { 
			if (e.getSource() == serach) {// 검색 버튼 클릭
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
