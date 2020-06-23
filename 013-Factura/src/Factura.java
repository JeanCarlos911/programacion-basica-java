public class Factura {
    private String numeroPieza, descripcionPieza;
    private int cantidadPieza;
    private double precioPieza;
    
    public Factura(String numero, String descripcion, int cantidad, double precio){
        setNumeroPieza(numero);
        setDescripcionPieza(descripcion);
        setCantidadPieza(cantidad);
        setPrecioPieza(precio);
    }
    
    public void setNumeroPieza(String numero){
        numeroPieza = numero;
    }
    
    public void setDescripcionPieza(String descripcion){
        descripcionPieza = descripcion;
    }
    
    public void setCantidadPieza(int cantidad){
        cantidadPieza = cantidad;
    }
    
    public void setPrecioPieza(double precio){
        precioPieza = precio;
    }
    
    public String getNumeroPieza(){
        return numeroPieza;
    }
    
    public String getDescripcionPieza(){
        return descripcionPieza;
    }
    
    public int getCantidadPieza(){
        return cantidadPieza;
    }
    
    public double getPrecioPieza(){
        return precioPieza;
    }
    
    public double obtenerMontoFactura(){
        double montoFactura;
        
        if(cantidadPieza < 0){
            setCantidadPieza(0);
        }
        if(precioPieza < 0.0){
            setPrecioPieza(0.0);
        }
        
        montoFactura = cantidadPieza * precioPieza;
        return montoFactura;
    }
    
    public void imprimirFactura(){
        System.out.printf("Numero pieza: %s, descripcion: %s, cantidad: %d, precio: %.2f, monto factura: %.2f.\n",
                getNumeroPieza(), getDescripcionPieza(), getCantidadPieza(), getPrecioPieza(),obtenerMontoFactura());
    }
}
