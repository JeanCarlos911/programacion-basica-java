public class PruebaFecha {
    public static void main(String args[]){
        System.out.println("Esta aplicación prueba las capacidades de la clase Fecha\n");
        
        //Crearr objetos de tipo fecha
        Fecha diaMundialDelAgua = new Fecha(22, 3, 2021);
        Fecha diaDeLosDerechosHumanos = new Fecha(10, 12, 2020);
        Fecha diaMundialDeLaFilosofia = new Fecha(19, 11, 2020);
        
        //Mostrar fechas
        System.out.print("Dia mundial del agua: ");
        diaMundialDelAgua.mostrarFecha();
        
        System.out.print("Dia de los derechos humanos: ");
        diaDeLosDerechosHumanos.mostrarFecha();
        
        System.out.print("Dia mundial de la filosofía: ");
        diaMundialDeLaFilosofia.mostrarFecha();
    }
}
