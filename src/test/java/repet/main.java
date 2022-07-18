package repet;
interface nume
         {
      void nume ();
         }
         interface prenume
         {
      void prenume ();}
             public class main {
                 public static void main(String... ar) {
                     id persoana1 = new id();
                     persoana1.nume();
                     persoana1.prenume();
                 }

             }
             class id implements nume,prenume
             {
     @Override
     public void prenume() {
         System.out.println("Tamara");
     }

     @Override
     public void nume() {
         System.out.println("cucereavu");
     }

 }


