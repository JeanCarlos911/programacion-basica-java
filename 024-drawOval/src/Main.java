
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        JFrame ventana = new JFrame();
        
        Ovals dibujo = new Ovals();
        ventana.add(dibujo);
        
        ventana.setSize(300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
