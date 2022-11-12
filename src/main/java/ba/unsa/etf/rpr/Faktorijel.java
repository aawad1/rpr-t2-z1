package ba.unsa.etf.rpr;

public class Faktorijel {
    public static double izracunaj(int broj) {
        double fakt=1;
        while(broj>1){
            fakt = fakt * broj;
            broj--;
        }
        return fakt;
    }
}
