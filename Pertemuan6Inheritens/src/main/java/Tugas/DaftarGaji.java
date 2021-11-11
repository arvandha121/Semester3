package Tugas;

public class DaftarGaji {
    Pegawai[] listPegawai;
    
    DaftarGaji(int gajiPegawai){
        this.listPegawai = new Pegawai[gajiPegawai];
    }
    
    void addPegawai(Pegawai pegawai){
        for (int i = 0; i < listPegawai.length; i++) {
            listPegawai[i] = pegawai;
        }
    }
    
    void printSemuaGaji(){
        for (int i = 1; i < listPegawai.length; i++) {
            System.out.println("Nama Pegawai : "+listPegawai[i].getNama());
            System.out.println("Gaji         : "+listPegawai[i].getGaji());
        }
    }
}
