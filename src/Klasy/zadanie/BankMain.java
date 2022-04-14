package Klasy.zadanie;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Konto konto1= new Konto("234235235", 100, "Nowak");
        Konto konto2= new Konto("43342342352w35", 1000, "Kowalski");
        Konto konto3= new Konto("PL3222342352w35", 1000, "Malinowski");

        konto1.wykonajPrzelewPrzychodzacy(200);
        konto2.wykonajPrzelewWychodzacy(200);
        bank.zalozKonto(konto1);
        bank.zalozKonto(konto2);
        bank.zalozKonto(konto3);

        bank.wyswietlInfoOKontach();
    }
}
