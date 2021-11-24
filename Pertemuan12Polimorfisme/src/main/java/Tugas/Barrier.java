package Tugas;

public class Barrier implements Destroyable{
    int strength;
    
    Barrier(int strength){
        this.strength = strength;
    }
    void setStrength(int strength){
        this.strength = strength;
    }
    int getStrength(){
        return strength;
    }
    
    @Override
    public void destroyed() {
        strength -= 9;
    }
    String getBarrierInfo(){
        return "Barrier Strength = "+strength+"\n";
    }

}
