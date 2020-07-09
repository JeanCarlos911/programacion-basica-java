
import java.awt.Graphics;
import javax.swing.JPanel;

public class Ovals extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int yCenter = getHeight()/2;
        int xCenter = getWidth()/2;
        
        for(int i=1; i<13; i++){
           g.drawOval(xCenter - 10*i, yCenter - 10*i, i*20, i*20);
        }
    }
    
}