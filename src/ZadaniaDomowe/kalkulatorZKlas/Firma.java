package ZadaniaDomowe.kalkulatorZKlas;

/*Zadanie 2: Zamodelujcie Klasę Firma,
z atrybutem nazwa oraz innymi dowolnymi
atrybutami, konstruktorem wieloparametrowym,
ktora ma zagniezdzona klase niestatyczna
Pracownik z trzema  atrybutami np.: imie nazwisko i stanowisko,
konstruktorem oraz metodę wypisującą na konsoli do jakiej firmy
należy pracownik. Wywolajcie w metodzie Main innej klasy obiekt klasy
Pracownik i wywolajcie metode wyswietlajaca ifnromacje o firmie. (edited)
*/

public class Firma {

    private String nazwa;
    private String rodzaj;
    private String nip;

    public Firma(String nazwa, String rodzaj, String nip) {
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
        this.nip = nip;
    }

    public class Pracownik{
        private String imie;
        private String nazwisko;
        private String stanowisko;

        public Pracownik(String imie, String nazwisko, String stanowisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.stanowisko = stanowisko;
        }

        public void gdziePracuje(){
            System.out.println(String.format("Nazywam się %s %s i pracuje w %s", imie, nazwisko, nazwa));
        }
    }

}