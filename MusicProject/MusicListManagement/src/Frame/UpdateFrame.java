package Frame;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
 
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
 
import Center.ShowPanel;
import DB.Album;
import DB.DBConnector;
import Dialog.SuccessDialog;
 
public class UpdateFrame extends JFrame {
 
    private ShowPanel sp;
    private int id;
    private DBConnector dbc;
    private Album ab;
    public UpdateFrame() {
        setBounds(700, 300, 500, 500);
        setDefaultCloseOperation(UpdateFrame.DISPOSE_ON_CLOSE);
        
        sp = new ShowPanel();
        id = sp.getChkID();
        dbc = new DBConnector();
        ab = new Album();
        ab = dbc.selectDB(id);
        
        UpdatePanel up = new UpdatePanel();
        add(up);
        setVisible(true);
    }
    class UpdatePanel extends JPanel implements ActionListener {
 
        private ImgPanel imgPanel;
        private JTextField tf1, tf2, tf3, tf4, tf5;
        private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;
        private JButton btn1, btn2, btn3;
        private String name ;
        private String date ;
        private String singer ;
        private String title ;
        private String genre ;
        private String picName;
        private InputStream picture = null;
        private int picLength;
        private InputStream fis = null;
        private int length = 0;
        private InputStream musicFis = null;
        private String musicName;
        private InputStream music = null;
        private int musicLength = 0;
        
                
        public UpdatePanel() {
            setSize(500, 500);
            setLayout(null);
            
            name = ab.getName();
            date = ab.getDate();
            singer = ab.getSinger();
            title = ab.getTitle();
            genre = ab.getGenre();
            picName = ab.getPicName();
            picture = ab.getPicture();
            picLength = ab.getPicLength();
            musicName = ab.getMusicName();
            music = ab.getMusic();
            musicLength = ab.getMusicLength();
            
            try {
                imgPanel = new ImgPanel(ImageIO.read(picture));
            } catch (IOException e) {
                e.printStackTrace();
            }
            imgPanel.setBounds(10, 10, 300, 300);
            add(imgPanel);
                        
            //곡명
            lb1 = new JLabel("곡명");
            lb1.setBounds(325, 10, 150, 25);
            add(lb1);
            
            tf1 = new JTextField();
            tf1.setBounds(325, 35, 150, 25);
            tf1.setText(name);
            add(tf1);
            
            
            //발매일
            lb2 = new JLabel("발매일");
            lb2.setBounds(325, 60, 150, 25);
            add(lb2);
            
            tf2 = new JTextField();
            tf2.setBounds(325, 85, 150, 25);
            tf2.setText(date);
            add(tf2);
            
            
            //가수
            lb3 = new JLabel("가수");
            lb3.setBounds(325, 110, 150, 25);
            add(lb3);
            
            tf3 = new JTextField();
            tf3.setBounds(325, 135, 150, 25);
            tf3.setText(singer);
            add(tf3);
            
            //앨범명
            lb4 = new JLabel("앨범명");
            lb4.setBounds(325, 160, 150, 25);
            add(lb4);
            
            tf4 = new JTextField();
            tf4.setBounds(325, 185, 150, 25);
            tf4.setText(title);
            add(tf4);
            
            //장르
            lb5 = new JLabel("장르");
            lb5.setBounds(325, 210, 150, 25);
            add(lb5);
            
            tf5 = new JTextField();
            tf5.setBounds(325, 235, 150, 25);
            tf5.setText(genre);
            add(tf5);
            
            //음악
            lb6 = new JLabel("음악");
            lb6.setBounds(325, 260, 150, 25);
            add(lb6);
            
            lb7 = new JLabel("");
            lb7.setBounds(325, 285, 150, 25);
            lb7.setText(musicName);
            add(lb7);
            
            //분리선
            JSeparator separator = new JSeparator();
            separator.setBounds(20, 325, 450, 5);
            add(separator);
            
            //저장 버튼
            btn1 = new JButton("저장");
            btn1.setBounds(320, 370, 120, 30);
            btn1.addActionListener(this);
            add(btn1);
            
            //사진 넣기 버튼
            btn2 = new JButton("사진넣기");
            btn2.setBounds(60, 370, 120, 30);
            btn2.addActionListener(this);
            add(btn2);
            
            //음악 넣기 버튼
            btn3 = new JButton("음악넣기");
            btn3.setBounds(190, 370, 120, 30);
            btn3.addActionListener(this);
            add(btn3);
            
        }
        class ImgPanel extends JPanel{
            BufferedImage is;
            public ImgPanel(BufferedImage is) {
                this.is = is;
                
            }
            
            public void imgChange(BufferedImage cImg){
                is = cImg;
            }
            
            @Override
            public void paint(Graphics g) {
                g.drawImage(is, 0, 0, 300, 300, null);
            }
            
 
            
            @Override
            public Dimension getPreferredSize() {
                
                return new Dimension(120, 120);
            }
        }
        //버튼 이벤트
        @Override
        public void actionPerformed(ActionEvent e) {
            //저장
            if(e.getSource() == btn1){
                name = tf1.getText().toString();
                date = tf2.getText().toString();
                singer = tf3.getText().toString();
                title = tf4.getText().toString();
                genre = tf5.getText().toString();
                if(fis != null){
                    picture = fis;
                }else{
                    File file = new File(picName);
                    try {
                        picture = new FileInputStream(file);
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }
                if(length == 0){
                    length = picLength;
                }
                
                dbc.updateDB(id, name, date, singer, title, genre, picName, picture, length, musicName, music, musicLength);
                new Dialog(new SuccessDialog());
                dispose();
            }
            //사진넣기
            if(e.getSource() == btn2){
                try {
                    JFrame jf = new JFrame();
                    jf.setSize(300, 300);
                    jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
                    
                    FileDialog fd1 = new FileDialog(jf, "사진을 선택하시오.", FileDialog.LOAD);
                    fd1.setVisible(true);
                    
                    String fileDir = fd1.getDirectory(); // 선택한 파일 경로가져옴
                    String fileName = fd1.getFile(); // 파일이름,확장자
                    
                    File file = new File(fileDir + fileName);
                    fis = new FileInputStream(file);
                    picName = fileDir + fileName;
                    length = (int) file.length();
                    
                    System.out.println(fileDir + fileName);
                    
                    /*remove(imgPanel);
                    imgPanel = new ImgPanel(ImageIO.read(file));
                    imgPanel.setBounds(10, 10, 300, 300);
                    add(imgPanel);
                    repaint();*/
                    
                    imgPanel.imgChange(ImageIO.read(file));
                    repaint();
                                                            
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            //음악 넣기
            if(e.getSource() == btn3){
                try {
                    JFrame jf = new JFrame();
                    jf.setSize(300, 300);
                    jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
                    
                    FileDialog fd1 = new FileDialog(jf, "음악을 선택하시오.", FileDialog.LOAD);
                    fd1.setVisible(true);
                    
                    String fileDir = fd1.getDirectory(); // 선택한 파일 경로가져옴
                    String fileName = fd1.getFile(); // 파일이름,확장자
                    
                    File file = new File(fileDir + fileName);
                    musicFis = new FileInputStream(file);
                    musicName = fileDir + fileName;
                    musicLength = (int) file.length();
                    
                    lb7.setText(musicName);
                                                                                                    
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
    
}
