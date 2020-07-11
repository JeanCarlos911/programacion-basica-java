
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Dibujo extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int[] centro = new int[]{getWidth()/2, getHeight()/2};//[0]: x, [1]: y
        int radio = 35;
        int diametro = 2*radio;
        
        Color color1 = colorRamdon();
        Color color2 = colorRamdon();
        
        for(int i=5; i>0; i--){
            if( i % 2 == 0 )
                g.setColor(color1);
            else
                g.setColor(color2);
            
            g.fillOval(centro[0] - i*radio, centro[1] - i*radio, i*diametro, i * diametro);
        }
    }

    private Color colorRamdon() {
        Random random = new Random();
        
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        
        return new Color(r, g, b);
    }
    
}
