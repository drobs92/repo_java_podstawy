package opeartory;

import java.util.Scanner;

public class ZabawaIfami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float temperature = scanner.nextFloat();

        if (temperature >= 38.0f) {
            System.out.print("Masz gorączkę!");
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            System.out.print("Jesteś zdrowa/zdrowy!");
        }
        else if (temperature >= 37.0f && temperature <= 37.9f){
            System.out.println("masz stan podgorączkowy");
        }
            else {
            System.out.print("Jesteś osłabiona/osłabiony!");
        }
        System.out.println("idzie dalej");
    }
}
