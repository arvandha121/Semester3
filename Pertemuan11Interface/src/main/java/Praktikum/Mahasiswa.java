package Praktikum;

public class Mahasiswa implements ICumlaude{
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
//    @Override
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    //Soal Nomer 2
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan Tugas Akhir");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3.00");
    }
}
