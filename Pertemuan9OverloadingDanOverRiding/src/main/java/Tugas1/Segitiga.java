package Tugas1;

public class Segitiga {
    private int sudut;
    
    int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    double keliling(int sisiA, int sisiB){
        return Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
    }
}
