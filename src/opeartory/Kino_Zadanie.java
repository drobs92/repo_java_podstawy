package opeartory;

import java.util.Scanner;

public class Kino_Zadanie {
    public static void main(String[] args) {
        /*
Napisz program, który zweryfikuje czy dany użytkownik może obejrzeć seans w kine.
Warunkiem wejścia do kina jest: 20 w portfelu, albo karta klubowicza,
 albo przybycie z 3 dzieci.
Pytanie o pieniądze, kartę klubowicza i liczbę dzieci
 powinny być zadane użytkownikowi przed rozpoczęciem weryfikacji (skorzystaj z scanner)
 */
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj licbę dzieci");
        int liczbakaszojadow = scanner.nextInt();
        System.out.println("Ile masz przy sobie hajsu?");
        double siano = scanner.nextInt();
        System.out.println("Masz kartę klubowicza?");
        String karta = scanner.next();
        if (karta == "tak") {
            karta = (int) 1;
        } else if (karta == "nie")
            karta = (int) 0;
        else
            System.out.println("napisz tak lub nie");*/
                Scanner scanner = new Scanner(System.in);

                System.out.println("Ile masz pieniędzy w portfelu?: ");
                int pieniądze = scanner.nextInt();

                System.out.println("Czy masz kartę klubowicza?: ");
                boolean karta = scanner.nextBoolean();//ale zadziała tylko false albo true

                System.out.println("Ile masz dzieci?: ");
                int dzieci = scanner.nextInt();

                boolean możeWejść = pieniądze >=20 && karta == true || dzieci >=3;//czy któryś jest true
        //jeżeli dać && to wszystkie muszą

                if (możeWejść == true){
                    System.out.println("Możesz wejść do kina");

                }else{
                    System.out.println("W tych butach nie wejdziesz!");
                }

    }
}
