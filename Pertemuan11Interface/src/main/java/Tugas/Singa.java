package Tugas;

public class Singa extends Binatang implements IKarnivora{
    public String suara, warnaBulu;

    Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis          = Karnivora");
        System.out.println("Makanan        = Daging");
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
