package Tugas;

public class jenisKelamin {
    
    private String jenis;
    
    jenisKelamin(String jenis){
        this.jenis = jenis;
    }
    jenisKelamin(){
        
    }
    void setJenis(String jenis){
        this.jenis = jenis;
    }
    String getJenis(){
        return jenis;
    }
    String info(){
        String info = "";
        info += "Kelamin : "+getJenis();
        return info;
    }
}
