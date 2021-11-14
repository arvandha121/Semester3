package Tugas;

public class main {
    public static void main(String[] args) {
        Keledai k = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Gorila g = new Gorila("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa s = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        
        k.displayBinatang();
        k.displayMakan();
        k.displayData();
        
        System.out.println("");
        g.displayBinatang();
        g.displayMakan();
        g.displayData();
        
        System.out.println("");
        s.displayBinatang();
        s.displayMakan();
        s.displayData();
    }
}
