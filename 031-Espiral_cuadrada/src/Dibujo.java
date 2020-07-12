
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel{
    
    private enum Direccion{DERECHA, IZQUIERDA};
    private Direccion dir;
    
    public void paintComponent(Graphics g){
        super.paintComponent( g );
        int cuadrado = 20;//tamaño del cuadrado de mi cuaderno
        int radio = cuadrado;
        int ancho = 2*cuadrado;
        int punto[] = {getWidth()/2 - radio, getHeight()/2};//[0] : x, [1] : y
        dir = Direccion.DERECHA;
        
        for(int i=0; i<80; i++){
            switch(dir){
                case DERECHA:
                    g.drawArc(punto[0], punto[1]-radio/2, radio, radio, 0, 180);
                    punto[0] -= ancho/2;
                    radio += cuadrado;
                    dir = Direccion.IZQUIERDA;
                    break;
                case IZQUIERDA:
                    g.drawArc(punto[0], punto[1]-radio/2, radio, radio, 0, -180);
                    radio += cuadrado;
                    dir = Direccion.DERECHA;
                    break;
            }
        }
    }
    
}
