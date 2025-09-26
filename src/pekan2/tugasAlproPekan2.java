package pekan2;

import java.text.DecimalFormat;

public class tugasAlproPekan2 {
	    public static void main(String[] args) {
	        // Empat tipe data sesuai ketentuan
	        int totalSupply = 610_450_000;   // jumlah koin beredar
	        float hargaSekarang = 196.22f;   // harga USD
	        char kodeKoin = 'S';             // hanya 1 karakter
	        boolean sedangNaik = true;       // status tren harga

	        // Format angka dengan pemisah ribuan
	        DecimalFormat df = new DecimalFormat("#,###");

	        System.out.println("=== Informasi Koin Crypto ===");
	        System.out.println("Kode Koin       : " + kodeKoin);
	        System.out.println("Total Supply    : " + df.format(totalSupply) + " SOL");
	        System.out.println("Harga Sekarang  : $" + hargaSekarang);
	        System.out.println("Sedang Naik     : " + (sedangNaik ? "Ya" : "Tidak"));
	    }
	}