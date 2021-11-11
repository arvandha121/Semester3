package Tugas;

/**
 *
 * @author asus
 */
public class laptop {
    private String merek;
    private String warna;
    private int kecerahanLayar;
    private int harga;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void tambahKecerahan(int increment){
        kecerahanLayar = kecerahanLayar + increment;
    }
    
    public void kurangKecerahan(int increment){
        kecerahanLayar = kecerahanLayar - increment;
    }
    
    public void setHarga(int newValue){
        harga = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("merek laptop = "+merek);
        System.out.println("warna laptop = "+warna);
        System.out.println("kecerahan layar = "+kecerahanLayar);
        System.out.println("harga = "+harga);
    }
}
