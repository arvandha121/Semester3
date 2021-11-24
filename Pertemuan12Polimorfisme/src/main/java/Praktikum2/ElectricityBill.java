package Praktikum2;

public class ElectricityBill implements Payable{
    private int kwh;
    private String category;
    
    ElectricityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }
    int getKwh(){
        return kwh;
    }
    void setKwh(int kwh){
        this.kwh = kwh;
    }
    String getCategory(){
        return category;
    }
    void setCategory(String category){
        this.category = category;
    }
    @Override
    public int getpaymentAmount() {
        return kwh * getBasePrice();
    }
    public int getBasePrice(){
        int bPrice = 0;
        switch(category){
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }
    String getBillInfo(){
        return "kwh = "+kwh+"\n"+
        "Category = "+category+"("+getBasePrice()+" per KWH)\n";
    }
}
