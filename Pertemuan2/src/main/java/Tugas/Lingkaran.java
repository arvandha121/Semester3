package Tugas;
public class Lingkaran {
    double phi, r;
    double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }
    double hitungKeliling(){
        double keliling = 2 * phi * r;
        return keliling;
    }
    public void tampilLuas(){
        System.out.println("Luas lingkaran = "+hitungLuas());
        
    }
    public void tampilKeliling(){
        System.out.println("Keliling lingkaran = "+hitungKeliling());
    }
}
