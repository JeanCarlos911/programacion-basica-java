public class Euler {
    public static void main(String[] args) {
        double resultado=0;
        
        System.out.println("Un valor aproximado de la constante e es:");
        
        //i es el número de iteraciones
        for(int i=0; i<50000; i++){
            resultado += (1.0/factorial(i));
        }
        
        System.out.printf("%.13f\n", resultado);
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
}
