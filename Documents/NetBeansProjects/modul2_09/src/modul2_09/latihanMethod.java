/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_09;

import javax.swing.JOptionPane;

/**
 *
 * @author Ainiha
 */
public class latihanMethod {
    void kalkulator(String operasi, double bill, double bil2) {
        double hasil;
        
        switch (operasi) {
            case "penjumlahan":
                hasil = bill + bil2;
                break;
            case "pengurangan":
                hasil = bill - bil2;
                break;
            case "perkalian":
                hasil = bill * bil2;
                break;
            case "pembagian":
                if (bil2 != 0) {
                    hasil = bill / bil2;
                } else {
                    JOptionPane.showMessageDialog(null, "Eror: Pembagian dengan nol tidak dapat dilakukan",
                            "Eror", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
    
            default:
                JOptionPane.showMessageDialog(null, "Operasi tidak dikenali", "Eror", JOptionPane.ERROR_MESSAGE);
                return;
        }
        String txtMessage = "Hasil Operasi " + operasi + " " + bill + " dan " + bil2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, txtMessage, "Hasil Operasi", JOptionPane.PLAIN_MESSAGE);
    }
    public static void main(String[] args) {
        latihanMethod lm = new latihanMethod();
        lm.kalkulator("penjumlahan", 3, 5);
        lm.kalkulator("pengurangan", 10, 4);
        lm.kalkulator("perkalian", 7, 6);
        lm.kalkulator("pembagian", 20, 4);
    }
}
