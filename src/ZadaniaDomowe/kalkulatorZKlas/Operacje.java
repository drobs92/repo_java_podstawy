package ZadaniaDomowe.kalkulatorZKlas;

public class Operacje {
private static double odejmowanie;
private static double dodawanie;
private static double mnozenie;
private static double dzielenie;

    public Operacje(double odejmowanie, double dodawanie, double mnozenie, double dzielenie) {
        this.odejmowanie = odejmowanie;
        this.dodawanie = dodawanie;
        this.mnozenie = mnozenie;
        this.dzielenie = dzielenie;
    }

    public static double getOdejmowanie() {
        System.out.println(Liczby.getA()-Liczby.getB());
        return odejmowanie;
    }

    public static double getDodawanie() {
        System.out.println(Liczby.getA()+Liczby.getB());
        return dodawanie;
    }

    public static double getMnozenie() {
        System.out.println(Liczby.getA()*Liczby.getB());
        return mnozenie;
    }

    public static double getDzielenie() {
        System.out.println(Liczby.getA()/Liczby.getB());
        return dzielenie;
    }
}
