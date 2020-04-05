package zadaniaSDA;

import java.util.ArrayList;
import java.util.List;

public class ciągi {
    public static void main (String[] args) {

    List<Integer> lista = new ArrayList<>();


////        lista.add(15);
////        lista.add(20);
////        lista.add(30);
////        System.out.println(lista);
////        lista.remove(0);
////        System.out.println(lista);


//    }



    public  List<Integer>stworzCiagArytmetyczny(int dlugosc, int pierwszy, int roznica)
    {
        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);
        for (int i = pierwszy; i< długosc; i++) {
        ciag.add(pierwszy + i * roznica);
        }
        return ciag;
    }
}

}
