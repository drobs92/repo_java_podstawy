package opeartory;

import java.util.Scanner;

public class SwitchZamiastElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int numer = scanner.nextInt();
        if(numer ==1){
            System.out.println("1");}
            else if(numer == 2);{
            System.out.println("2");
        }
        else if{
            System.out.println("inna");
        }*/
/*switch (numer){
    case 1:
        System.out.println("1");
        break;
    case 2:
        System.out.println("2");
        break;
    default:
        System.out.println("inna");
        break;
}
*/
        //Napisz instrukcje switch wyświetlającą na podstawie zmiennej całkowitej 'nr' nazwę miesiąca słownie.
        //
        //1->Styczeń
        //
        //2->Luty
        //
        //3->Marzec
       /* int miesiac = scanner.nextInt();
        switch (miesiac) {
            case 1:
                System.out.println("styczeń");
                break;
            case 2:
                System.out.println("luty");
                break;
            case 3:
                System.out.println("marzec");
                break;
            default:
                System.out.println("inne");
                */

        /*
Napisz instrukcje która na podstawie zmiennej całkowitej
ocena wyświetla jedna z informacji:
brak promocji do następnej klasy, promocja do następnej klasy,
 promocja z ocena celująca
 */
        System.out.println("Jaką masz ocenę?");
        int ocena = scanner.nextInt();
        switch(ocena) {
            case 1:
            case 2:
                System.out.println("nie zdałeś głąbie");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("brawo, kolejny level czeka");

        }
    }
}
