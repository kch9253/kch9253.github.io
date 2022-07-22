package Frame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
 
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
 
import Center.ShowPanel;
import DB.Album;
import DB.DBConnector;
import Frame.UpdateFrame.UpdatePanel.ImgPanel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
 
public class MusicFrame extends JFrame{
 
    private ShowPanel sp;
    private int id;
    private DBConnector dbc;
    private Album ab;
    
    
    
    public MusicFrame() {
        setTitle("뮤직 플레이어");
        setSize(500, 500);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize(); 
        setLocation(screenSize.width /2 - 250 ,screenSize.height/2 - 150);
        setDefaultCloseOperation(MusicFrame.DISPOSE_ON_CLOSE);
        
        sp = new ShowPanel();
        id = sp.getChkID();
        dbc = new DBConnector();
        ab = new Album();
        ab = dbc.selectDB(id);
        
        MusicPlayerPanel mpp = new MusicPlayerPanel();
        add(mpp);
                
        setVisible(true);
        
        
        
    }
    class MusicPlayerPanel extends JPanel implements ActionListener{
 
        private File musicFile;
        private InputStream isMusic;
        private AudioStream asMusic;
        private AudioPlayer apMusic;
        private JButton btnStart, btnChange, btnStop;
        private JLabel lblTitle, lblSinger;
        private String name, singer;
        private InputStream picture = null;
        private InputStream music = null;
        private ImgPanel2 imgPanel;
        
        public MusicPlayerPanel() {
            setSize(500,500);
            getContentPane().setLayout(null);
            
            name = ab.getName();
            singer = ab.getSinger();
            picture = ab.getPicture();
            music = ab.getMusic();
            
            btnStart = new JButton("음악시작");
            btnStart.setBounds(10, 400, 150, 30);
            btnStart.addActionListener(this);
            getContentPane().add(btnStart);
            
            btnChange = new JButton("음악변경");
            btnChange.setBounds(168, 400, 150, 30);
            btnChange.addActionListener(this);
            getContentPane().add(btnChange);
            
            btnStop = new JButton("음악정지");
            btnStop.setBounds(325, 400, 150, 30);
            btnStop.addActionListener(this);
            getContentPane().add(btnStop);
            
            try {
                imgPanel = new ImgPanel2(ImageIO.read(picture));
            } catch (Exception e) {
                e.printStackTrace();
            }
            imgPanel.setBounds(85, 10, 300, 300);
            getContentPane().add(imgPanel);
            
            lblTitle = new JLabel("\uC81C\uBAA9");
            lblTitle.setBounds(10, 320, 465, 25);
            lblTitle.setText(name);
            lblTitle.setHorizontalAlignment((int)CENTER_ALIGNMENT);
            getContentPane().add(lblTitle);
            
            lblSinger = new JLabel("\uAC00\uC218");
            lblSinger.setBounds(10, 350, 465, 25);
            lblSinger.setText(singer);
            lblSinger.setHorizontalAlignment((int)CENTER_ALIGNMENT);
            getContentPane().add(lblSinger);
                        
            apMusic = AudioPlayer.player;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnStart){
                playMusic();
            }else if(e.getSource()==btnChange){
                changeMusic();
            }else{
                stopMusic();
            }
            
        }
        //음악 실행
        public void playMusic(){
            try {
                asMusic = new AudioStream(music);
                apMusic.start(asMusic);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //음악 변경
        public void changeMusic(){
            //파일 열기 다이얼로그
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Audio(wav,au,mid,rmf)", "wav","au","mid","rmf");
            
            //만들어둔 JFileChooser에 파일 필터를 부착
            chooser.setFileFilter(filter);
            
            //파일 열기 다이얼로그 출력
            int ret = chooser.showOpenDialog(null);
            
            String filePath = chooser.getSelectedFile().getPath();
            String fileName = chooser.getSelectedFile().getName();
            
            //선택된 파일을 AudioStream 에 담기
            musicFile = new File(filePath);
            try {
                isMusic = new FileInputStream(musicFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        //음악 정지
        public void stopMusic(){
            apMusic.stop(asMusic);
        }
        //앨범 이미지 패널
        class ImgPanel2 extends JPanel{
            BufferedImage is;
            public ImgPanel2(BufferedImage is) {
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
    }
    
}
