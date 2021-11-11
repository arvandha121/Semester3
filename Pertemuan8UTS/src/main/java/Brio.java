public class Brio extends Honda{
    public String warna;
    public int CC;
    
//    Brio(){
//        
//    }
//    Brio(String jenis, String transmisi, int platNomer, String merk, int nomerRangka, int nomerMesin, String warna, int CC){
//        super(jenis, transmisi, platNomer, merk, nomerRangka, nomerMesin);
//        this.warna = warna;
//        this.CC = CC;
//    }
    void DataBrio(){
        super.DataHonda();
        System.out.println("Warna        = "+warna);
        System.out.println("CC           = "+CC);
    }
}
