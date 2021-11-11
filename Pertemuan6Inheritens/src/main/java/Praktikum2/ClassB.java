package Praktikum2;

public class ClassB extends ClassA{
    private int z;
    
    void setZ(int z){
        this.z = z;
    }
    void getNilaiZ(){
        System.out.println("nilai z: "+z);
    }
    void getJumlah(){
        System.out.println("jumlah: "+(getX()+getY()+z));
    }
}
