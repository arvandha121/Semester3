package Praktikum2;

public class MultipleInterfaceMul {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
        //Nomer 2
//        IBerprestasi IB = new IBerprestasi();
        
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
        
        pakRektor.beriSertifikatMawapres(sarjanaCum);
        System.out.println("------------------------------------------------");
        pakRektor.beriSertifikatMawapres(masterCum);
    }
}
