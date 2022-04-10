package pętle;

import java.util.Scanner;

public class Petla_for {
    public static void main(String[] args) {
       /* int i = 0; //jeżeli zapisuję poza nawiasem for to mogę sie odwołać później
        for (; i < 5; i++) {
            System.out.println(i +" pętla");
        }
        String[] tablica = {"Ala", "Ma","Kota"};
        for(String temp : tablica) {
            System.out.print(temp + " ");// print ln w linijkach
        }
        for (; i < 10; i+=2) { //tutaj i będzie przechodzić co dwa
            System.out.println(i +" pętla");
        }*/
        /*
        Napisz program, który wyświetli linię długości wskazanej przez użytkownika, np.
        2->##
        5->#####
        10->##########
 */
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Jak długi ma być twój płot? #");
        int iloscplotkow = scanner.nextInt();
        for (int i=0; i<=iloscplotkow; i++) {
           //if(i==4){sout} znaczyło by że tylko kiedy jest równe 4 ma printować
            System.out.print(i + "#");
        }
        /*
Napisz program, który wyświetli liczby parzyste w przedziale od 0 do n,
 gdzie n to liczba podana przez użytkownika, np.
n = 10
0,2,4,6,8
 */
     /*   System.out.println("jaki zares sprawdzamy?");
        int zakres = scanner.nextInt();
        for (int i = 0;i<=zakres;i++){
            if (i%2==0) {
            System.out.println(i + " ");
        }
        }*/
        /*
Napisz program pobierający od użytkownika liczbę n
i na jej podstawie wyświetlający kwadrat każdej liczby całkowitej <= n.
Dane testowe:
1->1
2->4
3->9
4->16
 */
     /*   System.out.println("podaj liczbę całkowitą");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i * i);
            int pow = Math.pow(i,2)
        }*/
        //Pętla zagnieżdżona
        /*for (int i = 0; i <= 10; i++) {
            for (int j = 0;j<5;j++)
            System.out.println(i * i);
           // int pow = Math.pow(i,2)}*/

    /*
Napisz program, który wyrysuje kwadrat o następującej własności:
n=4
1111
2222
3333
4444,
n=5
11111
22222
33333
44444
55555
n określa liczbę kolumn oraz liczbę wierszy
 */
        /*System.out.println("Podaj liczbę kolumn: ");
        int m = scanner.nextInt();
        System.out.println("Podaj liczbę wierszy: ");
        int n = scanner.nextInt();

        if (m > 0 && n >0) {
            for (int i = 1; i <= n; i++) {
                for(int j=1; j<=m; j++){
                    System.out.print(i+ " ");
                }
                System.out.println("");

            }
        }*/
       /* System.out.println("Podaj rozmiar figury: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {//tu mówię ile ma się razy powtórzyć
            for (int j = 0; j < size; j++) { //tu mówię, że ma się powtórzyć litera "a" w linijce
                System.out.print("a");//bo nie ma print ln
            }
            System.out.println();// tutaj mówię że po wykonaniu size liter A ma zrobil pusty line
            //pętla wraca do i i wykona się tyle razy ile był size
        }*/
    }
}
