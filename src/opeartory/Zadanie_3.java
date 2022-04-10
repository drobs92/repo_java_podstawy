package opeartory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        /*
        //Zdeklaruj zmienną typu float reprezentującą temperaturę w stopniach C
        //następnie na podstawie wzoru dokonaj konwersji do temp w K: K = C + 273.15
 */
        /*
    Zdeklaruj zmienną temp_F typu float;
    następnie na podstawie wartości zmiennej oblicz wartość w Celsjuszach: C = (F - 32) * 5 / 9
     */
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w C");
        float c = scaner.nextInt();
        double k = (int) c + 273.15;
        System.out.println("Temperatura w K to: " + k);
        System.out.println("Podaj temperaturę w fahrenheitach");
        float F = scaner.nextFloat();
        double celc = (F - 32) * 5 / 9;
        System.out.println("to tyle w celcjuszach: " + celc);
        /*
Napisz program, który obliczy podatek dochodowy od wskazanego wynagrodzenia netto.
Przyjmij, że podatek to 19% dochodu netto. W tym celu:
- poproś użytkownika o podanie swojego dochodu //
- przypisz do zmiennej rezultat obliczania kwotu podatku
- wyświetl ten rezultat
 */
        System.out.println("podaj dochód brutto");
        double doch = scaner.nextDouble();
        double podatek = doch * 0.19;
        System.out.println("podatek należny to: " + podatek);
/*
Napisz kalkulator BMI:
bmi = waga/ wzrost_m^2;
wzrost i waga powinny zostać przekazane przez użytkownika
 */
        System.out.println("podaj wzrost w metrach następnie wagę w kg");
        double wzrost = scaner.nextDouble();
        double waga = scaner.nextDouble();
        float BMI = (float)waga / (float)(wzrost * wzrost);
        if (BMI < 18.5)
        System.out.println("Twoje BMI to: " + BMI + " -oznacza chudzielca");
        else if (BMI < 25)
        System.out.println("Twoje BMI to: " + BMI + " -oznacza Normę");
        else if (BMI < 30)
        System.out.println("Twoje BMI to: " + BMI + " -oznacza nadwagę");
                else
        System.out.println("Twoje BMI to: " + BMI + " -oznacza grubaska");

    }
}
