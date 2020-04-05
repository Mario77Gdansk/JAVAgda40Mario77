package zadaniaSDA;

public class TabliczkaMnozenia {
    public static final int LICZBA = 5; // DOSTĘP Z ZEWNĄTRZ
    private final int liczba;

    public TabliczkaMnozenia(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczke() {
        System.out.println("Tabliczka mnożenia dla liczby: " + liczba);
        for (int i = 1; i <= liczba; i++) {
            System.out.println(liczba + " * " + i + " = " + liczba * i);
        }
    }
}
