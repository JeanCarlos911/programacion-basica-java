
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PruebaDibujo {
    
    public static void main (String[] args){
        JFrame ventana = new JFrame();
        
        Dibujo random = new Dibujo();
        
        ventana.add(random);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setSize(600, 600);
        ventana.setVisible(true);
    }
    
}
