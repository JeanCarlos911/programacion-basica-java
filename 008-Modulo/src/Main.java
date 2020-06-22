/*
Escriba una aplicación que lea un entero y que determine e imprima si es impar o par. [Sugerencia: use el operador residuo.
Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando se divide entre 2].
 */

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int numero;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Este programa identifica si un entero dado es par o es impar");
        
        System.out.print("Inserte el número a verificar: ");
        numero = in.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El número dado es par");
        }else{
            System.out.println("El número dado es impar");
        }
    }
}
