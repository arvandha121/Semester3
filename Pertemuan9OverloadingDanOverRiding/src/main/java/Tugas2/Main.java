package Tugas2;

public class Main {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        Dosen d = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.println("================================");
        m.bernafas();
        m.makan();
        System.out.println("================================");
        d.makan();
        d.lembur();
        System.out.println("================================");
        mhs.makan();
        mhs.tidur();
        System.out.println("================================");
        Manusia coba;
        //====================================================
        coba = m;
        m.makan();
        //====================================================
        coba = d;
        d.makan();
        //====================================================
        coba = mhs;
        mhs.makan();
        System.out.println("================================");
    }
}
