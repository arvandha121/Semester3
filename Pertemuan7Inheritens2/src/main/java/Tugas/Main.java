package Tugas;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pc pc = new Pc();
        System.out.println("==========Data Spek Komputer==========");
        pc.merk = "MSI";
        pc.kecProsesor = 3500;
        pc.sizeMemory = 8000;
        pc.jnsProsesor = "Intel";
        pc.ukuranMonitor = 32;
        pc.tampilPc();
        
        Mac m = new Mac();
        System.out.println("==========Data Spek Leptop Mac==========");
        m.merk = "Apple";
        m.kecProsesor = 4000;
        m.sizeMemory = 16000;
        m.jnsProsesor = "M1 chip prosesor";
        m.jnsBatrei = "Litium Li-on";
        m.security = "private";
        m.tampilMac();
        
        System.out.println("==========Data Spek Leptop Windows==========");
        Windows w = new Windows();
        System.out.println("Merk = ");
        w.merk = sc.nextLine();
        System.out.println("KecProsesor = ");
        w.kecProsesor = sc.nextInt();
        System.out.println("sizeMemory = ");
        w.sizeMemory = sc.nextInt();
        System.out.println("JenisProsesor = ");
        w.jnsProsesor = sc.next();
        System.out.println("Jenis Batrei = ");
        w.jnsBatrei = sc.next();
        System.out.println("Fitur = ");
        w.fitur = sc.next();
        System.out.println("--------------------------------------------");
        w.tampilWindows();
    }
}
