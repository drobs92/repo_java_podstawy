package opeartory;

import java.util.Scanner;

public class Relacje {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean wynik = a > b;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(wynik);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a >= b);

        Scanner scanner = new Scanner(System.in);
        int wprowadzonaLiczba = scanner.nextInt();
        System.out.println("ktos wpisal" + wprowadzonaLiczba);

    }
}
