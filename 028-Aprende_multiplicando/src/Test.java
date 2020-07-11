
import java.util.Random;
import java.util.Scanner;

public class Test {

    private enum Estado{CONTINUAR, FINALIZAR};
    private Estado estado;
    private Scanner in;
    
    public void empezar() {
        Random random = new Random();
        in = new Scanner(System.in);
        
        estado = Estado.CONTINUAR;
        int a, b;
        String c;// a * b = c
        
        while(estado == Estado.CONTINUAR){
            a = 1 + random.nextInt(10);
            b = 1 + random.nextInt(10);
            c = Integer.toString(a * b);
            
            while(!preguntar(a, b, c)){
                if(preguntar(a, b, c)){
                    break;
                }
            }
        }
        System.out.println("Ejecución finalizada exitosamente");
    }
    
    private boolean preguntar(int a, int b, String c){
        System.out.println("¿Cuánto es " + a + " por " + b + "?");
        String entrada = in.nextLine();

        if(entrada.equals(c)){
            System.out.println("Muy bien!");
            return true;
        }else if(entrada.equals("terminar")){
            estado = Estado.FINALIZAR;
            return true;
        }else{
            System.out.println("No. Por favor intenta de nuevo.");
            return false;
        }
    }
    
}
