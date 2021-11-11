package Tugas;

public class Dosen extends Pegawai{
    public int jumlahSKS, TARIF_SKS = 250000;
    
    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }
    void setSKS(int sks){
        jumlahSKS = jumlahSKS + sks;
    }
    @Override
    public int getGaji(){
        return jumlahSKS * TARIF_SKS;
    }
}
