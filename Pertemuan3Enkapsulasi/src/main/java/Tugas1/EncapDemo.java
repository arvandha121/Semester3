package Tugas1;

public class EncapDemo {
    private String name;
    private int age;
    
    String getName(){
        return name;
    }
    void setName(String newName){
        name = newName;
    }
    int getAge(){
        return age;
    }
//    void setAge(int newAge){
//        if(newAge > 30){
//            age = 30;
//        }else{
//            age = newAge;
//        }
//    }
    void setAgeMinMax(int newAge){
        if(newAge > 17 && newAge < 31){
            age = newAge;
        }else{
            System.out.println("Melebihi atau kurang batas umur!");
        }
    }
}
