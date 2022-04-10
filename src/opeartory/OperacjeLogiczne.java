package opeartory;

public class OperacjeLogiczne {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        boolean wynik = a && b;
        System.out.println( !wynik);// false
        System.out.println( a && c);// true czu oba są true
        System.out.println( a || c);// true czy chociaż jeden jest true
        System.out.println( a || b);// true
        System.out.println( b || d);// false
        System.out.println( !b);// true ! odwraca wartość


    }
}
