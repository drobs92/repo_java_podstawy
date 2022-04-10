package Tablica;

import java.util.Scanner;

public class zadanieZTablicamiWielowym {
    public static void main(String[] args) {

        int[][] tab = new int[4][4];
        //TABLICZKA MNOŻENIA
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i == 0 || j == 0) {
                    tab[i][j] = i + j + 1;
                } else if (i > 0 || j > 0) {
                    tab[i][j] = (i + 1) * (j + 1);
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if ((i == j) || (i + j) == tab.length - 1)
                    System.out.print(" | " + tab[i][j] + " | ");
                else
                    System.out.print(" | * | ");
            }
            System.out.println();
        }

    }
}
