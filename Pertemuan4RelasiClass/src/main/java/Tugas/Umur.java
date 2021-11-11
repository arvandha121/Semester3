package Tugas;

public class Umur {
    private int umur;
    Umur(int umur){
        this.umur = umur;
    }
    Umur(){
        
    }
    void setUmur(int umur){
        this.umur = umur;
    }
    int getUmur(){
        return umur;
    }
    void info(){
        System.out.println("umur : "+getUmur());
    }
}
