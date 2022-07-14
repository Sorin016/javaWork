package Interfacess;

public class ferrary extends car implements Viteza{
    @Override
    public void vehicul() {
        System.out.println("ferrary este masina sportiva");
    }

    @Override
    public void vitezaMaxima() {
        System.out.println("320 km/h");
    }
}
