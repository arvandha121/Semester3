package Percobaan2;

public class Manager extends Karyawan{
    public int tunjangan;
    
    Manager(){
        
    }
    void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan   = "+tunjangan);
        System.out.println("Total Gaji  = "+(super.gaji+tunjangan));
    }
}

