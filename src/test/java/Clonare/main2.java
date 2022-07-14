package Clonare;

public class main2 {
    public static void main(String...ar)
    {
      Persoane p1=new Persoane();
      Persoane p2=Primul(p1);
      p1.set("sorinus");
      p2.set("dan");
        System.out.println(p1.get());
        System.out.println(p2.get());
    }
    public static Persoane Primul(  Persoane p2)
    {
        Persoane Sorin;
        try {
           Sorin =(Persoane)p2.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
return Sorin;
    }
}
