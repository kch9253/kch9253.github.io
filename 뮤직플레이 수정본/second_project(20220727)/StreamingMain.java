import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

// import UserManagement.UserDefaultJTableDAO;
// import UserManagement.UserJDailogGUI;
import kr.co.greenart.dbutil.DBUtil;


public class StreamingMain extends JFrame implements ActionListener {
   private static Scanner sc;
   private String user_id;
   PlayListDaoImp dao = new PlayListDaoImp(); // 창희수정
   
   public StreamingMain(String user_id) throws SQLException {
      super("Streaming Main");
      
      
      this.user_id = user_id;
      JPanel total = new JPanel();
      JPanel top = new JPanel();
      JPanel bottom = new JPanel();
      JPanel buttons = new JPanel();

      total.setBackground(Color.white); // 창희수정 (블랙으로)
      top.setBackground(Color.white);
      bottom.setBackground(Color.white);
      buttons.setBackground(Color.white);
      
      List<Integer> checkIndex = new ArrayList<>();
      // top & 메인 배너
   
      SpringLayout sl_total = new SpringLayout();

      sl_total.putConstraint(SpringLayout.SOUTH, buttons, -135, SpringLayout.SOUTH, total);
      total.setLayout(sl_total);

      total.add(top);
      total.add(bottom);

      JPanel rank_panel = new JPanel();
      sl_total.putConstraint(SpringLayout.NORTH, rank_panel, 31, SpringLayout.NORTH, total);
      sl_total.putConstraint(SpringLayout.WEST, rank_panel, 26, SpringLayout.WEST, total);
      sl_total.putConstraint(SpringLayout.SOUTH, rank_panel, -30, SpringLayout.SOUTH, total);
      total.add(rank_panel);
      rank_panel.setBackground(Color.black); // 창희추가수정

      JPanel panel = new JPanel();
      sl_total.putConstraint(SpringLayout.NORTH, panel, 31, SpringLayout.NORTH, total);
      sl_total.putConstraint(SpringLayout.WEST, panel, 378, SpringLayout.WEST, total);
      sl_total.putConstraint(SpringLayout.EAST, panel, -25, SpringLayout.EAST, total);
      sl_total.putConstraint(SpringLayout.EAST, rank_panel, -12, SpringLayout.WEST, panel);
      panel.setBackground(Color.black); // 창희추가        ///////////////////
      
      SpringLayout sl_rank_panel = new SpringLayout();
      rank_panel.setLayout(sl_rank_panel);
      //--------------------------------------------------22-0715
      JLabel lblNewLabel = new JLabel("                                    순위 차트 ( 1 ~ 10 )"); // 창희수정
      sl_rank_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, rank_panel);
      rank_panel.add(lblNewLabel);
      lblNewLabel.setForeground(Color.white); // 창희추가
      total.add(panel);
      SpringLayout sl_panel = new SpringLayout();
      panel.setLayout(sl_panel);

      JButton MyPage = new JButton(new ImageIcon("src/img/리스트마이페이지.png"));
      MyPage.setBorderPainted(false); // 버튼외곽선 없애줌
      MyPage.setContentAreaFilled(false);
      sl_panel.putConstraint(SpringLayout.WEST, MyPage, 43, SpringLayout.WEST, panel);
      panel.add(MyPage);

      JButton logoutBtn = new JButton(new ImageIcon("src/img/로그아웃.png")); // 로그아웃 (창희수정)
      logoutBtn.setBorderPainted(false); // 버튼외곽선 없애줌
      logoutBtn.setContentAreaFilled(false); // 버튼 투명하게설정
      sl_panel.putConstraint(SpringLayout.NORTH, logoutBtn, 0, SpringLayout.NORTH, MyPage);
      sl_panel.putConstraint(SpringLayout.SOUTH, logoutBtn, -26, SpringLayout.SOUTH, panel);
      sl_panel.putConstraint(SpringLayout.EAST, logoutBtn, -42, SpringLayout.EAST, panel);
      panel.add(logoutBtn);

      JButton playlistBtn = new JButton(new ImageIcon("src/img/플레이리스트.png"));
      playlistBtn.setBorderPainted(false); // 버튼외곽선 없애줌
      playlistBtn.setContentAreaFilled(false); // 버튼 투명하게설정
      sl_panel.putConstraint(SpringLayout.WEST, playlistBtn, 189, SpringLayout.WEST, panel);
      sl_panel.putConstraint(SpringLayout.EAST, playlistBtn, -187, SpringLayout.EAST, panel);
      sl_panel.putConstraint(SpringLayout.WEST, logoutBtn, 30, SpringLayout.EAST, playlistBtn);
      sl_panel.putConstraint(SpringLayout.EAST, MyPage, -31, SpringLayout.WEST, playlistBtn);
      sl_panel.putConstraint(SpringLayout.NORTH, playlistBtn, 0, SpringLayout.NORTH, MyPage);
      sl_panel.putConstraint(SpringLayout.SOUTH, playlistBtn, -26, SpringLayout.SOUTH, panel);
      panel.add(playlistBtn);
      //--------------------------------------------------22-0726
      JLabel lblNewLabel_2 = new JLabel(findUsersName(user_id) + "님 환영합니다.");
      sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 10, SpringLayout.NORTH, panel);
      sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -89, SpringLayout.SOUTH, panel);
      sl_panel.putConstraint(SpringLayout.NORTH, MyPage, 26, SpringLayout.SOUTH, lblNewLabel_2);
      sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, MyPage);
      sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, -320, SpringLayout.EAST, panel);
      lblNewLabel_2.setForeground(Color.white); // 창희추가
      panel.add(lblNewLabel_2);
      
      
      playlistBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

            new MusicPlayerGUI(user_id).setVisible(true);
         }
      });
      
      MyPage.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			MyPage frame = new MyPage(user_id);
			frame.setResizable(false);
			frame.setSize(400,380);
			frame.setVisible(true);
			
		}
	});

      getContentPane().add(total);
      
      JPanel panel_1 = new JPanel();
      sl_total.putConstraint(SpringLayout.SOUTH, panel, -11, SpringLayout.NORTH, panel_1);
      sl_total.putConstraint(SpringLayout.EAST, panel_1, -25, SpringLayout.EAST, total);
      
      JLabel lblNewLabel_3 = new JLabel("           My Page");
      sl_panel.putConstraint(SpringLayout.SOUTH, MyPage, -6, SpringLayout.NORTH, lblNewLabel_3);
      sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 116, SpringLayout.NORTH, panel);
      sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, MyPage);
      sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, MyPage);
      panel.add(lblNewLabel_3);
      lblNewLabel_3.setForeground(Color.cyan);
      
      JLabel lblNewLabel_4 = new JLabel("           Play List"); // 창희수정
      sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, playlistBtn);
      sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -5, SpringLayout.SOUTH, panel);
      sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, playlistBtn);
      panel.add(lblNewLabel_4);
      lblNewLabel_4.setForeground(Color.cyan);
      
      JLabel lblNewLabel_5 = new JLabel("            LogOut"); // 창희수정
      sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, logoutBtn);
      sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, -5, SpringLayout.SOUTH, panel);
      sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_5, 0, SpringLayout.EAST, logoutBtn);
      panel.add(lblNewLabel_5);
      lblNewLabel_5.setForeground(Color.cyan);
      
      JLabel lblNewLabel_6 = new JLabel(new ImageIcon("src/img/스마일.png"));
      sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 4, SpringLayout.NORTH, lblNewLabel_2);
      sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 1, SpringLayout.EAST, lblNewLabel_2);
      sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, 0, SpringLayout.SOUTH, lblNewLabel_2);
      panel.add(lblNewLabel_6);
      sl_total.putConstraint(SpringLayout.NORTH, panel_1, 178, SpringLayout.NORTH, total);
      sl_total.putConstraint(SpringLayout.WEST, panel_1, 378, SpringLayout.WEST, total);
      sl_total.putConstraint(SpringLayout.SOUTH, panel_1, -30, SpringLayout.SOUTH, total);
      
      JPanel rankPanel1 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, rankPanel1);
      sl_rank_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, rankPanel1);
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel1, 52, SpringLayout.NORTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, rankPanel1);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel1, -10, SpringLayout.EAST, rank_panel);
      rank_panel.add(rankPanel1);
      rankPanel1.setBackground(Color.black); // 창희추가
      
      JPanel rankPanel2 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel1, -6, SpringLayout.NORTH, rankPanel2);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel2, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel2, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel1, 0, SpringLayout.WEST, rankPanel2);
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel2, 82, SpringLayout.NORTH, rank_panel);
      rank_panel.add(rankPanel2);
      rankPanel2.setBackground(Color.black); // 창희추가
      
      JPanel rankPanel3 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel3, 112, SpringLayout.NORTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel3, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel3, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel2, -6, SpringLayout.NORTH, rankPanel3);
      SpringLayout sl_rankPanel2 = new SpringLayout();
      rankPanel2.setLayout(sl_rankPanel2);
      rank_panel.add(rankPanel3);
      rankPanel3.setBackground(Color.black); // 창희추가
      
      JPanel rankPanel4 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel4, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel4, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel3, -6, SpringLayout.NORTH, rankPanel4);
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel4, 142, SpringLayout.NORTH, rank_panel);
      SpringLayout sl_rankPanel3 = new SpringLayout();
      rankPanel3.setLayout(sl_rankPanel3);
      rank_panel.add(rankPanel4);
      rankPanel4.setBackground(Color.black); // 창희추가
      
      JPanel rankPanel5 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel5, 172, SpringLayout.NORTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel5, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel5, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel4, -6, SpringLayout.NORTH, rankPanel5);
      SpringLayout sl_rankPanel4 = new SpringLayout();
      rankPanel4.setLayout(sl_rankPanel4);
      rank_panel.add(rankPanel5);
      rankPanel5.setBackground(Color.black); // 창희추가
      
      JPanel rankPanel6 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel6, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel6, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel5, -6, SpringLayout.NORTH, rankPanel6);
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel6, 202, SpringLayout.NORTH, rank_panel);
      SpringLayout sl_rankPanel5 = new SpringLayout();
      rankPanel5.setLayout(sl_rankPanel5);
      rank_panel.add(rankPanel6);
      rankPanel6.setBackground(Color.black); // 창희추가
      
      JPanel rankPanel7 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel7, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel7, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel6, -6, SpringLayout.NORTH, rankPanel7);
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel7, 232, SpringLayout.NORTH, rank_panel);
      SpringLayout sl_rankPanel6 = new SpringLayout();
      rankPanel6.setLayout(sl_rankPanel6);
      rankPanel7.setBackground(Color.black); // 창희추가
      
      
      JPanel rankPanel8 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel8, 262, SpringLayout.NORTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel8, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel8, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel7, -6, SpringLayout.NORTH, rankPanel8);
      SpringLayout sl_rankPanel7 = new SpringLayout();
      rankPanel7.setLayout(sl_rankPanel7);
      rankPanel8.setBackground(Color.black); // 창희추가
      
      
      JPanel rankPanel9 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel8, -6, SpringLayout.NORTH, rankPanel9);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel9, -81, SpringLayout.SOUTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel9, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel9, -10, SpringLayout.EAST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel9, 292, SpringLayout.NORTH, rank_panel);
      SpringLayout sl_rankPanel8 = new SpringLayout();
      rankPanel8.setLayout(sl_rankPanel8);
      rankPanel9.setBackground(Color.black); // 창희추가
      
      
      JPanel rankPanel10 = new JPanel();
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankPanel10, 397, SpringLayout.NORTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankPanel10, 10, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, rankPanel10, -65, SpringLayout.SOUTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, rankPanel10, -10, SpringLayout.EAST, rank_panel);
      SpringLayout sl_rankPanel9 = new SpringLayout();
      rankPanel9.setLayout(sl_rankPanel9);
      rankPanel10.setBackground(Color.black); // 창희추가
      
   
      
      JCheckBox[] rankCheck = new JCheckBox[11];
      
      OrderByRank obr = new OrderByRank();
      
      rankCheck[1] = new JCheckBox(obr.showInfor(1));
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankCheck[1], 5, SpringLayout.NORTH, rankPanel1);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankCheck[1], 58, SpringLayout.WEST, rankPanel1);
      rankPanel1.add(rankCheck[1]);
      rank_panel.add(rankPanel10);
      SpringLayout sl_rankPanel10 = new SpringLayout();
      rankPanel10.setLayout(sl_rankPanel10);
      
      
       rankCheck[2] = new JCheckBox(obr.showInfor(2));
      sl_rankPanel2.putConstraint(SpringLayout.NORTH, rankCheck[2], 0, SpringLayout.NORTH, rankPanel2);
      sl_rankPanel2.putConstraint(SpringLayout.WEST, rankCheck[2], 0, SpringLayout.WEST, rankPanel2);
      rankPanel2.add(rankCheck[2]);
   
            
       rankCheck[3] = new JCheckBox(obr.showInfor(3));
      sl_rankPanel3.putConstraint(SpringLayout.NORTH, rankCheck[3], 0, SpringLayout.NORTH, rankPanel3);
      sl_rankPanel3.putConstraint(SpringLayout.WEST, rankCheck[3], 0, SpringLayout.WEST, rankPanel3);
      rankPanel3.add(rankCheck[3]);
   
      
        rankCheck[4] = new JCheckBox(obr.showInfor(4));
      sl_rankPanel4.putConstraint(SpringLayout.NORTH, rankCheck[4], 0, SpringLayout.NORTH, rankPanel4);
      sl_rankPanel4.putConstraint(SpringLayout.WEST, rankCheck[4], 0, SpringLayout.WEST, rankPanel4);
      rankPanel4.add(rankCheck[4]);
      
      
        rankCheck[5] = new JCheckBox(obr.showInfor(5));
      sl_rankPanel5.putConstraint(SpringLayout.NORTH, rankCheck[5], 0, SpringLayout.NORTH, rankPanel5);
      sl_rankPanel5.putConstraint(SpringLayout.WEST, rankCheck[5], 0, SpringLayout.WEST, rankPanel5);
      rankPanel5.add(rankCheck[5]);
      total.add(panel_1);
   
        rankCheck[6] = new JCheckBox(obr.showInfor(6));
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankCheck[6], 0, SpringLayout.NORTH, rankPanel6);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankCheck[6], 0, SpringLayout.WEST, rankPanel6);
      rankPanel6.add(rankCheck[6]);
      rank_panel.add(rankPanel7);
   
      
        rankCheck[7] = new JCheckBox(obr.showInfor(7));
      sl_rank_panel.putConstraint(SpringLayout.NORTH, rankCheck[7], 0, SpringLayout.NORTH, rankPanel7);
      sl_rank_panel.putConstraint(SpringLayout.WEST, rankCheck[7], 0, SpringLayout.WEST, rankPanel7);
      rankPanel7.add(rankCheck[7]);
      rank_panel.add(rankPanel8);
      
        rankCheck[8] = new JCheckBox(obr.showInfor(8));
      sl_rankPanel8.putConstraint(SpringLayout.NORTH, rankCheck[8], 0, SpringLayout.NORTH, rankPanel8);
      sl_rankPanel8.putConstraint(SpringLayout.WEST, rankCheck[8], 0, SpringLayout.WEST, rankPanel8);
      rankPanel8.add(rankCheck[8]);
      rank_panel.add(rankPanel9);
   
      
        rankCheck[9] = new JCheckBox(obr.showInfor(9));
      sl_rankPanel9.putConstraint(SpringLayout.NORTH, rankCheck[9], 0, SpringLayout.NORTH, rankPanel9);
      sl_rankPanel9.putConstraint(SpringLayout.WEST, rankCheck[9], 0, SpringLayout.WEST, rankPanel9);
      rankPanel9.add(rankCheck[9]);
      SpringLayout sl_rankPanel1 = new SpringLayout();
      rankPanel1.setLayout(sl_rankPanel1);
   
      
        rankCheck[10] = new JCheckBox(obr.showInfor(10));
      sl_rankPanel10.putConstraint(SpringLayout.NORTH, rankCheck[10], 0, SpringLayout.NORTH, rankPanel10);
      sl_rankPanel10.putConstraint(SpringLayout.WEST, rankCheck[10], 0, SpringLayout.WEST, rankPanel10);
      rankPanel10.add(rankCheck[10]);
   
      JButton btnNewButton = new JButton(new ImageIcon("src/img/플레이리스트담기.png"));
      sl_rank_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, rankPanel9);
      sl_rank_panel.putConstraint(SpringLayout.WEST, btnNewButton, 278, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -26, SpringLayout.SOUTH, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, rank_panel);
      btnNewButton.setBorderPainted(false); // 창희추가
      btnNewButton.setContentAreaFilled(false); // 창희추가
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < rankCheck.length; i++ ) {
               if (rankCheck[i].isSelected()) {
                  list.add(i);
               }
            }
            
            if(list.size() == 0) {
               JOptionPane.showMessageDialog(null, "곡을 하나 이상 담아주세요.");
            }
            
            else {
               JOptionPane.showMessageDialog(null, "정상적으로 플레이리스트에 담겼습니다.");
               
               for(int i = 1; i < rankCheck.length; i++ ) {      // 체크박스 초기화
                  rankCheck[i].setSelected(false);
               }
               
               for(int i = 0; i < list.size(); i++) {             // 플레이리스트 테이블에 데이터 입력
                  
                  insertPL( user_id,  list.get(i));
               }
            }
         }
      });
      rank_panel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton(new ImageIcon("src/img/플레이리스트전부.png"));
      sl_rank_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, rankPanel9);
      sl_rank_panel.putConstraint(SpringLayout.WEST, btnNewButton_1, 220, SpringLayout.WEST, rank_panel);
      
       sl_rank_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -26, SpringLayout.NORTH, rankPanel10);
      sl_rank_panel.putConstraint(SpringLayout.EAST, btnNewButton_1, -6, SpringLayout.WEST, btnNewButton);
       btnNewButton_1.setBorderPainted(false); // 창희추가
       btnNewButton_1.setContentAreaFilled(false); // 창희추가
      btnNewButton_1.addActionListener(new ActionListener() { // 창희추가
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuJTabaleExam_ch dialog = new MenuJTabaleExam_ch(StreamingMain.this); // 플레이리스트 서브창 생성
				dialog.show();
			}
		});
      rank_panel.add(btnNewButton_1);
      
      JLabel lblNewLabel_7 = new JLabel(" Add List");
      sl_rank_panel.putConstraint(SpringLayout.WEST, lblNewLabel_7, 0, SpringLayout.WEST, btnNewButton);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_7, -6, SpringLayout.NORTH, rankPanel10);
      sl_rank_panel.putConstraint(SpringLayout.EAST, lblNewLabel_7, 0, SpringLayout.EAST, lblNewLabel);
      rank_panel.add(lblNewLabel_7);
      lblNewLabel_7.setForeground(Color.cyan);
      
      JLabel lblNewLabel_8 = new JLabel("  All List");
      sl_rank_panel.putConstraint(SpringLayout.WEST, lblNewLabel_8, 220, SpringLayout.WEST, rank_panel);
      sl_rank_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_8, -6, SpringLayout.NORTH, rankPanel10);
      rank_panel.add(lblNewLabel_8);
      lblNewLabel_8.setForeground(Color.cyan);
      

      
      
      SpringLayout sl_panel_1 = new SpringLayout();
      panel_1.setLayout(sl_panel_1);
      
      JLabel lblNewLabel_1 = new JLabel(new ImageIcon("src/img/광고메인.jpg"));
      sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, panel_1);
      sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, panel_1);
      sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 250, SpringLayout.NORTH, panel_1);
      sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1, 491, SpringLayout.WEST, panel_1);
      panel_1.add(lblNewLabel_1);

      // 구매하기 버튼 연결

      setSize(900, 487);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);// 창이 가운데 나오게
      setVisible(true);
      setResizable(false);// 창의 크기를 변경하지 못하게
   }

   
   private String findUsersName(String user_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String name = "";
		try {
			conn = DBUtil.getConnection();
			String sql = "SELECT user_name FROM users WHERE user_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				name =  rs.getString("user_name");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			DBUtil.closeRS(rs);
			DBUtil.closeRS(rs);
		}
		return name;

	}
   
   public static int insertPL(String user_id, int now_rank) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      int result = 0;

      try {
         conn = DBUtil.getConnection();
         pstmt = conn.prepareStatement("INSERT INTO playlist VALUES(?, (SELECT music_id FROM musics WHERE now_rank = ?))");

         pstmt.setString(1, user_id);
         pstmt.setInt(2, now_rank);
      
         result = pstmt.executeUpdate();

      } catch (SQLException e) {
         e.printStackTrace();

      } finally { // 사용한 커넥션 닫아주기
         DBUtil.closeStmt(pstmt);
         DBUtil.closeConn(conn);
      }
      return result;
   }
   
   
   

   
	public static void main(String[] args) throws SQLException {
		String user_id = "choi";
		new StreamingMain(user_id);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
