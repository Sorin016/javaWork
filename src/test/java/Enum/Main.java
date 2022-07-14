package Enum;

enum day
{
    luni("S"),marti("o"),mercuri("r"),joi("i"),vineri("n");

    private final String aza;
     day(String aza)
    {
        this.aza = aza;
    }
    public String get()
    {
        return aza;
    }
}
public class Main {
    public static void main(String... ar)
    {
//        for(day d:day.values())
//            System.out.println(d);
     day d=day.luni;
        System.out.println(d);
        System.out.println(d.get());
        System.out.println(d.get());
        System.out.println(d.get());
        System.out.println(d.get());
        System.out.println(d.get());
    }
}
