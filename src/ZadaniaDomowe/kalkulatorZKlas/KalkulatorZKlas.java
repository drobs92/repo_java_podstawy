package ZadaniaDomowe.kalkulatorZKlas;
import java.util.Objects;
import java.util.Scanner;

public class KalkulatorZKlas {
    /*Zadanie1. Zamodelujcie przy pomocy klas kalkulator,
     ktory przyjmuje dwie liczby, oraz posiada cztery metody do obliczen*/
    public static void main(String[] args) {
        String pytanie;
        do {
            System.out.println("podaj liczby");
            Scanner scanner = new Scanner(System.in);
            Liczby liczby = new Liczby();
            liczby.setliczby(scanner.nextDouble(), scanner.nextDouble());
            //System.out.println(liczby.getA() + " " +liczby.getB());
            System.out.println("wybierz operację");
            String operacja = scanner.next();
           //
            switch (operacja) {
                case "-":
                    System.out.println("Wynik odejmowania to ");
                    Operacje.getOdejmowanie();
                    break;
                case "+":
                    System.out.println("Wynik dodawania to ");
                    Operacje.getDodawanie();
                    break;
                case "*":
                    System.out.println("Wynik mnożenia to ");
                    Operacje.getMnozenie();
                    break;
                case "/":
                    if (Objects.equals(operacja, "/") && Liczby.getB()==0) {
                        System.out.println("nie dziel przez 0");
                        break;
                    }
                   else {System.out.println("Wynik dzielenia to ");
                    Operacje.getDzielenie();};
                    break;
                default:
                    System.out.println("Nie ten znak");
            }
            System.out.println("od nowa?");
            pytanie = scanner.next();

        } while (pytanie.equals("+"));

    }
}
