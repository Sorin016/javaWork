package Polimorfizm;

public class Main {
    public static void main(String... args) {
        animal a = new animal();
        animal b = new magar();
        animal c = new soricel();
        a.sound();
        b.sound();
        c.sound();

    }
}
  class animal
    {
        public void sound()
        {}
    }
     class magar extends animal
    {
        public void sound()
        {
            System.out.println("ia-ia-ia");
        }
    }
     class soricel extends animal{
        public void sound()
        {
            System.out.println("cit-ci");
        }
    }


