package lab6p2_josueespinal;
public class Estudiantes extends Usuarios{
    private String carrera;
    private int anio;

    public Estudiantes() {
        super();
    }

    public Estudiantes(String carrera, int anio) {
        this.carrera = carrera;
        this.anio = anio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "carrera=" + carrera + ", anio=" + anio + '}';
    }
    
    
    
}
