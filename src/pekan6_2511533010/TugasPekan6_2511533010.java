package pekan6_2511533010;
import java.util.Scanner;
import java.util.Random;

public class TugasPekan6_2511533010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukkan tebakan jumlah dadu (2 - 12): ");
        int tebakan = input.nextInt();

        int percobaan = 0;
        boolean menang = false;
        String jawab;

        do {
            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;
            int jumlah = dadu1 + dadu2;
            percobaan++;

            System.out.println(dadu1 + " + " + dadu2 + " = " + jumlah);

            if (jumlah == tebakan) {
                System.out.println("Tebakan Anda Benar!");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                menang = true;
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu lagi? (ya/tidak): ");
                jawab = input.next();
                if (jawab.equalsIgnoreCase("tidak")) {
                    break;
                }
            }
        } while (true);

        if (!menang) {
            System.out.println("Anda gagal menang");
        }

        input.close();
    }
}
