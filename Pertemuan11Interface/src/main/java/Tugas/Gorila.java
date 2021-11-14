package Tugas;

public class Gorila extends Binatang implements IKarnivora, IHerbivora{
    public String suara, warnaBulu;
    
    Gorila(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis          = Karnivora + Herbivora");
        System.out.println("Makanan        = Daging + Tumbuhan");
    }

    @Override
    public void displayMakan() {
        System.out.println("Nama Binatang  = "+super.getNama());
        System.out.println("Jumlah Kaki    = "+super.getKaki());
    }
    
    void displayData(){
        System.out.println("Suara          = "+suara);
        System.out.println("Warna Bulu     = "+warnaBulu);
    }
}
