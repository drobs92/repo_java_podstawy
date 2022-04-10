package Tablica;

import java.util.Scanner;

public class zadanieZTablicami {
    public static void main(String[] args) {
        //Zadanie: Pobierz od uzytkownika tablice liczb calkowitych a
        // nastepnie wyswietl tylko te elementy na nieparzystych indeksach
        int[] zjebanezadanietablica = new int[5];//5 elelemtów tablicy int
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<zjebanezadanietablica.length;i++){//i ma być od zera; znaków i nie może być więcej niż [5]
            zjebanezadanietablica[i]= scanner.nextInt();//nadanie wartości i
        }//wyjście z pętli po nadaniu jej wartości
        for(int i =0;i<zjebanezadanietablica.length;i++){
            if(i%2!=0){
                System.out.println(zjebanezadanietablica[i]);
            }
        }
    }
}
