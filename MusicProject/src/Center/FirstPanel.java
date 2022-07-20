package Center;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class FirstPanel extends JPanel {
 
    BufferedImage image;
    
    public FirstPanel() {
        
        try {
            image = ImageIO.read(new File("C:\\Temp\\main.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);        
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1900,750);        
    }
}
