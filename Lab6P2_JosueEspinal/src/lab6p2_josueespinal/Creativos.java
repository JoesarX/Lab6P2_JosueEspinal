package lab6p2_josueespinal;

public class Creativos extends Usuarios{
    private String ocupacion;
    private int edad;

    public Creativos() {
        super();
    }

    public Creativos(String ocupacion, int edad) {
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Creativos{" + "ocupacion=" + ocupacion + ", edad=" + edad + '}';
    }
    
}
