package Praktikum;

import Praktikum.ICumlaude;
import Praktikum.Mahasiswa;
import Praktikum.PascaSarjana;
import Praktikum.Rektor;
import Praktikum.Sarjana;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        Soal Nomer 2
//        pakrektor.beriSertifikatCumlaude(mhsBiasa);
        
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        
        //Soal Nomer 4
//        masterCumlaude.kuliahDiKampus();
    }
}