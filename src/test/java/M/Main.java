package M;
interface nume
{
    void name();
}interface prenume
{
     void surname();
}
class id implements nume,prenume
{
    @Override
    public void name() {
        System.out.println("sorin");
    }

    @Override
    public void surname() {
        System.out.println("cucereavu");
    }
}
public class Main {
    public static void main(String... ar)
    {
        id persoana1=new id();
        persoana1.name();
        persoana1.surname();
    }
}
