package Tugas;
public class mainLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        
        l.phi = 3.14;
        l.r = 7;
        
        System.out.println("===== Luas Lingkaran =====");
        System.out.println("Rumus");
        System.out.println("Luas = phi * r * r");
        System.out.println("Luas = "+l.phi+" * "+l.r+" * "+l.r);
        l.tampilLuas();
        System.out.println("===== Keliling Lingkaran =====");
        System.out.println("Rumus");
        System.out.println("Keliling = phi * r * 2");
        System.out.println("Keliling = "+l.phi+" * "+l.r+" * 2");
        l.tampilKeliling();
    }
}
