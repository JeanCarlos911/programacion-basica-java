
import java.util.Scanner;

/*
Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números del usuario e
imprima la suma, producto, diferencia y cociente (división) de los números.
*/
public class Main {
    public static void main(String args[]){
        //Declaración de variables
        Scanner in = new Scanner (System.in);
        int a, b;
        
        System.out.println("Este programa realiza la suma, resta, multiplicación y división de dos números enteros dados\n");
        
        System.out.print("Ingrese valor a: ");
        a = in.nextInt();
        
        System.out.print("Ingrese valor b: ");
        b = in.nextInt();
        
        System.out.println("\nLa suma es igual a: " + (a + b));
        System.out.println("La diferencia es igual a: " + (a - b));
        System.out.println("El producto es igual a: " + (a * b));
        System.out.println("El cociente es igual a: " + (a / b));
        
        System.exit(0);
    }
}
