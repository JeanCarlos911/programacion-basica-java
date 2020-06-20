/*
Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
 a) Mostrar el mensaje "Escriba un entero:", dejando el cursor en la misma línea.
 b) Asignar el producto de las variables b y c a la variable a.
 c) Indicar que un programa va a realizar un cálculo de nómina de muestra (es decir, usar texto que ayude a
documentar un programa).
POSIBLE SOLUCIÓN A CONTINUACIÓN*/

//Este programa va a realizar un cálculo de nómica de muestra
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        //Creamos variables y objetos
        Scanner in = new Scanner(System.in); //Creamos objeto de tipo Scanner para recibir datos de entrada por consola
        int a = 0; //Variable entera que almacena el producto de b y c
        int b = 0; //Variable numérica denominada b
        int c = 0; //Variable numérica denominada c
        
        //Ejecucion del programa
        System.out.println("Este programa realiza el producto entre dos enteros dados");
        
        System.out.print("Escriba un entero: ");
        b = in.nextInt();
        
        System.out.print("Inserte segundo valor entero: ");
        c = in.nextInt();
        
        a = b * c;
        System.out.println("El producto da como resultado " + a);
        
    }
}
