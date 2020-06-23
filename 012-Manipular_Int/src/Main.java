/*
Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, que separe ese número en sus dígitos
individuales y los imprima, cada uno separado de los demás por tres espacios.[Sugerencia: es posible hacer este ejercicio con las
técnicas básicas. Necesitará utilizar los operadores de división y residuo para “seleccionar” cada dígito].
 */
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int num;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Este programa recibe un int de 5 dígitos y lo retorna con 3 espacios entre ellos");
        
        System.out.print("Ingrese entero de 5 dígitos: ");
        num = in.nextInt();
        
        System.out.printf("%d   %d   %d   %d   %d\n", (num - num % 10000)/10000, (num % 10000 - num % 1000)/1000,
                 (num % 1000 - num % 100)/100, (num % 100 - num % 10)/10, (num % 10));
    }
}
