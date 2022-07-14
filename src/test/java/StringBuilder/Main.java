package StringBuilder;

public class Main {
    public static void main (String... ar)
    {
        StringBuilder st=new StringBuilder("Sorin");
        st.reverse();
        System.out.println(st);
        System.out.println(st.append(" Cucereavu"));
        System.out.println(st);
         String s="Dan";
        System.out.println(   s.concat("Cucereavu"));
        System.out.println(s);
    }
}
