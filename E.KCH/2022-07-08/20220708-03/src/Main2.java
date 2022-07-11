import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


// 메모장기능 textArea에 입력한내용이 파일로 저장되게끔했음

public class Main2{
        public static void main (String [] args) {
                test_Frame tf = new test_Frame();
        }
}
                       
class test_Frame extends JFrame implements ActionListener{
       
        private JFileChooser jfc = new JFileChooser();
        private JButton jbt_open = new JButton("열기");
        private JButton jbt_save = new JButton("저장");
        private JLabel jlb = new JLabel(" ");
        private JTextArea ja = new JTextArea(10,13);
    
        public test_Frame(){
                super("메모장");
                this.init();
                this.start();
                this.setSize(400,300);
                this.setVisible(true);
        }
        public void init(){
                getContentPane().setLayout(new FlowLayout());
                add(jbt_open);
                add(jbt_save);
                add(jlb);
                add(ja);
                ja.setEditable(true);
                
        }
        public void start(){
                jbt_open.addActionListener(this);
                jbt_save.addActionListener(this);
 
                jfc.setFileFilter(new FileNameExtensionFilter("txt", "txt"));
                jfc.setMultiSelectionEnabled(false);
        }
 
        @Override
        public void actionPerformed(ActionEvent arg0) {
                if(arg0.getSource() == jbt_open){
                        if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                                jlb.setText("열기 경로 : " + jfc.getSelectedFile().toString());
                                
                                
                              
                        }
                        
                        
                        
                        
                        
                }else if(arg0.getSource() == jbt_save){
                        if(jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                                jlb.setText("저장 경로 : " + jfc.getSelectedFile().toString() + "." + jfc.getFileFilter().getDescription());
                                
                                File file1 = jfc.getSelectedFile();
                                PrintWriter pw =  null;
                                try {
                                	pw = new PrintWriter(new FileWriter(file1));
                                	pw.println(ja.getText());
                                	pw.flush(); 
                                } catch (IOException e) {
                        			e.printStackTrace();
                        		} finally {
                        			if (pw != null) {
                        				pw.close();
                        			}
                        		}
                        	}
                		}
                
        }
}
