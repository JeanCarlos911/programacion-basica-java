/*
La descripcion del ejercicio se encuentra en https://github.com/JeanCarlos911/programacion-basica-java/wiki/F%C3%A1cil 
ejercicio 010.
 */

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int radio;
        
        System.out.println("Este programa imprime el diámetro, la circunferencia y el área del círculo dado su radio entero");
        
        System.out.print("Ingrese radio del círculo: ");
        radio = in.nextInt();
        
        System.out.printf("El diámetro del círculo es: %d\nLa circunferencia del círculo es: %f\nEl área del círculo es: %f\n",
                2 * radio, 2 * Math.PI * radio, Math.PI * radio * radio);
        
    }
}
