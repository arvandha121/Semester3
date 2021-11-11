package Tugas;
public class mainPeminjaman {
    public static void main(String[] args) {
        Peminjaman pinjam = new Peminjaman();
        
        pinjam.id = 001;
        pinjam.namaMember = "Arief Nauvan Ramadha";
        pinjam.namaGame = "PointBlank";
        pinjam.harga = 15000;
        pinjam.tampilData();
    }
}
