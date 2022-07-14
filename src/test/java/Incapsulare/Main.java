package Incapsulare;

public class Main {
    public static void main(String... ar)
    {
        incapsul nume1=new incapsul();
        incapsul nume2=new incapsul();
        incapsul nume3=new incapsul();
        nume1.set("sorin");
        nume2.set("Dan");
        nume3.set("Adriana");
        System.out.println(nume1.get());
        System.out.println(nume2.get());
        System.out.println(nume3.get());
    }
}
