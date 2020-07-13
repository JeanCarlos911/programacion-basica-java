
import java.util.Random;

/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public class Tablero {
    private int[][][] casilla;
    private Random random;
    
    public Tablero(){
        random = new Random();
        casilla = new int[8][8][1];//el ultimo valor aloja una reina
        
        for(int i=0; i<8; i++){
            casilla[i][i][0] = 1;//hay reina en la diagonal principal
        }
    }
    
    public void reposicionar(){
        cambiar(0, random.nextInt(8));
        cambiar(1, random.nextInt(8));
        cambiar(2, random.nextInt(8));
        cambiar(3, random.nextInt(8));
        cambiar(4, random.nextInt(8));
        cambiar(5, random.nextInt(8));
        cambiar(6, random.nextInt(8));
        cambiar(7, random.nextInt(8));
    }
    
    public boolean esValido(){
        int frecuencia1[] = new int[15];//en diagonales \
        int frecuencia2[] = new int[15];//en diagonales / 
        int valor;
        
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(casilla[i][j][0]==1){
                    //Diagonales de la forma \
                    valor = i - j;
                    frecuencia1[valor+7]++;
                    
                    //Diagonales de la forma /
                    valor = i + j;
                    frecuencia2[valor]++;
                }
            }
        }
        for(int i : frecuencia1){
            if(i > 1){
                return false;
            }
        }
        for(int i : frecuencia2){
            if(i > 1){
                return false;
            }
        }
        return true;
    }
    
    public void imprimir(){
        for(int posicion[][] : casilla){
            for(int fila[] : posicion){
                for(int valor : fila){
                    System.out.printf("%2d", valor);
                }
            }
            System.out.printf("\n");
        }
    }
    
    private void cambiar(int a, int b){
        int[][] temp;
        temp = casilla[a];
        casilla[a]=casilla[b];
        casilla[b]=temp;
    }
}
