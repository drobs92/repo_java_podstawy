package klasyString;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class klasyString {
    public static void main(String[] args) {
      /*  Napisz aplikację która wykona następujące operacje:
        1. Pobierze dowolny ciąg od użytkownika (korzystając z Skannera)
        2. Jeśli długość ciągu będzie mniejsza niż 5 to program powinien zakończyć działanie
        3. W innym tekst powinen zostać zamieniony na same małe litery
        4. Wszystkie literki `a` powinny zostać zamienione na literki `z`!!
        5. Należy sprawdzić czy w ciągu znajduje się słowo: "java"
        6. Zamień ciąg znaków na same duże litery
        7. Należy sprawdzić czy dany ciąg znaków jest równy: JAVA*/
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("podaj słowo");
        String text1 = scanner.next();
        if (text1.length() < 5) {
            System.out.println("min 5 znaków");
            return;
        }
        System.out.println(text1.toLowerCase());
        System.out.println(text1.replace("a", "z"));
        System.out.println(text1.contains("java"));
        System.out.println(text1.toUpperCase());
        System.out.println(text1.contains("JAVA"));
*/
/*Napisać program, który wczytuje od użytkownika ciąg znaków,
a następnie wyświetla informację o tym ile razy w tym ciągu
powtarza się jego ostatni znak.
Przykład, dla ciągu „Abrakadabra" program powinien wyświetlić 4,
 ponieważ ostatnim znakiem jest literka „a",
która występuje w podanym ciągu łącznie 4 razy.*/
        String ciagznakow1 = scanner.nextLine();
        int ostatniaPozycja = ciagznakow1.length();
        char ostatniznak = ciagznakow1.charAt(ostatniaPozycja - 1);
        System.out.println(ostatniznak);
        int licz =0;
        char szukany= ostatniznak;
        for (int i=0;i<ciagznakow1.length();i++){
            if (ciagznakow1.charAt(i)==szukany){
                licz++;
            }
        }
        System.out.println(licz);

    }
}
