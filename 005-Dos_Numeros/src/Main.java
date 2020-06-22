/*
Escriba una aplicación que reciba tres enteros del usuario y muestre la suma, promedio, producto, menor y mayor de esos números.
Nota: el cálculo del promedio en este ejercicio debe resultar en una representación entera del promedio. Por lo tanto, si la suma
de los valores es 7, el promedio debe ser 2, no 2.3333...].
 */
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        //Declaración
        Scanner in = new Scanner(System.in);
        int a, b;
        
        System.out.println("Este programa recibe dos enteros e imprime el resultado con distintos operadores");
        
        System.out.print("Inserte valor a: ");
        a = in.nextInt();
        
        System.out.print("Inserte valor b: ");
        b = in.nextInt();
        
        System.out.println("La suma de los dos valores es: " + (a + b));
        System.out.println("El promedio entero de los dos valores es: " + ((a + b) / 2));
        if(a < b){
            System.out.println("El menor valor insertado es: " + a);
        }else{
            System.out.println("El menor valor insertado es: " + b);
        }
        if(a > b){
            System.out.println("El mayor valor insertado es: " + a);
        }else{
            System.out.println("El mayor valor insertado es: " + b);
        }
    }
}
