/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public class Main {
    
    public static void main (String args[]){
        imprimir(producto(1, 0));
        imprimir(producto(1, 2, 3));
        imprimir(producto(4, 3));
        imprimir(producto(3, 3, 9, 10));
        imprimir(producto(5, 5, 5, 5, 2));
    }
    
    public static int producto(int ... c){
        int answer = 1;
        
        for(int i : c){
            answer *= i;
        }
        
        return answer;
    }
    
    public static void imprimir(int s){
        System.out.println(s);
    }
    
}