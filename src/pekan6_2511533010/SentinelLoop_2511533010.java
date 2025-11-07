package pekan6_2511533010;
import java.util.Scanner;

public class SentinelLoop_2511533010 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number = 12; // dummy value, apa saja asal bukan 0

        while (number != 0) {
            System.out.print("Masukkan angka (0 untuk keluar): ");
            number = console.nextInt();
            sum = sum + number;
        }

        System.out.println("Totalnya adalah " + sum);
        console.close();
    }
}
