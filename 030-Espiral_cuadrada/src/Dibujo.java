
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel{

    private enum Direccion{ARRIBA, ABAJO, IZQUIERDA, DERECHA};
    private Direccion dir;
    
    public void paintComponent( Graphics g ){
        super.paintComponent( g );
        int largo = 20;
        int punto[] = {getWidth()/2, getHeight()/2};//[0] : x, [1] : y
        dir = Direccion.DERECHA;
        
        for(int i=0; i<150; i++){
            switch(dir){
                case ARRIBA:
                    g.drawLine(punto[0], punto[1], punto[0], punto[1] - largo);
                    punto[1] -= largo;
                    largo += 20;
                    dir = Direccion.DERECHA;
                    break;
                case DERECHA:
                    g.drawLine(punto[0], punto[1], punto[0] + largo, punto[1]);
                    punto[0] += largo;
                    dir = Direccion.ABAJO;
                    break;
                case ABAJO:
                    g.drawLine(punto[0], punto[1], punto[0], punto[1] + largo);
                    punto[1] += largo;
                    largo += 20;
                    dir = Direccion.IZQUIERDA;
                    break;
                case IZQUIERDA:
                    g.drawLine(punto[0], punto[1], punto[0] - largo, punto[1]);
                    punto[0] -= largo;
                    dir = Direccion.ARRIBA;
                    break;
            }
        }
    }
    
}