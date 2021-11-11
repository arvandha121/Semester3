/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpercobaan;
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("======= Mahasiswa 1 =======");
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println("======= Mahasiswa 2 =======");
        mhs1.nim = 102;
        mhs1.nama = "Arief";
        mhs1.alamat = "Jl. Biola 9Q";
        mhs1.kelas = "1C";
        mhs1.tampilBiodata();
        System.out.println("======= Mahasiswa 3 =======");
        mhs1.nim = 103;
        mhs1.nama = "Nauvan";
        mhs1.alamat = "Jl. Mawar 3B";
        mhs1.kelas = "1G";
        mhs1.tampilBiodata();
    }
}
