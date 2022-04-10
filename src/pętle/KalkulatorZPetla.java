package pętle;

import java.util.Objects;
import java.util.Scanner;

public class KalkulatorZPetla {

    public static void main(String[] args) {
        String pytanie;
        do {
            System.out.println("podaj pierwszą cyfrę");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            System.out.println("podaj drugą cyfrę");
            int b = scanner.nextInt();


            System.out.println("Jaką operacje mam wykonać, +, -, *, /,%% ?");
            String dzialanie = scanner.next();
            if (Objects.equals(dzialanie, "/") && b == 0) {
                System.out.println("Nie dziel przez 0!");
            }

            switch (dzialanie) {
                case "+":
                    int suma = a + b;
                    System.out.println("suma to " + suma);
                    break;
                case "-":
                    int różnica = a - b;
                    System.out.println("róznica to " + różnica);
                    break;
                case "*":
                    int iloczyn = a * b;
                    System.out.println("iloczyn to " + iloczyn);
                    break;
                case "/":
                    double iloraz = (double) a / (double) b;
                    System.out.println("iloraz to " + iloraz);
                    break;
                case "%%":
                    double procent = (double) a/(double) b *100;
                    System.out.println("Procent to :" +procent);
                    break;
                default:
                    System.out.println("nie ten znak");

            }
            System.out.println("Czy jeszcze raz? ");
            pytanie = scanner.next();

        }
        while (pytanie.equals("tak"));
        //stringi porownujemy metoda equals
    }
}


