/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author 2201010294
 * tgl:2024-04-26
 */
public class Pertemuan5 {
    aritmatika Amatik = new aritmatika();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aritmatika Amatik = new aritmatika();
        int hsltambah = 0; 
        
        hsltambah = Amatik.tambah(3, 5);
        System.out.println("Hasil: "+hsltambah);
        
        
        Hitungluassegi3 HSL3 = new Hitungluassegi3();
        HSL3.SetAlas(5);
        HSL3.SetTinggi(8);
        double hsl = HSL3.HitungLsegi3();
        HSL3.TampilHasil();
    
    }
    
}
