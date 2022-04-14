package ZadaniaDomowe.kalkulatorZKlas;

public class FirmaMain {
    public static void main(String[] args) {
        Firma firma = new Firma("Abab", "Sp. z o. o.", "12-123-1213");
        Firma.Pracownik pracownik = firma.new Pracownik("Pawel", "Nowak", "Kasjer");
        pracownik.gdziePracuje();
    }
}
