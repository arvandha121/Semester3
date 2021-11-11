package Percobaan3;

public class Anggota {
    String nama, alamat;
    float simpanan;
    
    void setNama(String nama){
        this.nama = nama;
    }
    void setAlamat(String alamat){
        this.alamat = alamat;
    }
    String getNama(){
        return nama;
    }
    String getAlamat(){
        return alamat;
    }
    float getSimpan(){
        return simpanan;
    }
    void setor(float uang){
        simpanan += uang;
    }
    void pinjam(float uang){
        simpanan -= uang;
    }
}
