package lab6p2_josueespinal;

public class Normales extends Usuarios{
    private String hobbie;
    private String interses;

    public Normales() {
        super();
    }

    public Normales(String hobbie, String interses) {
        this.hobbie = hobbie;
        this.interses = interses;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getInterses() {
        return interses;
    }

    public void setInterses(String interses) {
        this.interses = interses;
    }

    @Override
    public String toString() {
        return "Normales{" + "hobbie=" + hobbie + ", interses=" + interses + '}';
    }
    
}
