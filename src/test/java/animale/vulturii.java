package animale;

public class vulturii extends pasari implements mediuDeViata{
    @Override
    public void animal() {
        System.out.println("vulturu este pasare mare");
    }

    @Override
    public void mediuDeAbitare() {
        System.out.println("vulturii abiteaza in mediu aerian");
    }
}
