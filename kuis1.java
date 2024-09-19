/**
 * kuis1
 */
import java.util.Scanner;
public class kuis1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input berat beras dalam ton
        System.out.print("Masukkan total beras (ton): ");
        double beratTon = input.nextDouble();
        
        // Konversi ke kilogram dan hitung jumlah kantong 5kg yang dibutuhkan
        int jumlahKantong = (int) Math.ceil(beratTon * 1000 / 5);
        
        // Output jumlah kantong
        System.out.println("Jumlah kantong beras yang dibutuhkan: " + jumlahKantong ) ;
        
        input.close();
    }
}
