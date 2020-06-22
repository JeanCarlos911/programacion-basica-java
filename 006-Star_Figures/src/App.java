/**
 *
 * @author Jean Carlos Santoya Cabrera
 */
public class App {
    
    public static void main (String args[]){
        //print figures
        for(int line=0; line<9; line++){
           for(int figure=0; figure<4; figure++){
               printFigureLine(figure, line);
           }
       } 
    }
    
    private static void printFigureLine(int f, int l){
        switch(f){
            case 0:
                printSquareLine(l);
                break;
            case 1:
                printCircleLine(l);
                break;
            case 2:
                printArrowLine(l);
                break;
            case 3:
                printRhombusLine(l);
                break;
        }
        if(f<3){
            print("   ");
        }else{
            print("\n");
        }
    }
    
    private static void printSquareLine(int l){
        if(l==0 || l==8){
            print("*********");
        }else{
            print("*       *");
        }
    }
    
    private static void printCircleLine(int l){
        if(l==0 || l==8){
            print("   ***   ");
        }else if(l==1 || l==7){
            print(" *     * ");
        }else{
            print("*       *");
        }
    }
    
    private static void printArrowLine(int l){
        switch(l){
            case 0:
                print("  *  ");
                break;
            case 1:
                print(" *** ");
                break;
            case 2:
                print("*****");
                break;
            default:
                print("  *  ");
                break;
        }
    }
    
    private static void printRhombusLine(int l){
        if(l==0 || l==8){
            print("    *");
        }else{
            String espacioLibre="", espacio="";
            if(l<5){
                for(int i=1; i<=(2*l-1); i++){
                    espacio+=" ";
                }
                for(int i=1; i<=(7-espacio.length())/2; i++){
                    espacioLibre+=" ";
                }
            }else{
                for(int i=1; i<=15-2*l; i++){
                    espacio+=" ";
                }
                for(int i=1; i<=(7-espacio.length())/2; i++){
                    espacioLibre+=" ";
                }
            }
            print(espacioLibre+"*"+espacio+"*");
        }
    }
    
    private static void print(String s){
        System.out.print(s);
    }
    
}
