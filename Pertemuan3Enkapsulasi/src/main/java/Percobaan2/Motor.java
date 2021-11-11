package Percobaan2;

public class Motor {
    private int kecepatan = 95;
    private boolean kontakOn = false;
    
    void nyalakanMesin(){
        kontakOn = true;
    }
    void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    void tambahKecepatan(){
        int max = 100;
        if(kontakOn == true){
            if(kecepatan >= max){
                System.out.println("Anda sudah dalam batas maksimal!!");
            }else{
                kecepatan += 5;
            }
        }else{
            // System.out.println("Kecepatan tidak bisa bertambah karena mesin OFF");
        }
    }
    void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin OFF");
        }
    }
    void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("kecepatan "+kecepatan+"\n");
    }
}
