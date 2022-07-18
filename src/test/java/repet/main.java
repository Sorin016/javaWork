package repet;
class parinte
{
    public void  math()
    {
        System.out.println("met 1");
    }
}
class copil extends parinte
{
    @Override
    public void math() {
        System.out.println("met 2");
    }
}
             public class main {
                 public static void main(String... ar) {
                 parinte p=new parinte();
                 parinte c=new copil();
                 p.math();
                 c.math();
                 }

             }



