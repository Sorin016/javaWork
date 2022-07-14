package Switchs;

public class Mains {
    public static void main(String... args) {
        final int values = 2, first = 1, second = 2; //constante finale lucreaza switch, daca nu e final nu lucreaza
        switch (values) {
            case first:
                System.out.println("first");
                break;
            case second:
                System.out.println("second");
                break;
        }
    }
}
