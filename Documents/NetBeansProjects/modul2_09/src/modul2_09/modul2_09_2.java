/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_09;

import java.util.Scanner;

/**
 *
 * @author Ainiha
 */
public class modul2_09_2 {
    public double luas_lingkaran(int diameter) {
        int jari_jari = diameter / 2;
        double luas = Math.PI * Math.pow(jari_jari, 2);
        return luas;
    }
    public double volume_tabung(int diameter, double tinggi) {
        int jari_jari = diameter / 2;
        double total = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        return total;
    }
    public double volume_kerucut(int diameter, double tinggi) {
        int jari_jari = diameter / 2;
        double total = (Math.PI * Math.pow(jari_jari, 2) * tinggi) / 3;
        return total;
    }
    public double volume_bola (int diameter) {
        int jari_jari = diameter / 2;
        double total = (4 * Math.PI * Math.pow(jari_jari, 3)) / 3;
        return total;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        modul2_09_2 count = new modul2_09_2();
        
        try {
            String status = ""; 
            double hasil = 0;
            
            System.out.println("Pilihan : \n"
                    + "1. Luas Lingkaran\n" 
                    + "2. Volume Tabung\n" 
                    + "3. Volume Kerucut\n" 
                    + "4. Volume Bola\n");
            
            System.out.print("Masukkan Pilihan : ");
            byte pilihan = input.nextByte();
            
            if (pilihan == 1) {
                System.out.print("Masukkan Diameter : ");
                int diameter = input.nextInt();
                hasil = count.luas_lingkaran(diameter);
                status = "Menghitung Luas Lingkaran";
            } else if (pilihan == 2) {
                System.out.print("Masukkan Diameter : ");
                int diameter = input.nextInt();
                System.out.print("Masukkan Tinggi   : ");
                double tinggi = input.nextInt();
                hasil = count.volume_tabung(diameter, tinggi);
                status = "Menghitung Volume Tabung";
            } else if (pilihan == 3) {
                System.out.print("Masukkan Diameter : ");
                int diameter = input.nextInt();
                System.out.print("Masukkan Tinggi   : ");
                double tinggi = input.nextInt();
                hasil = count.volume_kerucut(diameter, tinggi);
                status = "Menghitung Volume Kerucut";
            } else if (pilihan == 4) {
                System.out.println("Masukkan Diameter : ");
                int diameter = input.nextInt();
                hasil = count.volume_bola(diameter);
                status = "Menghitung Volume Bola";
            } else {
                status = "Pilihan tidak valid, harus antara 1-4";
            }
            System.out.println("\nStatus : " + status);
            System.out.println("Hasil : " + hasil);
                    
        } catch (Exception e) {
            System.out.println("Input Tidak Valid, Silahkan Coba Lagi");
        }
    }
    
}

