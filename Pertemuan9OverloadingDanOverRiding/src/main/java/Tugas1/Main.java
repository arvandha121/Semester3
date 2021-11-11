package Tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        
        System.out.println("total sudut segitiga 1 = "+s.totalSudut(50));
        System.out.println("total sudut segitiga 2 = "+s.totalSudut(20, 30));
        System.out.println("total keliling segitiga 1 = "+s.keliling(12, 15));
        System.out.println("total keliling segitiga 2 = "+s.keliling(12, 15, 20));
    }
}
