
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        double resultado = 1;
        
        System.out.println("\nEste programa calcula el factorial de un número entero positivo dado");
        
        System.out.print("\nIngrese valor: ");
        valor = in.nextInt();
        
        if(valor < 0){
            System.out.println( "Valor ingresado inválido" );
            main( new String[]{} );
        }else{
            if(valor > 0){
                for(int i=1; i<=valor; i++){
                    resultado *= i;
                }
            }
            System.out.printf(valor + "! = %.0f\n", resultado);
        } 
    }
}
