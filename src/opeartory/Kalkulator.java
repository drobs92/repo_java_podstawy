package opeartory;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        int pierwsza_l;  // dwie liczby, na których będziemy wykonywać operację
        int druga_l;
        char znak;      // zmienna przechowująca symbol operacji do wykonania
        Scanner podaj = new Scanner(System.in);   // wczytywanie zmiennych
        System.out.println("Podaj pierwszą liczbę:"); // przy pomocy Scanner
        pierwsza_l = podaj.nextInt();
        System.out.println("Podaj drugą liczbę:");
        druga_l = podaj.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");

        znak = podaj.next().charAt(0);  // pobieramy symbol operacji od użytkownika
        switch (znak)     // w zależności od wyboru wykonujemy daną operację
        {
            case '+':    // dodawanie dwóch zmiennych
            {
                System.out.println(pierwsza_l + druga_l);
                break;
            }
            case '-':    // odejmowanie dwóch zmiennych
            {
                System.out.println(pierwsza_l - druga_l);
                break;
            }
            case '*':    // mnożenie dwóch zmiennych
            {
                System.out.println(pierwsza_l * druga_l);
                break;
            }
            case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
            {           // dzielenie dwóch zmiennych
                if (druga_l != 0) {
                    System.out.println((double) pierwsza_l / (double) druga_l);
                } else {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;
            }
        }

    }
}

