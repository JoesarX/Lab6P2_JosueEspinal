package lab6p2_josueespinal;

import java.util.ArrayList;

public class Notas {
    private String titulo;
    private String prioridad;
    private ArrayList<String> tags = new ArrayList<String>();

    public Notas() {
    }

    public Notas(String titulo, String prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    

    public String getNombre() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags.add(tags);
    }
    
}
