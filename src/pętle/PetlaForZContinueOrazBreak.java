package pętle;

import java.util.Scanner;

public class PetlaForZContinueOrazBreak {
    public static void main(String[] args) {
        /*
        int i = 0; //jeżeli zapisuję poza nawiasem for to mogę sie odwołać później
        for (; i < 10; i++) {
            if (i==5){
                break;//break dochodzi do 5 i tyle, continue omija 5 i dobija do 10
            }
            System.out.println(i +" pętla");
        }*/
       // zadanie : zmodyfikujcie zadanie z obliczaniem kwadratow
        // liczb mniejszej od wskazanej z pominieciem nieparzystych liczb
        // przy uzyciu continue
        System.out.println("podaj liczbę całkowitą");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i%2!=0)
                continue;
            System.out.println(i +" " + i * i);
        }
    }
}
