package Praktikum;

import Praktikum2.IBerprestasi;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda...");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        
        System.out.println("--------------------------------------------");
    }
    
}
