package Dialog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
import Center.ShowPanel;
import DB.DBConnector;
 
public class DeleteConfirmDialog extends JFrame {
    
    private ShowPanel sp;
    private LinkedList<Integer> chkIDs;
    private DBConnector dbc;
    private JPanel btnPanel;
    
    public DeleteConfirmDialog() {
        setSize(500, 300);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize(); 
        setLocation(screenSize.width /2 - 250 ,screenSize.height/2 - 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        sp = new ShowPanel();
        chkIDs = sp.getChkIDs();
        dbc = new DBConnector();
        
        JLabel lbl = new JLabel("선택한 음악을 삭제하시겠습니까?");
        Font font = new Font("D2Coding", Font.BOLD, 20);
        lbl.setHorizontalAlignment((int)CENTER_ALIGNMENT);
        lbl.setFont(font);
        getContentPane().add(lbl, BorderLayout.CENTER);
        
        btnPanel = new JPanel();
        
        JButton btnOK = new JButton("확인");
        btnOK.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < chkIDs.size(); i++) {
                    dbc.deleteDB(chkIDs.get(i));
                }
                new SuccessDialog2();
                dispose();
            }
        });
        btnPanel.add(btnOK);
        
        JButton btnNO = new JButton("취소");
        btnNO.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                
            }
        });
        btnPanel.add(btnNO);
        
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
