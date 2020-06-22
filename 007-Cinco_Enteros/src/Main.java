/*
Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros mayor y menor en el grupo.
Use solamente condicionales
 */
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        //Atributos
        Scanner in = new Scanner(System.in);
        int valor1, valor2, valor3, valor4, valor5, mayor, menor;
        
        System.out.println("Este programa recibe 5 enteros, y muestra cual es el mayor y el menor grupo");
        
        System.out.print("Inserte valor 1: ");
        valor1 = in.nextInt();
        
        System.out.print("Inserte valor 2: ");
        valor2 = in.nextInt();
        
        System.out.print("Inserte valor 3: ");
        valor3 = in.nextInt();
        
        System.out.print("Inserte valor 4: ");
        valor4 = in.nextInt();
        
        System.out.print("Inserte valor 5: ");
        valor5 = in.nextInt();
        
        mayor = valor1;
        menor = valor1;
        
        //Hallar el mayor valor
        if(mayor < valor2){
            mayor = valor2;
        }
        if(mayor < valor3){
            mayor = valor3;
        }
        if(mayor < valor4){
            mayor = valor4;
        }
        if(mayor < valor5){
            mayor = valor5;
        }
        
        //Hallar el menor valor
        if(menor > valor2){
            menor = valor2;
        }
        if(menor > valor3){
            menor = valor3;
        }
        if(menor > valor4){
            menor = valor4;
        }
        if(menor > valor5){
            menor = valor5;
        }
        
        //Imprimir
        System.out.println("El valor máximo es: " + mayor);
        System.out.println("El valor mínimo es: " + menor);
    }
}