package Praktikum;

public class PascaSarjana extends Mahasiswa implements ICumlaude{

    public PascaSarjana(String nama) {
        super(nama);
    }
    
    @Override
    public void lulus() {
        super.kuliahDiKampus();
        System.out.println("Aku sudah menyelesaikan TESIS");
    }
    
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3.71");
    }
    
}
