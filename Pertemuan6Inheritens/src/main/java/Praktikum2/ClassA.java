package Praktikum2;

public class ClassA {
    private int x;
    private int y;
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    public void getNilai(){
        System.out.println("nilai x: "+x);
        System.out.println("nilai y: "+y);
    }
}
