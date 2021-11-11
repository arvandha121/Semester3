import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Brio b = new Brio();
        System.out.println("========== Data Mobil Honda Brio ==========");
        b.jenis = "Honda";
        b.transmisi = "Manual";
        b.platNomer = 1920;
        b.merk = "Brio";
        b.nomerRangka = 20;
        b.nomerMesin = 2041720134;
        b.warna = "Silver";
        b.CC = 04;
        b.DataBrio();
        
        System.out.println("========== Data Mobil Toyota Avanza ==========");
//        Avanza a = new Avanza("Toyota", "Matic", 2019, "Avanza", 20, 2041720134, "Black", 04);
        Avanza a = new Avanza();
        a.jenis = "Toyota";
        a.transmisi = "Matic";
        a.platNomer = 2019;
        a.merk = "Avanza";
        a.nomerRangka = 20;
        a.nomerMesin = 2041720134;
        a.warna = "Black";
        a.CC = 04;
        a.DataAvanza();
    }
}
