public class Avanza extends Toyota{
    public String warna;
    public int CC;
    
//    Avanza(){
//        
//    }
//    Avanza(String jenis, String transmisi, int platNomer, String merk, int nomerRangka, int nomerMesin, String warna, int CC){
//        super(jenis, transmisi, platNomer, merk, nomerRangka, nomerMesin);
//        this.warna = warna;
//        this.CC = CC;
//    }
    void DataAvanza(){
        super.DataToyota();
        System.out.println("Warna        = "+warna);
        System.out.println("CC           = "+CC);
    }
}
