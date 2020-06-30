
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ){
        Scanner in = new Scanner(System.in);
        int size, i = 1;;//size = tamaño
        
        System.out.println("Este programa dibuja un cuadrado de asteriscos por consola"
                + " dado el tamaño del lado siempre que esté entre 1 y 20 y sea entero.");
        
        System.out.print("\nIngrese tamaño del lado: ");
        size = in.nextInt();
        
        while(size>20 || size<1){
            System.out.println("valor ingresado fuera de rango");
            System.out.print("\nIngrese tamaño del lado: ");
            size = in.nextInt();
        }
        
        while(i <= size){
            if(i==1 || i == size){
                for(int j = 0; j<size; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                System.out.print("*");
                for(int j = 0; j< size - 2; j++){
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
            i++;
        }
    }
}
