import java.awt.*;
import javax.swing.*;
 
public class JoinForm extends JPanel{
    private Image back;
   JLabel title=new JLabel("ȸ������", JLabel.CENTER);
   JLabel la1, la2, la3;
   JTextField tf1, tf2, tf3, tf4, tf5, tf6;
   JLabel dash=new JLabel("-");
   JButton b2=new JButton("�����ȣ �˻�");
   JPasswordField pf1, pf2;
   JRadioButton rb1, rb2;
   JTextArea ta;
   JCheckBox box1, box2, box3, box4, box5;
   JButton b1;
   JComboBox telBox=new JComboBox();
   JTextField tf7, tf8;
   JLabel dash2=new JLabel("-");
   JButton b3=new JButton("ȸ������");
   JButton b4=new JButton("���");
 
   //�ʱ�ȭ
   public JoinForm(){
       //back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
      la1=new JLabel("ID", JLabel.RIGHT);
      la2=new JLabel("��й�ȣ", JLabel.RIGHT);
      la3=new JLabel("���Է�", JLabel.RIGHT);
 
      tf1=new JTextField();
      tf2=new JTextField();
      tf3=new JTextField();
      tf4=new JTextField();
      tf5=new JTextField();
      tf6=new JTextField();
      tf7=new JTextField();
      tf8=new JTextField();
 
      pf1=new JPasswordField();
      pf2=new JPasswordField();
 
      rb1=new JRadioButton("����");
      rb2=new JRadioButton("����");
      ButtonGroup gb=new ButtonGroup();//�ϳ��� ���õǾ�� �ϱ� ������ �׷� ����
      gb.add(rb1);
      gb.add(rb2);
 
      b1=new JButton("�ߺ�üũ");
 
      title.setFont(new Font("���ʷҵ���", Font.BOLD, 40));//HTML:<h1><b>ȸ������</b></h1>
 
      //��ġ
      setLayout(null);
      title.setBounds(10, 15, 1000, 55);
      //�߰�
      add(title);
 
      la1.setBounds(300, 100, 80, 30);
      tf1.setBounds(385, 100, 200, 30);
      b1.setBounds(590, 100, 150, 30);
      add(la1);
      add(tf1);
      add(b1);
 
      la2.setBounds(300, 135, 80, 30);
      pf1.setBounds(385, 135, 200, 30);
      add(la2);
      add(pf1);
 
      la3.setBounds(300, 170, 80, 30);
      pf2.setBounds(385, 170, 200, 30);
      add(la3);
      add(pf2);
 

      
      telBox.addItem("010");
      telBox.addItem("011");
      telBox.addItem("017");
      
     
      telBox.setBounds(385, 380, 100, 30);
      tf7.setBounds(490, 380, 100, 30);
      dash2.setBounds(595, 380, 20, 30);
      tf8.setBounds(620, 380, 100, 30);
      
 
      
      ta=new JTextArea();
      JScrollPane js=new JScrollPane(ta);
      
      
      js.setBounds(385, 415, 400, 200);
    
      
      box1=new JCheckBox("������");
      box2=new JCheckBox("����Ʈ");
      box3=new JCheckBox("��ġ�");
      box4=new JCheckBox("����");
      box5=new JCheckBox("�ʹ�");
      
      JPanel p=new JPanel();
      p.add(box1); p.add(box2); p.add(box3); p.add(box4); p.add(box5);
     
      p.setBounds(385, 620, 400, 35);
      
      
      JPanel p2=new JPanel();
      p2.add(b3); p2.add(b4);       
      p2.setBounds(300, 665, 485, 35);
      add(p2);
      
      p.setOpaque(false);
      p2.setOpaque(false);
      rb1.setOpaque(false);
      rb2.setOpaque(false);
      box1.setOpaque(false);
      box2.setOpaque(false);
      box3.setOpaque(false);
      box4.setOpaque(false);
      box5.setOpaque(false);
   }
 
   @Override
   protected void paintComponent(Graphics g){
     g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
   }
 
   public static void main(String[] args){;

   }
}
