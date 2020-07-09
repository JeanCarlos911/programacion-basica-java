public class Main {
    public static void main(String[] args){
        double pi=0;
        double valor=1;
        int signo=1;
        
        for(int i=1; i<800000000; i++){
            pi += (4 * signo)/valor;
            signo *= -1;
            valor += 2;
        }
        System.out.println("Un valor estimado para la constante pi es:");
        System.out.printf("%.8f\n", pi);
    }
}
