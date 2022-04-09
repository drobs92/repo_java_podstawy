package pierwszy_program;

public class HelloWorld {

    final int nazwa = 3;

    byte byteNumber = -128;
    Byte byteNumberI = -128;
    short shortNumber = 32767;
    float floatNumber = 32767.780f;
    double doubleNumber = 32767.780;
    boolean logicValue = false && true;

    Boolean logicValuenullBig = null;

    char charValue = '\r';
    String stringValue = "sgsdgwegwegweg";

    final int zmienna = 23;
    static int number = 23;

    public static void main(String[] args) {
        new HelloWorld().metoda(5);
    }

    public int metoda(final int adding){
        final int drugaZmienna = 4;
        int zmienna =4;
        double suma = shortNumber *  doubleNumber;
        System.out.println(suma);
        return 5;
    }


    void someExampleMethod() {

        if (true) {
            int a = 1;  // zmienna lokalna zadeklarowana wewnątrz instrukcji sterującej - zasięg tylko wewnątrz tej instrukcji
        }
        for (int i = 0; i < 10; i++) {
            int a =24;
            // zasięg zmiennej 'i' jdynie wewnątrz tej pętli
        }

    }
}
