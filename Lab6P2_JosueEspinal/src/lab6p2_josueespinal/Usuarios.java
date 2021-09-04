package lab6p2_josueespinal;

import java.util.ArrayList;

public class Usuarios {
    private String user;
    private String password;
    private String nombre;
    private String apellido;
    private String correo;
    private ArrayList<Notas> notas = new ArrayList<Notas>();
    public Usuarios() {
    }

    public Usuarios(String user, String password, String nombre, String apellido, String correo) {
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Notas> getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas.add(notas);
    }
    

    @Override
    public String toString() {
        return "Usuarios{" + "user=" + user + ", password=" + password + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + '}';
    }
    
}
