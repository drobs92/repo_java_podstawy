package Klasy.zadanie;

public class Bank {
    private Konto[] konta = new Konto[10];
    private int iloscKont = 0;
    private String nazwaBanku;

    public void zalozKonto(Konto konto){
        konta[iloscKont] = konto;
        iloscKont++;
    }

    public void wyswietlInfoOKontach(){
        for (Konto konto:konta) {
            System.out.println(konto);
        }
    }

    public String getNazwaBanku() {
        return nazwaBanku;
    }

    public void setNazwaBanku(String nazwaBanku) {
        this.nazwaBanku = nazwaBanku;
    }
}
