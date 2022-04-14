package Klasy.wewnętrzne;

public class TelefonMain {
    public static void main(String[] args) {
        Telefon telefon = new Telefon("Nokia", "Lumia", 4);
        Telefon.Wyswietlacz wyswietlacz = telefon.new Wyswietlacz(6.5, 10000);
        wyswietlacz.wydrkujInfo();
        Telefon telefon1 =new Telefon("samsung","a20",3);
        Telefon.Wyswietlacz wyswietlacz1=telefon1.new Wyswietlacz(12,3);

    }
}
