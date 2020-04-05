package petle;

public class Aplication {
    public static void main(String[] args) {
//        for (int i = 0; i<101; i++) System.out.println(i);
//        for (int i = 100; i>0; i--) System.out.println(i);

//        int i = 0;
//        while (i<= 100) {System.out.println(i);
//        i++;}

//for (int i = 300 ; i<1001; i++)
//    }}
//
//        String napis = "Jestem na dobrej doridze do zostania proesjonalnym programista Java";

//            for (int i = 1; i <= 10; i++) {
//            System.out.println("nr: " + i + napis);
//        }

//        for (int i = 0; i < napis.length(); i = i+2)
//        {
//            System.out.print(napis.charAt(i));
//        }
//
//        for (int i = napis.length()-1;i>=0;i--) {
//            System.out.print(napis.charAt(i));
//        }

//        while (true)
//            System.out.println(napis);

//        for (int i = 300; i<=1000; i++)
//        {
//            if (i%3 == 0) System.out.println(i);
//        }

        for (int i = 123; i<=15000; i++)
        {
            if (i%3 == 0 && i%2 ==0) System.out.println(i); // zobacz różnicę pomiędzy && i ||
        }

        dodawanie (0,1,5);
    }


        public static void dodawanie (int a, int b, int c) {
            int suma = 0;
            while (suma < c) {
                suma = suma + (a+b);

            }
            System.out.println(suma);
        }

    }

