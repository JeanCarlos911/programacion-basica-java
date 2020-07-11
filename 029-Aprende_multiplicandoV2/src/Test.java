
import java.util.Random;
import java.util.Scanner;

public class Test {

    private enum Estado{CONTINUAR, FINALIZAR, CORRECTO, INCORRECTO};
    private Estado estado;
    private Scanner in;
    private Random random;
    
    public void empezar() {
        random = new Random();
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
            imprimir(Estado.CORRECTO);
            return true;
        }else if(entrada.equals("terminar")){
            estado = Estado.FINALIZAR;
            return true;
        }else{
            imprimir(Estado.INCORRECTO);
            return false;
        }
    }
    
    private void imprimir(Estado e){
        int a = random.nextInt(4);
        if(e == Estado.CORRECTO){
            switch (a){
                case 0:
                    System.out.println("Muy bien!");
                    break;
                case 1:
                    System.out.println("Excelente!");
                    break;
                case 2:
                    System.out.println("Buen trabajo!");
                    break;
                case 3:
                    System.out.println("Sigue así!");
                    break;
            }
        }else{
            switch (a){
                case 0:
                    System.out.println("No. Por favor intenta de nuevo.");
                    break;
                case 1:
                    System.out.println("Incorrecto. Intenta una vez más.");
                    break;
                case 2:
                    System.out.println("No te rindas!");
                    break;
                case 3:
                    System.out.println("No. Sigue intentando.");
                    break;
            }
        }
    }
    
}