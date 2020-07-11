
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Dibujo extends JPanel{

    private enum Figura {OVAL, RECT};
    private Figura figuraActual;
    private Random random;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        random = new Random();
        
        int width = getWidth();
        int height = getHeight();
        
        for(int i=0; i<10; i++){
            g.setColor(colorRamdon());
            setRandomFigure();
            if(figuraActual == Figura.OVAL){
                g.fillOval(random.nextInt(width), random.nextInt(height), random.nextInt(width/2), random.nextInt(height/2));
            }else{
                g.fillRect(random.nextInt(width), random.nextInt(height), random.nextInt(width/2), random.nextInt(height/2));
            }
        }
    }

    private Color colorRamdon() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        
        return new Color(r, g, b);
    }
    
    private void setRandomFigure() {
        int num = random.nextInt(2);
        switch(num){
            case 0:
                figuraActual = Figura.OVAL;
                break;
            case 1:
                figuraActual = Figura.RECT;
        }
    }
    
}
