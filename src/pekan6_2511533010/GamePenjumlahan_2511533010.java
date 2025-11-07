package pekan6_2511533010;
import java.util.Scanner;
import java.util.Random;
public class GamePenjumlahan_2511533010 {
	    public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        Random rand = new Random();

	        // play until user gets 3 wrong
	        int points = 0;
	        int wrong = 0;

	        while (wrong < 3) {
	            int result = play(console, rand);   // play one game
	            if (result > 0) {
	                points++;
	            } else {
	                wrong++;
	            }
	        }

	        System.out.println("You earned " + points + " total points.");
	        console.close();
	    }

	    // membuat soal penjumlahan dan ditampilkan ke user
	    public static int play(Scanner console, Random rand) {
	        // tentukan berapa banyak bilangan yang akan dijumlahkan
	        int operands = rand.nextInt(4) + 2; // 2–5 angka
	        int sum = 0;

	        // tampilkan deretan bilangan acak dan hitung totalnya
	        for (int i = 1; i <= operands; i++) {
	            int n = rand.nextInt(10) + 1; // angka 1–10
	            sum += n;
	            if (i == 1) {
	                System.out.print(n);
	            } else {
	                System.out.print(" + " + n);
	            }
	        }

	        System.out.print(" = ");

	        // baca jawaban user
	        int guess = console.nextInt();

	        // cek apakah benar
	        if (guess == sum) {
	            System.out.println("Benar!\n");
	            return 1;
	        } else {
	            System.out.println("Salah! Jawaban yang benar adalah " + sum + "\n");
	            return 0;
	        }
	    }
	}

