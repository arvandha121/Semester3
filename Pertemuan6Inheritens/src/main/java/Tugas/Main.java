package Tugas;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("212121", "Prayogo", "Kediri");
        dosen.setSKS(5);
        Dosen dosen2 = new Dosen("121212", "Nauvan", "Nganjuk");
        dosen2.setSKS(7);
        
        DaftarGaji gaji = new DaftarGaji(2);
        gaji.addPegawai(dosen);
        gaji.printSemuaGaji();
        System.out.println("");
        gaji.addPegawai(dosen2);
        gaji.printSemuaGaji();
    }
}
