
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PruebaDibujo {
    
    public static void main (String args[]){
        JFrame ventana = new JFrame();
        
        Dibujo espiralCuadrada = new Dibujo();
        ventana.add(espiralCuadrada);
        
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
