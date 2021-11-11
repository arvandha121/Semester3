/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepeda1;

/**
 *
 * @author asus
 */
public class Sepeda {
    public static void main(String[] args) {
        Sepeda1 spd1 = new Sepeda1();
        Sepeda1 spd2 = new Sepeda1();
        SepedaGunung spd3 = new SepedaGunung();
        
        spd1.setMerk("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerk("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerk("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();
    }
}
