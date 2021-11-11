package Tugas2;

public class Anggota {
    int limitPinjam = 5000000, jumlahPinjam;
    String nama,ktp;
    
    Anggota(String k, String n, int lp){
        this.ktp = k;
        this.nama = n;
        this.limitPinjam = lp;
    }
    int getJumlahPinjaman(){
       return jumlahPinjam; 
    }
    String getNama(){
        return nama;
    }
    int getLimitPinjaman(){
        return limitPinjam;
    }
    void pinjam(int newValue){
        if(limitPinjam >= newValue){
            if(jumlahPinjam <= newValue){
                jumlahPinjam += newValue;
            }else if(jumlahPinjam >= newValue){
                System.out.println("Maaf, Jumlah pinjama melebihi limit.");
            }
        }
    }
    void angsur(int newValue){
        int min = getJumlahPinjaman() * 10 / 100;
        if(jumlahPinjam >= min){
            if(min <= newValue){
                jumlahPinjam -= newValue;
            }else{
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman”");
            }
        }
    }
}
