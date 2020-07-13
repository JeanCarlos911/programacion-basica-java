/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public class Main {
    
    public static void main (String args[]){
        Tablero tablero = new Tablero();
        System.out.println("Un tablero con 8 reinas donde ninguna se puede atacar es: ");
        while(true){
            if(tablero.esValido()){
                break;
            }else{
                tablero.reposicionar();
            }
        }
        tablero.imprimir();
    }
    
}
