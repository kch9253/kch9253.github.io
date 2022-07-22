package Frame;
 
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
 
import Center.FirstPanel;
import Center.InsertPanel;
import Center.ShowPanel;
import Dialog.DeleteConfirmDialog;
import Dialog.ListPlzDialog;
import Dialog.ListPlzDialog2;
import Dialog.OneChkPlzDialog;
import Dialog.OneChkPlzDialog2;
import Head.CategoriPanel;
import Head.TitlePanel;
 
public class MainFrame extends JFrame implements ActionListener, MouseListener{
    
    private JPanel northPanel;
    private JPanel centerPanel;
    private TitlePanel tp;
    private CategoriPanel cp;
    private FirstPanel fp;
    private InsertPanel ip;
    private ShowPanel sp;
        
    public MainFrame() {
        setTitle("메인화면");
        setSize(1900, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        //Head
        northPanel = new JPanel();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
        
        //Head - 메인화면으로
        tp = new TitlePanel();
        tp.addMouseListener(this);
        northPanel.add(tp);
        
        //Head - 음악 목록 보기
        cp = new CategoriPanel();
        cp.getShowAlbumListBtn().addActionListener(this);
        
        //Head - 음악 추가
        cp.getInsertAlbumBtn().addActionListener(this);
        
        //Head - 음악 수정
        cp.getUpdateAlbumBtn().addActionListener(this);
        
        //Head - 음악 삭제
        cp.getDeleteAlbumBtn().addActionListener(this);
        
        //Head - 음악 듣기
        cp.getStartMusicBtn().addActionListener(this);
        northPanel.add(cp);
        add(northPanel, BorderLayout.NORTH);
        
        //Center
        centerPanel = new JPanel();
            
        //Center - 첫패널
        fp = new FirstPanel();
        fp.setVisible(true);
        centerPanel.add(fp);
        
        //Center - 음악 목록 보기 패널
        sp = new ShowPanel();
        sp.setVisible(false);
        centerPanel.add(sp);
        
        //Center - 음악 추가 패널
        ip = new InsertPanel();
        ip.setVisible(false);
        centerPanel.add(ip);
        
        //Center - scrollpane
        JScrollPane scroll = new JScrollPane(centerPanel);
        //scroll.setSize(1900, 700);
        //scroll.setLocation(0, 50);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setViewportView(centerPanel);
        
        add(scroll, BorderLayout.CENTER);
                
        //add(centerPanel, BorderLayout.CENTER);
        
        
        setVisible(true);
    }
 
    //Head btn events
    @Override
    public void actionPerformed(ActionEvent e) {
        //음악 목록 보기 버튼을 눌렸을 때
        if(e.getSource()==cp.getShowAlbumListBtn()){
            sp.showMethod();
            //sp.repaint();
            fp.setVisible(false);
            ip.setVisible(false);
            sp.setVisible(true);
            
        }
        //음악 삽입 버튼을 눌렸을 때
            if(e.getSource()==cp.getInsertAlbumBtn()){
                fp.setVisible(false);
                sp.setVisible(false);
                ip.setVisible(true);
            }
        //음악 수정 버튼을 눌렸을 때
        if(e.getSource()==cp.getUpdateAlbumBtn()){
            //음악 수정은 음악 목록 보기에서 체크 되어 있을 때만 가능
            //음악 목록 보기가 활성화 되어 있는지 확인
            if(sp.isVisible()){
                if(sp.getChk()==1){ // 음악이 1개만 선택 되어 있다면?
                    UpdateFrame uf = new UpdateFrame();                    
                    fp.setVisible(false);
                    ip.setVisible(false);
                    sp.setVisible(false);
                }else{ // 음악이 선택되지 않았거나 여러개 선택되었다면?
                    new Dialog(new OneChkPlzDialog());
                    fp.setVisible(false);
                    ip.setVisible(false);
                    sp.setVisible(true);
                }
            }else{ //음악 목록 보기가 활성화 되어 있지 않다면?
                new Dialog(new ListPlzDialog());
                fp.setVisible(false);
                ip.setVisible(false);
                sp.setVisible(true);
            }
            
        }
        //삭제 버튼을 눌렸을 때
        if(e.getSource() == cp.getDeleteAlbumBtn()){
            //음악 삭제도 음악 목록 보기에서 체크 되어 있을 때만 가능
            //음악 목록 보기가 활성화 되어 있는지 확인
            if(sp.isVisible()){
                if(sp.getChk()==0){ // 음악이 선택 되어 있지않다면?
                    new Dialog(new OneChkPlzDialog2());
                    fp.setVisible(false);
                    ip.setVisible(false);
                    sp.setVisible(true);
                }else{ 
                    DeleteConfirmDialog dcd = new DeleteConfirmDialog();
                    fp.setVisible(false);
                    ip.setVisible(false);
                    sp.setVisible(true);
                }                
            }else{ //음악 목록 보기가 활성화 되어 있지 않다면?
                new Dialog(new ListPlzDialog());
                fp.setVisible(false);
                ip.setVisible(false);
                sp.setVisible(true);
            }
        }
        //음악 듣기 버튼을 눌렸을 때
        if(e.getSource() == cp.getStartMusicBtn()){
            //음악 듣기도 음악 목록 보기에서 체크되어 있을 때만 가능
            //음악 목록 보기가 활성화 되어 있는지 확인
            if(sp.isVisible()){
                if(sp.getChk()==1){ // 음악이 1개만 선택 되어 있다면?
                    MusicFrame mf = new MusicFrame();            
                    fp.setVisible(false);
                    ip.setVisible(false);
                    sp.setVisible(true);
                }else{ // 음악이 선택되지 않았거나 여러개 선택되었다면?
                    new Dialog(new OneChkPlzDialog());
                    fp.setVisible(false);
                    ip.setVisible(false);
                    sp.setVisible(true);
                }
            }else{ //음악 목록 보기가 활성화 되어 있지 않다면?
                new Dialog(new ListPlzDialog2());
                fp.setVisible(false);
                ip.setVisible(false);
                sp.setVisible(true);
            }
            
            
        }
    }
 
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==tp){
            sp.setVisible(false);
            ip.setVisible(false);
            fp.setVisible(true);
        }
        
    }
 
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
 
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
 
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
 
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
