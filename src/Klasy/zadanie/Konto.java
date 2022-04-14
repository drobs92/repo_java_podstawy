package Klasy.zadanie;

public class Konto {
    private String numerKonta;
    private double stanKonta;
    private String nazwiskoWlasciciela;

    public Konto(String numerKonta, double stanKonta, String nazwiskoWlasciciela) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }


    public String toString() {
        return "Konto{" +
                "numerKonta='" + numerKonta + '\'' +
                ", stanKonta=" + stanKonta +
                ", nazwiskoWlasciciela='" + nazwiskoWlasciciela + '\'' +
                '}';
    }

    public void wykonajPrzelewWychodzacy(double kwota){
        stanKonta = stanKonta - kwota;
    }

    public void wykonajPrzelewPrzychodzacy(double kwota){
        stanKonta = stanKonta + kwota;
    }

    public void sprawdzStanKonta(){
        System.out.println("Stan konta to: "+ stanKonta);
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public String getNazwiskoWlasciciela() {
        return nazwiskoWlasciciela;
    }

    public void setNazwiskoWlasciciela(String nazwiskoWlasciciela) {
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }
}
