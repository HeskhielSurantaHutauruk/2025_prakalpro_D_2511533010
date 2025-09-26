package pekan3;

import java.util.Scanner;

public class hitungvolume {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Deklarasi variabel
	        double jariJari, tinggi, volume;
	        double phi = 3.14;

	        // Input dari user
	        System.out.print("Masukkan jari-jari kerucut: ");
	        jariJari = input.nextDouble();
	        System.out.print("Masukkan tinggi kerucut: ");
	        tinggi = input.nextDouble();

	        // Proses perhitungan
	        volume = (1.0/3.0) * phi * jariJari * jariJari * tinggi;

	        // Output hasil
	        System.out.println("Volume kerucut = " + volume);

	        input.close();
	    }
	}
