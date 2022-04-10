package pętle;

import java.util.Scanner;

public class KalkulatorZPetla {

    public static void main(String[] args) {
        String pytanie;
        do {
            System.out.println("podaj pierwszą cyfrę");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            System.out.println("podaj pierwszą cyfrę");
            int b = scanner.nextInt();


            System.out.println("Jaką operacje mam wykonać, +, -, *, / ?");
            String dzialanie = scanner.next();

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
                    double iloraz = (double) a * (double) b;
                    System.out.println("iloraz to " + iloraz);
                    if (dzialanie != "+" || dzialanie != "-" || dzialanie != "*" || dzialanie != "/") {
                        System.out.println("Nie ten znak");
                    }
                    break;
            }
            System.out.println("Czy jeszcze raz? ");
            pytanie = scanner.next();

        }
        while (pytanie.equals("tak"));
        //stringi porownujemy metoda equals
    }
}


