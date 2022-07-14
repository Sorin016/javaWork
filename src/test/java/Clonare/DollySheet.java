package Clonare;

public class DollySheet implements Cloneable {
    private String name;
     public String get()
     {
         return name;
     }
     public void set(String name)
     {
         this.name=name;
     }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
