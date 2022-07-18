package repet;

public class Vultur extends Pasari implements VitezaDeDeplasare{
    @Override
    public void animal() {
        System.out.println("vulturul");
    }

    @Override
    public void viteza() {
        System.out.println("100 km");
    }
}
