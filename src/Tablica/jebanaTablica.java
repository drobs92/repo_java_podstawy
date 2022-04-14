package Tablica;

import java.util.Scanner;

public class jebanaTablica {
    public static void main(String[] args) {
        /*Zadanie: zadeklarowac dwie tablice , wczytac z klawiatury
        wartosci pierwszej a nastepnie skopiowac pierwsza do drugiej  tablicy
        na koncu wyprintowac ta skopiowana tablice
        */
        int[] tablica = new int [5];
        int[] tablica2 = new int[5];
        Scanner scanner =new Scanner(System.in);
        System.out.println("tablica 1: ");
        for (int i = 0; i<tablica.length;i++) {
            System.out.println("podaj element tablicy nr " + i);
            tablica[i] = scanner.nextInt();
        }
       /* System.out.println("tablica 2: ");
        for (int i=0;i<tablica2.length;i++) {
            tablica2[i] = tablica[i];
            System.out.println(tablica2[i] + " ");
        }*/
        //ta powyżej ma liczby identyczne jak tablica
        //zadanie inne żeby były w odwrotnej kolejności
        System.out.println("tablica 2: ");
        for (int i=0;i<tablica2.length;i++) {
            tablica2[i] = tablica[tablica.length-i-1];//tablica dwa ma przyjąć wawrtości tablicy[ 5-0-1 =4 czyli 0,1,2,3,4 wartości wpisanej w tablicy
            System.out.print(tablica2[i] + " ");
        }
        System.out.println("");
        System.out.println("Tablica 1: ");
        for (int i = 0; i<tablica.length;i++) {

            System.out.print(tablica[i] + ",");
        }
    }
}
