package lab6p2_josueespinal;
public class Ejecutivos extends Usuarios{
    private String cargo;
    private String tituloUni;
    private String tituloMae;

    public Ejecutivos() {
        super();
        
    }

    public Ejecutivos(String cargo, String tituloUni, String tituloMae) {
        this.cargo = cargo;
        this.tituloUni = tituloUni;
        this.tituloMae = tituloMae;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTituloUni() {
        return tituloUni;
    }

    public void setTituloUni(String tituloUni) {
        this.tituloUni = tituloUni;
    }

    public String getTituloMae() {
        return tituloMae;
    }

    public void setTituloMae(String tituloMae) {
        this.tituloMae = tituloMae;
    }

    @Override
    public String toString() {
        return "Ejecutivos{" + "cargo=" + cargo + ", tituloUni=" + tituloUni + ", tituloMae=" + tituloMae + '}';
    }
    
}
