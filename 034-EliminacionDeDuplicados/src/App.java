
import java.util.Scanner;

/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public class App {
    
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        
        boolean valido;
        int[] valores = new int[5];
        String valoresUnicos = "" ;
        
        for(int i=0; i<valores.length; i++){
            System.out.print("Ingrese valor no." + (i + 1) + ": ");
            valores[i] = in.nextInt();
            valido=true;
            
            for(int j=0; j<i;j++){
                if(valores[i] == valores[j]){
                    valido=false;
                }
            }
            
            if(valido){
                valoresUnicos += valores[i] + " ";
                System.out.println("No es duplicado.");
            }
            else
                System.out.println("Es un duplicado");
            
            System.out.println("Sus valores únicos introducidos son " + valoresUnicos);
        }
    }
    
}
