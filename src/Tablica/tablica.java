package Tablica;

public class tablica {
    public static void main(String[] args) {
        double[] mojDouble = new double[4];

        double[] mojDoubleZainicjalizowany = new double[]{34d, 45d, 66d, 33d};
        double[] zadanieDouble = new double[10];
//ręcznie wypełnienie tablicy moj double
        mojDouble[0] = 234.2;
        mojDouble[1] = 23.2;
        mojDouble[2] = 34.2;
        mojDouble[3] = 234.9;
        System.out.println(mojDouble[0]);
        System.out.println(mojDouble[1]);
        System.out.println(mojDouble[2]);
        System.out.println(mojDouble[3]);
        //wypełnienie tablicy za pomocą for
        for (double temp : mojDoubleZainicjalizowany)
            System.out.println((temp + " "));
        //zadanie
        double[] mojeDouble = new double[4];
        double j=1;
        int leng =mojeDouble.length;
        for (int i=0;i<leng;i++){
            j=j+3;
            mojeDouble[i]= j;
            System.out.println(mojeDouble[i]);

        }
    }
}