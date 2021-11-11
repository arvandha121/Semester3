package Tugas;

public class main {
    public static void main(String[] args) {
        jenisKelamin k1 = new jenisKelamin();
        Umur u = new Umur(25);
        Biodata b = new Biodata("Putri","Jl.Mawar",12345,k1,u);
        k1.setJenis("Perempuan");
        System.out.println(b.info());
        u.info();
    }
}
