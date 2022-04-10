package opeartory;

import java.util.Scanner;

public class StanWody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj stan rzeki w cm");
        float stanrzeki = scanner.nextFloat();
        System.out.println("Czy będzie padać?");
        boolean descz = scanner.nextBoolean();
        if (stanrzeki >= 600f && stanrzeki <=699f && descz == true) {
            System.out.println("może być groźnie");
        } else if (stanrzeki >= 700f && stanrzeki <= 819f && descz == true || descz == false) {
            System.out.println("stan ostrzegawczy, tczew");
        } else if (stanrzeki >= 820f && descz == false) {
            System.out.println("stan alarmowy");
        } else if (stanrzeki > 820f && descz == true) {
            System.out.println("zabezpiecz dom, bo wyleje");
        } else {
            System.out.println("jest git");
        }
    }
}

