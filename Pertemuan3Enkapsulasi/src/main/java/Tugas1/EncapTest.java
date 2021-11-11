package Tugas1;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAgeMinMax(35);
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
        
        System.out.println("================");
        
        encap.setName("Brian");
        encap.setAgeMinMax(25);
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
        
        System.out.println("================");
        
        encap.setName("Kristin");
        encap.setAgeMinMax(17);
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
    }
}
