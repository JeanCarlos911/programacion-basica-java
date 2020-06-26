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
            g.drawLine( anchura - posicionX, 0, 0, posicionY );//esquina 2
            g.drawLine( posicionX, altura, anchura, altura - posicionY );//esquina 3
            g.drawLine( anchura, altura - posicionY, anchura - posicionX, 0 );//esquina 4
            
            posicionX += pasoX;
            posicionY += pasoY;
            i++;
        }
        
    }
}