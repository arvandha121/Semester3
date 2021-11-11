package Tugas;

/**
 *
 * @author asus
 */
public class Demo {
    public static void main(String[] args) {
        bolpoin b = new bolpoin();
        bolpoinBiru bb = new bolpoinBiru();
        bolpoinHitam bh = new bolpoinHitam();
        bolpoinHitam bh2 = new bolpoinHitam();
        laptop l = new laptop();
        mouse m = new mouse();
        
        //class bolpoinBiru
        bb.setWarna("Biru");
        bb.setHarga(1500);
        bb.cetakStatus();
        System.out.println();
        
        //class bolpoinHitam1
        bh.setWarna("Hitam");
        bh.setHarga(1000);
        bh.cetakStatus();
        System.out.println();
        
        //class bolpoinHitam2
        bh2.setWarna("Hitam");
        bh2.setHarga(2000);
        bh2.cetakStatus();
        System.out.println();
        
        //class bolpoin
        b.setMerek("Snowman");
        b.setJenis("per pegas");
        b.setKegunaan("Menulis");
        b.cetakStatus();
        System.out.println();
        
        //class laptop
        l.setMerek("Asus");
        l.setWarna("Abu-abu");
        l.tambahKecerahan(5);
        l.kurangKecerahan(2);
        l.setHarga(8575000);
        l.cetakStatus();
        System.out.println();
        
        //class mouse
        m.setMerek("Divipard");
        m.setWarna("hitam dan silver");
        m.setBanyak(1);
        m.setHarga(99000);
        m.cekStatus();
    }
}
