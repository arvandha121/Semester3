package Tugas;

public class Pegawai{
    private String nip, nama, alamat;
    public int gaji;
    
    Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    String getNama(){
        return nama;
    }
    int getGaji(){
        return gaji;
    }
}
