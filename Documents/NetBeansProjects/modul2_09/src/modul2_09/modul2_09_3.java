/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_09;

import  javax.swing.JOptionPane;

/**
 *
 * @author Ainiha
 */
public class modul2_09_3 {
    public double luas_PersegiPanjang(int panjang, int lebar) {
        int total = panjang * lebar;
        return total;
    }
    public double luas_Segitiga(int alas, int tinggi) {
        int total = (alas * tinggi) / 2;
        return total;
    }
    public double luas_Lingkaran(int diameter) {
        int jari_jari = diameter / 2;
        double total = Math.PI * Math.pow(jari_jari, 2);
        return total;
    }
    
    public static void main(String[] args) {
        modul2_09_3 count = new modul2_09_3();
        
        try {
            double total = 0;
            String jenis = "";
            int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan : \n" 
                    + "1. Luas PersegiPanjang\n" 
                    + "2. Luas Segitiga\n" 
                    + "3. Luas Lingkarang\n"));
            
            if (pilihan == 1) {
                int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang : "));
                int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar : "));
                total = count.luas_PersegiPanjang(panjang, lebar);
                jenis = "Persegi Panjang";
                
            } else if (pilihan == 2) {
                int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas : "));
                int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi : "));
                total = count.luas_Segitiga(alas, tinggi);
                jenis = "Segitiga";
                
            } else if (pilihan == 3) {
                int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Diameter : "));
                total = count.luas_Lingkaran(diameter);
                jenis = "Lingkaran";
    
            } else {
                    JOptionPane.showMessageDialog(null, "Pilihan Tidak Valid, Harus Antara 1-3");
                    return;
            }
            
            JOptionPane.showMessageDialog(null, "Luas " + jenis + " = " + total);
            System.out.println("Luas " + jenis + " = " + total);
        } catch (Exception e) {
            System.out.println("Input Tidak valid, Silahkan Coba Lagi");
        }
    }
    
}
