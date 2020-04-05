package zmienne;

public class deklaracjeZad1i2i3i4 {
    public static void main(String[] args) {
        int zmiennaTypuInteger = 125;
        double zmiennaTypuDouble = 257893312312389d;
        float zmiennaTypuFloat = 1.2456789f;
        System.out.println("\n"+"***Zadanie nr 1***"+"\n");
        System.out.println(zmiennaTypuInteger);
        System.out.println(zmiennaTypuFloat);
        System.out.println(zmiennaTypuDouble);


        System.out.println("\n"+"***Zadanie nr 2***"+"\n");
        System.out.println(zmiennaTypuInteger*zmiennaTypuDouble);


        System.out.println("\n"+"***Zadanie nr 3***"+"\n");
        double zmiennaDoubleNr2 = 3.17d;
        System.out.println("zmienna double z zadania nr3: "+zmiennaDoubleNr2);


        System.out.println("\n"+"***Zadanie nr 4***"+"\n");
        int zmiennaIntNr2 = (int) zmiennaDoubleNr2;
        System.out.println("Zrzutowana zmienna z zadania 3 na integer: "+zmiennaIntNr2);






    }
}
