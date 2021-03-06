package Center;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
 
import javax.imageio.ImageIO;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
import DB.Album;
import DB.DBConnector;
 
public class ShowPanel extends JPanel{
 
    //전역 변수 설정
    private JPanel topPanel; // 카테고리 라벨들을 붙일 패널
    private JLabel[] topLbl; // 카테고리 라벨들
    
    private ArrayList<Album> data;
    private DBConnector dbc; 
    private JPanel centerPanel; // rowPanel 들을 붙일 패널
    
    
    private int chkCount = 0; // 체크박스를 선택한 개수를 담을 변수
    private JCheckBox chk; // 체크박스 
    private int[] ids;
    
    private static int chkID;
    private static LinkedList<Integer> chkIDs = new LinkedList<>();
    
    public ShowPanel() {
        setLayout(null);
        setVisible(true);
        
        //topPanel 영역 ------------------------------------------
        topPanel = new JPanel();
        topPanel.setBounds(0, 0, 1900, 50);
        topPanel.setLayout(null);
        add(topPanel);
        
        topLbl = new JLabel[7];
        String[] topLblText = {"선택", "앨범사진", "제목", "가수명", "발매일",
                "장르", "앨범명"};
        Font font = new Font("D2Coding", Font.BOLD, 20);
        for (int i = 0; i < topLbl.length; i++) {
            topLbl[i] = new JLabel();
            topLbl[i].setText(topLblText[i]);
            topLbl[i].setHorizontalAlignment((int)CENTER_ALIGNMENT);
            topLbl[i].setFont(font);
            topLbl[i].setBounds(i*270, 0, 270, 50);
            topPanel.add(topLbl[i]);
        }
        
        //centerPanel 영역 ---------------------------------------------
        data = new ArrayList<>();
        dbc = new DBConnector();
        centerPanel = new JPanel();
        centerPanel.setBounds(0, 50, 1900, 700);
        //centerPanel.setLayout(new GridLayout(data.size(), 1, 0, 0));
        centerPanel.setLayout(null);
        add(centerPanel);
                
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1900, 750);
    }
    //이미지를 그리는 inner class
    class DrawImgPanel extends JPanel{
        BufferedImage is;
        public DrawImgPanel(BufferedImage is) {
            this.is = is;
            
        }
        
        @Override
        public void paint(Graphics g) {
            g.drawImage(is, 70, 0, 120, 100, null);
        }
        
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(270, 100);
        }
    }
    //show method - db에서 음악 목록을 불러와서 뿌려준다.
    public void showMethod(){
        centerPanel.removeAll();
        data.clear();
        data = dbc.showDB();
        JPanel[] rowPanel = new JPanel[data.size()];
        chk = new JCheckBox();
        ids = new int[data.size()];
        for (int i = 0; i < data.size(); i++) {
            rowPanel[i] = new JPanel();
            rowPanel[i].setLayout(null);
            
            Integer id = data.get(i).getId();
                        
            chk = new JCheckBox();    
            chk.setBounds(120, 25, 50, 50);
            chk.addItemListener(new ItemListener() {
                
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == e.SELECTED){
                        chkCount++;
                        chkIDs.add(id);
                        System.out.println(chkIDs);
                        
                    }else if(e.getStateChange() == e.DESELECTED){
                        chkCount--;
                        chkIDs.remove(id);
                        System.out.println(chkIDs);
                    }                    
                    
                }
            });
            InputStream picture = data.get(i).getPicture();
            DrawImgPanel imgPanel = null;
            try {
                imgPanel = new DrawImgPanel(ImageIO.read(picture));
                imgPanel.setBounds(270, 0, 270, 100);                
            } catch (IOException e) {}
                        
            String name = data.get(i).getName();
            String singer = data.get(i).getSinger();
            String date = data.get(i).getDate();
            String genre = data.get(i).getGenre();
            String title = data.get(i).getTitle();
            
            JLabel[] contentsLbl = new JLabel[5];
            for (int j = 0; j < contentsLbl.length; j++) {
                contentsLbl[j] = new JLabel();
            }
            contentsLbl[0].setText(name);
            contentsLbl[0].setBounds(540, 0, 270, 100);
            contentsLbl[0].setHorizontalAlignment((int)CENTER_ALIGNMENT);
            contentsLbl[1].setText(singer);
            contentsLbl[1].setBounds(810, 0, 270, 100);
            contentsLbl[1].setHorizontalAlignment((int)CENTER_ALIGNMENT);
            contentsLbl[2].setText(date);
            contentsLbl[2].setBounds(1080, 0, 270, 100);
            contentsLbl[2].setHorizontalAlignment((int)CENTER_ALIGNMENT);
            contentsLbl[3].setText(genre);
            contentsLbl[3].setBounds(1350, 0, 270, 100);
            contentsLbl[3].setHorizontalAlignment((int)CENTER_ALIGNMENT);
            contentsLbl[4].setText(title);
            contentsLbl[4].setBounds(1620, 0, 270, 100);
            contentsLbl[4].setHorizontalAlignment((int)CENTER_ALIGNMENT);
                        
            rowPanel[i].add(chk);
            rowPanel[i].add(imgPanel);
            rowPanel[i].add(contentsLbl[0]);
            rowPanel[i].add(contentsLbl[1]);
            rowPanel[i].add(contentsLbl[2]);
            rowPanel[i].add(contentsLbl[3]);
            rowPanel[i].add(contentsLbl[4]);
            
            rowPanel[i].setBounds(0, i*110, 1900, 100);
 
            centerPanel.add(rowPanel[i]);
        }
        
    }    
    
    public int getChk(){
        return chkCount;
    }
    
    public int getChkID(){
        if(chkIDs.size()==1){
            chkID = chkIDs.get(0);
        }
        return chkID;
    }
    
    public LinkedList<Integer> getChkIDs(){
        return chkIDs;
    }
    
}
