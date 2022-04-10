package Tablica;

public class tablicaWielowymiarowa2 {

    public static void main(String[] args) {
        int[][] tab = new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3},{4,4,4,4}};//uzupełnienie ręczne wierszami i kolumnami
        //pierwsza klamra pierwszy wiersz etc
/*Zadanie: zadeklarujcie dwuwymiarowa tablie i
        wczytajcie do niej elemenmty, nastepnie wyswietlcei te
        elementy ktorych suma numerow kolumny i wiersza daje 3
    */
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i + j == 3) {
                    System.out.print(tab[i][j]);// to zadanie z sumą 3
                }else
                    System.out.print("#");
                }
            System.out.println(" ");
            }
        }
    }



