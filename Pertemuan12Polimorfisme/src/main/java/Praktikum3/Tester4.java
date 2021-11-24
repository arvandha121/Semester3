package Praktikum3;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill); //pay for electricity bill
        System.out.println("------------------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); //pay for Permanent Employee
        System.out.println("------------------------------");
        
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.pay(pEmp); //Show permanent employee info
        System.out.println("------------------------------");
        ow.showMyEmployee(iEmp); //Show Internship employee info
    }
}
