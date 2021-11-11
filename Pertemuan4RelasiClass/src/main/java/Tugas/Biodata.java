package Tugas;

public class Biodata {
    
    private String nama, alamat;
    private int ktp;
    private jenisKelamin kelamin;
    private Umur umur;
    
    Biodata(String nama, String alamat, int ktp, jenisKelamin kelamin, Umur umur){
        this.nama = nama;
        this.alamat = alamat;
        this.ktp = ktp;
        this.kelamin = kelamin;
        this.umur = umur;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setAlamat(String alamat){
        this.alamat = alamat;
    }
    String getAlamat(){
        return alamat;
    }
    void setKtp(int ktp){
        this.ktp = ktp;
    }
    int getKtp(){
        return ktp;
    }
    void setKelamin(jenisKelamin kelamin){
        this.kelamin = kelamin;
    }
    jenisKelamin getKelamin(){
        return kelamin;
    }
    void setUmur(Umur umur){
        this.umur = umur;
    }
    Umur getUmur(){
        return umur;
    }
    String info(){
        String info = "";
        info += "Nama    : "+getNama()+"\n";
        info += "Alamat  : "+getAlamat()+"\n";
        info += "KTP     : "+getKtp()+"\n";
        info += this.kelamin.info()+"\n";
        return info;
    }
}
