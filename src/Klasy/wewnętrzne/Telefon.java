package Klasy.wewnętrzne;

public class Telefon {
    /*Zadanie: Zamodelujcie istneinie telefonu komorkowego mi
    wyswietlacza czyli stworzcie klase telefon komorkowy i wyswietlacz dodajcie pola
     tym klasom a nastepnie w metodzie Main powolajcie obikety tych klas*/
    private String firma;
    private String model;
    private int iloscAparatow;

    public Telefon(String firma, String model, int iloscAparatow) {
        this.firma = firma;
        this.model = model;
        this.iloscAparatow = iloscAparatow;


    }
    public class Wyswietlacz{
        private double przekatna;
        private int iloscKolorow;

        public Wyswietlacz(double przekatna, int iloscKolorow) {
            this.przekatna = przekatna;
            this.iloscKolorow = iloscKolorow;
        }

        public void wydrkujInfo(){
            System.out.println(firma+ " " + model+ " " +iloscAparatow+ " " + przekatna+ " " + iloscKolorow);
        }
    }


}
