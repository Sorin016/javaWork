package Interfacess;

public class suzuky extends motocicleta implements Viteza{
    @Override
    public void vehicul() {
        System.out.println("suzuky este motocicleta sportiva");
    }

    @Override
    public void vitezaMaxima() {
        System.out.println("300 km/h");
    }
    public void capacitateaMotor()
    {
        System.out.println("1000CM3");
    }
}
