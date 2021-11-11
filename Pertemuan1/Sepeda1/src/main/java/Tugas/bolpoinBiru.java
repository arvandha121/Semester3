package Tugas;

/**
 *
 * @author asus
 */
public class bolpoinBiru extends bolpoin{
    private String warna;
    int harga;
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void setHarga(int newValue){
        harga = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Warna Bolpoin = "+warna);
        System.out.println("Harga = "+harga);
    }
}
