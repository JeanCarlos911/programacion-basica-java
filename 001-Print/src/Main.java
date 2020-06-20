/*
Escriba una aplicación que muestre los números del 1 al 4 en la misma línea, con cada par de números adyacentes
separado por un espacio. Escriba el programa utilizando las siguientes técnicas:
 a) Utilizando una instrucción System.out.println.
 b) Utilizando cuatro instrucciones System.out.print.
 c) Utilizando una instrucción System.out.printf.
POSIBLE SOLUCIÓN DADA A CONTINUACIÓN*/

public class Main {
    public static void main(String args[]){
        
        //Forma a
        System.out.println("1 2 3 4");
        
        //Forma b
        System.out.print("1");
        System.out.print(" 2");
        System.out.print(" 3");
        System.out.print(" 4");
        
        //Forma c
        System.out.printf("\n%d %d %d %d\n", 1, 2, 3, 4);
    }
}
