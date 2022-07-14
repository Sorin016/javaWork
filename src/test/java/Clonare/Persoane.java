package Clonare;

public class Persoane implements Cloneable {
    private String Nume;
    public String get()
    {
        return Nume;
    }
    public void set(String Nume)
    {
        this.Nume=Nume;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
