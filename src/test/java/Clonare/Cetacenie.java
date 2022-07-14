package Clonare;

public class Cetacenie implements Cloneable{
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
    public  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
