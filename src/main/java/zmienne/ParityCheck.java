package zmienne;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę ...  ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        if (liczba % 2 == 0) System.out.println("Liczba " + liczba + " oczywiście jest parzysta");
        else System.out.println("Liczba jest nieparzysta");
    }
}