import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class SwingLogin extends JFrame{

private JPanel loginPanel = new JPanel(new GridLayout(3, 2));
private JLabel idLabel = new JLabel("���̵� ");
private JLabel pwLabel = new JLabel("��й�ȣ ");
private JTextField idText = new JTextField();
private JPasswordField pwText = new JPasswordField();
private JButton loginBtn = new JButton("�α���");
private JButton idpwSearchBtn = new JButton("���̵�/��й�ȣ ã��");

public SwingLogin() {

super("�α��� â");
this.setContentPane(loginPanel);

loginPanel.add(idLabel);
loginPanel.add(pwLabel);
loginPanel.add(idText);
loginPanel.add(pwText);
loginPanel.add(idpwSearchBtn);
loginPanel.add(loginBtn);

//�� ��� ����
idLabel.setHorizontalAlignment(NORMAL);
pwLabel.setHorizontalAlignment(NORMAL);

//���� ������ â ��� ���� setSize�� ���� ���־�� ���������� �������� ��� ������ ��!

setSize(350,150);
this.setLocationRelativeTo(null);
this.setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//�α��� ��ư�� ��������

loginBtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

//���̵� ��� Ȯ�� �׽�Ʈ �ڵ�~

String id = idText.getText().trim();

String pw = pwText.getText().trim();




if(id.length()==0 || pw.length()==0) {

JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �Է� �ϼž� �˴ϴ�.", "���̵� ����� �Է�!", JOptionPane.DEFAULT_OPTION);

return;

}




if(id.equals("test") && pw.equals("test1")) {

JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);

return;

}




JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);


}

});




//���̵� ��й�ȣ ã�� ��ư�� ��������

idpwSearchBtn.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

JOptionPane.showMessageDialog(null, "���̵� ��� ã�� ���~~", "���̵�/��й�ȣ ã��", JOptionPane.DEFAULT_OPTION);

}

});


}


public static void main(String[] args) {

new SwingLogin();

}

}