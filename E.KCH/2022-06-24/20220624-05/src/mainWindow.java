import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
class mainWindow extends JFrame{
        private static final long serialVersionUID = 1L;
        JPanel main=new JPanel(new BorderLayout()),mainNorth=new JPanel(new FlowLayout(FlowLayout.CENTER)),
                        mainCenter=new JPanel(new FlowLayout(FlowLayout.CENTER));
        static JTextField input=new JTextField(5),result=new JTextField(25);
        JLabel text=new JLabel("거리를 마일 단위로 입력하시오");
        mainWindow() {
                super("마일을 킬로미터로 변환");
                add(main);
                main.add(mainNorth,BorderLayout.NORTH);
                mainNorth.add(text);
                mainNorth.add(input);
                input.getDocument().addDocumentListener(new DocumentListener() {
                        public void insertUpdate(DocumentEvent e) {
                                inputListener();
                        }
                        public void removeUpdate(DocumentEvent e) {
                                inputListener();
                        }
                        public void changedUpdate(DocumentEvent e) {
                                inputListener();
                        }
                        public void inputListener() {
                                String setStr=null;
                                try {
                                        float view=(float)Math.round(Float.parseFloat(input.getText())*10000)/10000;
                                        setStr=view+"마일은 "+(float)Math.round(view*1.609*10000)/10000+"Km 입니다.";
                                        mainWindow.result.setText(setStr);
                                }
                                catch(NumberFormatException e) {
                                        mainWindow.result.setText("숫자를 입력해 주세요.");
                                }
                        }
                });
                main.add(mainCenter,BorderLayout.SOUTH);
                mainCenter.add(result);
                mainWindowOption();
        }
        void mainWindowOption(){
                setSize(300,100);
                setResizable(false);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(true);
        }
}

