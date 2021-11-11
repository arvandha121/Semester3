public class Toyota extends Mobil{
    public String merk;
    public int nomerRangka, nomerMesin;
    
//    Toyota(){
//        
//    }
//    Toyota(String jenis, String transmisi, int platNomer, String merk, int nomerRangka, int nomerMesin){
//        super(jenis, transmisi, platNomer);
//        this.merk = merk;
//        this.nomerRangka = nomerRangka;
//        this.nomerMesin = nomerMesin;
//    }
    void DataToyota(){
        super.DataMobil();
        System.out.println("Merk         = "+merk);
        System.out.println("Nomer Rangka = "+nomerRangka);
        System.out.println("Nomer Mesin  = "+nomerMesin);
    }
}
