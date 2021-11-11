package Tugas;
public class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJual(){
        float hargajual = hargaDasar - (diskon * hargaDasar);
        return(int) hargajual;
    }
    
    void tampilData(){
        System.out.println("kode barang = "+kode);
        System.out.println("nama barang = "+namaBarang);
        System.out.println("harga dasar = Rp."+hargaDasar);
        System.out.println("diskon      = "+(int)(diskon*100)+"%");
        System.out.println("harga jual  = Rp."+hitungHargaJual());
    }
}
