package Tugas;
import java.util.*;
public class mainBarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Barang b = new Barang();
        
        System.out.println("Masukkan kode barang = ");
        b.kode = sc.nextLine();
        System.out.println("Masukkan nama barang = ");
        b.namaBarang = sc.nextLine();
        System.out.println("masukkan harga dasar = ");
        b.hargaDasar = sc.nextInt();
        b.diskon = (float)10/100;
        b.tampilData();
    }
}
