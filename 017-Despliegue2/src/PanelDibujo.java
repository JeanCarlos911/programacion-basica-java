import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{
    
    public void paintComponent( Graphics g ){
        // llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent( g );

        int anchura = getWidth(); // anchura total
        int altura = getHeight(); // altura total

        int pasoX = anchura / 16;
        int pasoY = altura / 16;
        
        int posicionX = 0;
        int posicionY = 0;
        
        // dibujo
        int i = 0;
        while(i<16){
            g.drawLine( 0, 0, posicionX, altura - posicionY );//esquina 1
            g.drawLine( anchura, altura, posicionX, altura - posicionY );//esquina opuesta a 1
            g.drawLine( 0, altura, posicionX, posicionY );//esquina 3
            g.drawLine( anchura, 0, posicionX, posicionY );//esquina opuesta a 3
            posicionX += pasoX;
            posicionY += pasoY;
            i++;
        }
        
    }
}