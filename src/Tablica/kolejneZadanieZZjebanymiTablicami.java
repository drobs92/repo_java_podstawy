package Tablica;

import javax.net.ssl.HostnameVerifier;
import java.util.Scanner;

public class kolejneZadanieZZjebanymiTablicami {
    public static void main(String[] args) {
//Zadanie: wczytac 5 elementow tablicy i wylicz sume wszywstkich elementow\
        int [] nazwaTab = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<nazwaTab.length;i++){
            System.out.println("podaj element tablicy nr "+i);
            nazwaTab[i] = scanner.nextInt();
        }
        int j=0;
        for (int i = 0; i<nazwaTab.length;i++){
            j+= nazwaTab[i];
            System.out.println("Test "+j );

        }
        System.out.println(j);

    }
}

