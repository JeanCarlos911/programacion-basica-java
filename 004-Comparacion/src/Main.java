/*
Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario y muestre el número más 
grande, seguido de las palabras "es más grande". Si los números son iguales, imprima el mensaje "Estos números son iguales".
 */

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        //Variables y objetos
        Scanner in = new Scanner(System.in);
        int a, b;
        
        System.out.println("Este programa identifica cual de los dos enteros dados por el usuario es mayor o si son iguales");
        
        System.out.print("Inserte valor a: ");
        a = in.nextInt();
        
        System.out.print("Inserte valor b: ");
        b = in.nextInt();
        
        if(a > b){
            System.out.println(a + " es más grande que " + b);
        }else if(b > a){
            System.out.println(b + " es más grande que " + a);
        }else{
            System.out.println("Estos números son iguales");
        }
    }
}
