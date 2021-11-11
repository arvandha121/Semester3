package Tugas;

/**
 *
 * @author asus
 */
public class bolpoin {
    private String merek;
    private String jenisBolpoin;
    private String kegunaan;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setJenis(String newValue){
        jenisBolpoin = newValue;
    }
    
    public void setKegunaan(String newValue){
        kegunaan = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek Bolpoin = "+merek);
        System.out.println("Jenis = "+jenisBolpoin);
        System.out.println("Kegunaan = "+kegunaan);
    }
}
