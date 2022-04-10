package opeartory;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LiczeniePodatku {
    public static void main(String[] args) {
      /*  Napisać program obliczający należny podatek dochodowy od osób fizycznych.
                Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek.
                Podatek obliczany jest wg. następujących reguł:
• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
                */
        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ DOCHÓD");
        double dochod = scanner.nextInt();
        if (dochod <= 120000) {
           double podatekmaly = (dochod * 0.17) - 556.02;
            System.out.println(podatekmaly);
        }
        else if (dochod >= 120000){
            double nadwyzka = dochod - 120000;
            double podatekduzy = 120000*0.17 -556.02 + nadwyzka*0.32;
            System.out.println(podatekduzy);
            }
        }
    }

