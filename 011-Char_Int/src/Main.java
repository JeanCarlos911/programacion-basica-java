/*
Muestre los equivalentes enteros de los siguientes caracteres: A B C a b c 0 1 2 $ * + / y el carácter en blanco.
 */

public class Main {
    public static void main(String args[]){
        System.out.println("Este programa imprime los equivalentes enteros de algunos carácteres");
        System.out.println("Carácter   Valor");
        System.out.printf( "   %c        %d\n",'A',((int) 'A'));
        System.out.printf( "   %c        %d\n",'B',((int) 'B'));
        System.out.printf( "   %c        %d\n",'C',((int) 'C'));
        System.out.printf( "   %c        %d\n",'a',((int) 'a'));
        System.out.printf( "   %c        %d\n",'b',((int) 'b'));
        System.out.printf( "   %c        %d\n",'c',((int) 'c'));
        System.out.printf( "   %c        %d\n",'0',((int) '0'));
        System.out.printf( "   %c        %d\n",'1',((int) '1'));
        System.out.printf( "   %c        %d\n",'2',((int) '2'));
        System.out.printf( "   %c        %d\n",'$',((int) '$'));
        System.out.printf( "   %c        %d\n",'*',((int) '*'));
        System.out.printf( "   %c        %d\n",'+',((int) '+'));
        System.out.printf( "   %c        %d\n",'/',((int) '/'));
        System.out.printf( "   %c        %d\n",' ',((int) ' '));
    }
}
