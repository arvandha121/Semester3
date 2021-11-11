package Praktikum4;

public class Penumpang {
    
    private String ktp, nama;
    
    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    void setKtp(String ktp){
        this.ktp = ktp;
    }
    String getKtp(){
        return ktp;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String nama(){
        return nama;
    }
    String info(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }

    String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
