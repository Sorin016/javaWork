package Clonare;

public class Main {
    public static void main(String... ar)
    {
       DollySheet dollySheet=new DollySheet();
        DollySheet dollySheet22= foo(dollySheet);
        dollySheet.set("dolly");
        dollySheet22.set("dolly222");
        System.out.println(dollySheet.get());
        System.out.println(dollySheet22.get());
    }

    public static DollySheet foo(DollySheet dollySheet22 )
    {
        DollySheet Sheet;
        try {
            Sheet=  (DollySheet)dollySheet22.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return Sheet;
    }
}
