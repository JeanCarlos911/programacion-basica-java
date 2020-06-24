public class PruebaEmpleado {
    public static void main(String args[]){
        //Crear objetos de tipo Empleado
        Empleado sergio = new Empleado("Sergio", "Suarez", 4500000);
        Empleado pepe = new Empleado("Pepe", "Fernández", 1500000);
        Empleado brandon = new Empleado("Brandon", "Santoya", -500000);
        
        //Mostrar sus salarios anuales
        System.out.println("Salarios anuales");
        sergio.mostrarSalarioAnual();
        pepe.mostrarSalarioAnual();
        brandon.mostrarSalarioAnual();
        
        //Aumentar sus salarios en un 10%
        sergio.aumentarSalario(10);
        pepe.aumentarSalario(10);
        brandon.aumentarSalario(10);
        System.out.println("\nSe ha aumentado el salario de todos los empleados en un 10%");
        
        //Mostrar sus nuevos salarios anuales
        System.out.println("\nSalarios anuales");
        sergio.mostrarSalarioAnual();
        pepe.mostrarSalarioAnual();
        brandon.mostrarSalarioAnual();
    }
}
