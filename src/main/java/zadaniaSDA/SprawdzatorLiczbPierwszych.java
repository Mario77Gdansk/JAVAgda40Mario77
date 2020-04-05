package zadaniaSDA;

public class SprawdzatorLiczbPierwszych {

    public SprawdzatorLiczbPierwszych(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    private int [] liczbyPierwsze;

    public boolean czyPierwsza(int a) {
       boolean isEqual = false;
        for (int i : liczbyPierwsze) {
           if (i==a) {
               return true;
           };
       }
       return false;
    }
}
