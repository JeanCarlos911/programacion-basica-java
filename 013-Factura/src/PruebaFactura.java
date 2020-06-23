
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        Factura celular = new Factura("0001", "Smarthphone con 8 GB de ram", 9, 2300000.0);
        Factura deuda = new Factura("0002", "Dinero que se pierde en deudas", 1, -150000.9);
        Factura negativa = new Factura("0003", "Su cantidad será negativa", -5, 150.5);
        
        //Facturas
        celular.imprimirFactura();
        deuda.imprimirFactura();
        negativa.imprimirFactura();
    }
}
