
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PruebaDibujo {
    
    public static void main (String[] args){
        JFrame ventana = new JFrame();
        
        Dibujo tiroAlBlanco = new Dibujo();
        
        ventana.add(tiroAlBlanco);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setSize(500, 500);
        ventana.setVisible(true);
    }
    
}
