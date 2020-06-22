/*
Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e imprima el resultado.
[Sugerencia: use el operador residuo].
 */
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Este programa determina dados 2 enteros si el primero es múltiplo del segundo");
        
        System.out.print("Inserte primer entero: ");
        num1 = in.nextInt();
        
        System.out.print("Inserte segundo entero: ");
        num2 = in.nextInt();
        
        if(num1 % num2 == 0){
            System.out.println(num1 + " es múltiplo de " + num2);
        }else{
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}
