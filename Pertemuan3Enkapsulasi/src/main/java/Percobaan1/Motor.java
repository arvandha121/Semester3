package Percobaan1;

public class Motor {
    int kecepatan = 0;
    boolean kontakOn = false;
    
    void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
