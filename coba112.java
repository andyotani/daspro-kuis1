import java.util.Scanner;
public class coba112 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int jumlahBeras;
int jatahPerOrang;
int jumlahKarung;
System.out.print("Masukkan Jumlah Beras (ton): ");
jumlahBeras = sc.nextInt();
jatahPerOrang = 5;
jumlahBeras *= 1000;
jumlahKarung = jumlahBeras / jatahPerOrang;

System.out.println("Jumlah karung yang dibutuhkan adalah: " +

jumlahKarung + " karung.");
}
}