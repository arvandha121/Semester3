package Tugas;
public class Peminjaman {
    int id, harga;
    String namaMember, namaGame;
    
    public int total(){
        harga = harga+0;
        return harga;
    }
    
    public void tampilData(){
        System.out.println("id\t\t: "+id);
        System.out.println("Nama Member\t: "+namaMember);
        System.out.println("Nama Game\t: "+namaGame);
        System.out.println("harga\t\t: "+total());
    }
}
