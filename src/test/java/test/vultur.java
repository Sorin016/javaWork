package test;

public class vultur extends Animale implements MediuDeiata {
    @Override
    public void animal() {
        System.out.println("vulturul este pasare");
    }

    @Override
    public void ZonaDeActivitate() {
        System.out.println("vulturul activeaza in mediu aerian");
    }
}
