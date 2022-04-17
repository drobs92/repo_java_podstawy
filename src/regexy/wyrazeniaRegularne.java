package regexy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wyrazeniaRegularne {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

//       Pattern pattern = Pattern.compile("(ab){4,}[a-h6-9]");
//        Matcher matcher = pattern.matcher("abababab8");
//        System.out.println(matcher.matches());
/*sprawdza czy numer domu jest w formacie numer\numer.
 Poprawnym numerem jest 123\2A, 24B\3 czy 12\5,
 ale już numer abc\cba nie,
 */
     /* System.out.println("podaj numer domu");
        String numerdomu = scanner.next();
       Pattern pattern =Pattern.compile("[a-zA-Z0-9]*[//]?[a-zA-Z0-9]*?");
       Matcher matcher=pattern.matcher(numerdomu);
        System.out.println(matcher.matches());
       /* System.out.println("Podaj numer mieszkania");
        String numermieszkania =scanner.next();
        Pattern pattern1= Pattern.compile("[a-zA-Z0-9]*");
        System.out.println(numerdomu);*/
        System.out.println("podaj adres e mail");
        String email = scanner.next();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*[@+][a-zA-Z0-9]*[.]+[a-zA-Z]*");
        Matcher matcher=pattern.matcher(email);
        System.out.println(matcher.matches());

    }
}