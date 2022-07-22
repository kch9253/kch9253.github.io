package Center;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
import DB.DBConnector;
import Dialog.SuccessDialog;
 
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dialog;
 
public class InsertPanel extends JPanel implements ActionListener{
    
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;
    private JButton btn1, btn2, btn3;
    private JFrame jf;
    private FileDialog fd1;
    private InputStream fis, musicFis;
    private String picName, musicName;
    private int picLength, musicLength;
    public InsertPanel() {
        setLayout(null);
        
        lb1 = new JLabel("곡명");
        lb1.setBounds(34, 34, 62, 18);
        add(lb1);
                
        lb2 = new JLabel("발매일");
        lb2.setBounds(34, 64, 62, 18);
        add(lb2);
                
        lb3 = new JLabel("가수");
        lb3.setBounds(34, 94, 62, 18);
        add(lb3);
        
        lb4 = new JLabel("앨범명");
        lb4.setBounds(34, 124, 62, 18);
        add(lb4);
        
        lb5 = new JLabel("장르");
        lb5.setBounds(34, 154, 62, 18);
        add(lb5);
        
        tf1 = new JTextField();
        tf1.setBounds(106, 31, 330, 24);
        add(tf1);
        tf1.setColumns(10);
        
        tf2 = new JTextField();
        tf2.setBounds(106, 61, 330, 24);
        add(tf2);
        tf2.setColumns(10);
        
        tf3 = new JTextField();
        tf3.setBounds(106, 91, 330, 24);
        add(tf3);
        tf3.setColumns(10);
        
        tf4 = new JTextField();
        tf4.setBounds(106, 121, 330, 24);
        add(tf4);
        tf4.setColumns(10);
        
        tf5 = new JTextField();
        tf5.setBounds(106, 151, 330, 24);
        add(tf5);
        tf5.setColumns(10);
        
        lb6 = new JLabel("사진");
        lb6.setBounds(34, 188, 62, 18);
        add(lb6);
        
        lb7 = new JLabel("");
        lb7.setBounds(106, 188, 200, 24);
        add(lb7);
        
        lb8 = new JLabel("음악");
        lb8.setBounds(34, 222, 62, 18);
        add(lb8);
        
        lb9 = new JLabel("");
        lb9.setBounds(106, 222, 200, 24);
        add(lb9);
        
        btn1 = new JButton("사진넣기");
        btn1.setBounds(93, 272, 105, 39);
        btn1.addActionListener(this);
        add(btn1);
        
        btn2 = new JButton("저장");
        btn2.setBounds(331, 272, 105, 39);
        btn2.addActionListener(this);
        add(btn2);
        
        btn3 = new JButton("음악넣기");
        btn3.setBounds(212, 272, 105, 39);
        btn3.addActionListener(this);
        add(btn3);
        
        JSeparator separator = new JSeparator();
        separator.setForeground(Color.BLACK);
        separator.setBounds(34, 257, 400, 2);
        add(separator);
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 500);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //사진 넣기
        if(e.getSource() == btn1){
            try {
                jf = new JFrame();
                jf.setSize(300, 300);
                jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
                
                fd1 = new FileDialog(jf, "사진을 선택하시오.", FileDialog.LOAD);
                fd1.setVisible(true);
                String fileDir = fd1.getDirectory(); // 선택한 파일 경로가져옴
                String fileName = fd1.getFile(); // 파일이름,확장자
                
                File file = new File(fileDir + fileName);
                fis = new FileInputStream(file);
                picName = fileDir + fileName;
                picLength = (int) file.length();
                
                lb7.setText(fileDir + "\\" + fileName);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        //저장
        if(e.getSource() == btn2){
            String name = tf1.getText().toString();
            String date = tf2.getText().toString();
            String singer = tf3.getText().toString();
            String title = tf4.getText().toString();
            String genre = tf5.getText().toString();
            DBConnector dbc = new DBConnector();
            dbc.insertDB(name, date, singer, title, genre, fis, picName, picLength, musicFis, musicName, musicLength);
            
            SuccessDialog sd = new SuccessDialog();
            Dialog dl = new Dialog(sd);
            
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            lb7.setText("");
            lb9.setText("");
            
        }
        //음악 넣기
        if(e.getSource() == btn3){
            try {
                jf = new JFrame();
                jf.setSize(300, 300);
                jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
                
                fd1 = new FileDialog(jf, "음악을 선택하시오.", FileDialog.LOAD);
                fd1.setVisible(true);
                String fileDir = fd1.getDirectory(); // 선택한 파일 경로가져옴
                String fileName = fd1.getFile(); // 파일이름,확장자
                
                File file = new File(fileDir + fileName);
                musicFis = new FileInputStream(file);
                musicName = fileDir + fileName;
                musicLength = (int) file.length();
                
                lb9.setText(fileDir + "\\" + fileName);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
