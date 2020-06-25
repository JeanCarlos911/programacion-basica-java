public class Fecha {
    private int mes, dia, year; // year = año
        
    public Fecha(int dia, int mes, int year) {
        this.mes = mes;
        this.dia = dia;
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void mostrarFecha() {
        System.out.printf("%d/%d/%d\n", getDia(), getMes(), getYear());
    }
}
