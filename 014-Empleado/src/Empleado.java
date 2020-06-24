public class Empleado {
    private String nombre, apellidoPaterno;
    private double salarioMensual;
    
    public Empleado(String nombre, String apellido, double salario){
        setNombre(nombre);
        setApellidoPaterno(apellido);
        setSalarioMensual(salario);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidoPaterno(String apellido){
        this.apellidoPaterno = apellido;
    }
    
    public void setSalarioMensual(double salario){
        if(salario <0){
            this.salarioMensual = 0.0;
        }else{
            this.salarioMensual = salario;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public double getSalarioMensual(){
        return salarioMensual;
    }
    
    public void mostrarSalarioAnual(){
        double salarioAnual = getSalarioMensual()*12;
        
        System.out.printf("El empleado %s %s tiene un salario anual de $%.2f\n", getNombre(), getApellidoPaterno(), salarioAnual);
    }
    
    public void aumentarSalario(int porcentaje){
        setSalarioMensual(getSalarioMensual() * (100 + porcentaje) / 100);
    }
}
