package t;

public class Vultur extends Animale implements Viteza{
    @Override
    public void animal() {
        System.out.println("vultur");
    }

    @Override
    public void viteza() {
        System.out.println("vulturului are vetea de 100km");
    }
}
