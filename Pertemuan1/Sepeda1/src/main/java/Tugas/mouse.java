package Tugas;

/**
 *
 * @author asus
 */
public class mouse {
    private String merek;
    private String warna;
    private int harga;
    private int banyakTombol;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
            
    public void setHarga(int newValue){
        harga = newValue;
    }
            
    public void setBanyak(int newValue){
        banyakTombol = newValue;
    }
    
    public void cekStatus(){
        System.out.println("Merek mouse = "+merek);
        System.out.println("Warna mouse = "+warna);
        System.out.println("harga mouse = "+harga);
        System.out.println("banyak tombol pada mouse = "+banyakTombol);
    }
}
