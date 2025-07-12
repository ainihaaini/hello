/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_09;

/**
 *
 * @author Ainiha
 */
class count {

    static double luas_lingkaran(int diameter) {
        int jari_jari = diameter / 2;
        return  Math.PI * Math.pow(jari_jari, 2);
    }

    static double volume_tabung(int diameter, int tinggi) {
        int jari_jari = diameter / 2;
        return  Math.PI * Math.pow(jari_jari, 2) * tinggi;
    }

    static double volume_kerucut(int diameter, int tinggi) {
        int jari_jari = diameter / 2;
        return  (Math.PI * Math.pow(jari_jari, 2) * tinggi) / 3;
    }
    
    static  double  volume_bola(int diameter) {
        int jari_jari = diameter / 2;
        return  (4 * Math.PI * Math.pow(jari_jari, 3)) / 3;
    }
    
}
