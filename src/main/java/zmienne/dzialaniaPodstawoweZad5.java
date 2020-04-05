package zmienne;

import java.util.Scanner;

public class dzialaniaPodstawoweZad5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby: ");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();

        System.out.println("suma liczb wynosi "+dodaj(a, b));
        System.out.println("różnica liczb wynosi "+odejmij(a, b));
        System.out.println("iloczyn liczb wynosi "+pomnoz(a, b));
        System.out.println("iloraz liczb wynosi "+podziel(a, b));
    }

    public static double dodaj(double a, double b){
        return a+b;
    }
    public static double odejmij(double a, double b){
        return a-b;
    }
    public static double pomnoz(double a, double b){
        return a*b;
    }
    public static double podziel(double a, double b){
        return a/b;
    }
}
