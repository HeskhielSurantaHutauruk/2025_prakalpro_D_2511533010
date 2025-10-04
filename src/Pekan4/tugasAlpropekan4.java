package Pekan4;
import java.util.Scanner;

public class tugasAlpropekan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.print("Nama Pembeli : ");
        String nama = sc.nextLine();

        System.out.print("Jumlah Tiket : ");
        int jumlah = sc.nextInt();

        System.out.println("Pilih Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        int hari = sc.nextInt();

        System.out.println("Pilih Waktu (1=Pagi, 2=Siang, 3=Malam): ");
        int waktu = sc.nextInt();

        System.out.println("Pilih Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        int studio = sc.nextInt();

        int hargaDasar;
        if (studio == 1) {
            hargaDasar = 50000;
        } else if (studio == 2) {
            hargaDasar = 70000;
        } else {
            hargaDasar = 100000;
        }

        double tambahanHari = 0;
        if (hari == 2) {
            tambahanHari = 0.10;
        } else if (hari == 3) {
            tambahanHari = 0.30;
        }

        double tambahanWaktu = 0;
        if (waktu == 2) {
            tambahanWaktu = 0.10;
        } else if (waktu == 3) {
            tambahanWaktu = 0.20;
        }

        double hargaPerTiket = hargaDasar + (hargaDasar * tambahanHari) + (hargaDasar * tambahanWaktu);
        double subtotal = hargaPerTiket * jumlah;

        double diskon = 0;
        if (jumlah >= 5) {
            diskon = subtotal * 0.20;
        }

        double totalBayar = subtotal - diskon;

        System.out.println("------------------------------------");
        System.out.println("Nama Pembeli    : " + nama);
        System.out.println("Jumlah Tiket    : " + jumlah);

        String namaHari = (hari == 1) ? "Senin-Kamis" : (hari == 2 ? "Jumat" : "Sabtu-Minggu");
        String namaWaktu = (waktu == 1) ? "Pagi" : (waktu == 2 ? "Siang" : "Malam");
        String namaStudio = (studio == 1) ? "Regular" : (studio == 2 ? "Deluxe" : "Premium");

        System.out.println("Hari            : " + namaHari);
        System.out.println("Waktu Tayang    : " + namaWaktu);
        System.out.println("Jenis Studio    : " + namaStudio);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar     : Rp " + hargaDasar + "/tiket");
        System.out.println("Biaya Hari      : +" + (int)(tambahanHari*100) + "%");
        System.out.println("Biaya Waktu     : +" + (int)(tambahanWaktu*100) + "%");
        System.out.println("Harga per Tiket : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal        : Rp " + (int)subtotal);
        System.out.println("Diskon (20%)    : Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + (int)totalBayar);

        sc.close();
    }
}
