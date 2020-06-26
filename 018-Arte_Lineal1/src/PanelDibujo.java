import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{
    
    public void paintComponent( Graphics g ){
        // llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent( g );

        int anchura = getWidth(); // anchura total
        int altura = getHeight(); // altura total

        int pasoX = anchura / 15;
        int pasoY = altura / 15;
        
        int posicionX = 0;
        int posicionY = 0;
        
        // dibujo
        int i = 0;
        while(i<15){
            g.drawLine( 0, posicionY, posicionX, altura );//esquina 1
            
            posicionX += pasoX;
            posicionY += pasoY;
            i++;
        }
        
    }
}