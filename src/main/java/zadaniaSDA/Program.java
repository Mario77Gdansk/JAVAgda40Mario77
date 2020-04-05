package zadaniaSDA;

public class Program {
    public static void main(String[] args) {
//    Program program = new Program();
//    program.tabliczkaMnozenia(5);
//
//    TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
//    System.out.println(tabliczkaMnozenia.getLiczba());
//    tabliczkaMnozenia.wypiszTabliczke();
//    }

//    public void tabliczkaMnozenia(int liczba) {
//        System.out.println("Tabliczka mnożenia dla liczby: " + liczba);
//        for (int i = 1; i<=liczba; i++) {
//            System.out.println(liczba + " * " + i + " = " + liczba*i);
//            }
        System.out.println(sumaLiczb(1, 1000));
    }

    public static int sumaLiczb(int x, int y) {
        int suma = 0;
        for (int i = x; i <= y; i++) suma = suma + i;
        return suma; // pamiętaj kurwa, że musisz coś zwrócić jak robisz metodę różną od main
    }
}
