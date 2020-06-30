/*
Se demora más porque la presición que maneja es superior a la que se maneja comúnmente en calculadoras
*/

import java.util.Scanner;

public class Euler {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double resultado=0;
        int x;
        
        System.out.println("Este programa estima el valor de la constante e a la x, donde ud ingresa x como un número entero");
        System.out.print("\nIngrese valor de x: ");
        x = in.nextInt();
        
        System.out.println("Un valor aproximado de la constante e a la x es:");
        
        
        //i es el número de iteraciones
        for(int i=0; i<50000; i++){
            resultado += (1.0/factorial(i));
        }
        resultado = exponencial(resultado, x);
        
        System.out.println(resultado);
    }
    
    private static double factorial(int n){
        double x = 1;
        if(n==0 || n==1){
            return x;
        }else{
            for(int i = 1; i <= n; i++){
                x *= i;
            }
            return x;
        }
    }
    
    private static double exponencial(double a, double b){
        double x = a;
        if(b == 0){
            return 1;
        }else{
            for(double i = 1; i<valorAbsoluto(b); i++){
                x *= a;
            }
            if(b < 0){
                x = 1.0/x;
            }
            return x;
        }
    }
    
    private static double valorAbsoluto(double a){
        double x = a;
        if(x < 0){
            x *= -1;
        }
        return x;
    }
}
