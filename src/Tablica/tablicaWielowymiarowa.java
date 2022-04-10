package Tablica;

import java.util.Scanner;

public class tablicaWielowymiarowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] tab = new int[3][4];//tabela ma wiersze oraz kolumny 3 i 4
        for (int i = 0; i < tab.length; i++) {//i ma zaczynać od zera, bedzie ich 3 szt, ma rosnac
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println("podaj element dla wiersza "+ i + " i kolumny "+ j);
                //pętla zagnieżdżona, określa kolumny 4 sztuki
                tab[i][j] = scanner.nextInt();
                //pobieram i i j
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println("");
        }
    }
}