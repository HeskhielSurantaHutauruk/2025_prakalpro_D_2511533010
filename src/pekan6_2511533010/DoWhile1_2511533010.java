package pekan6_2511533010;
import java.util.Scanner;

public class DoWhile1_2511533010 {
	    public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        String phrase;

	        do {
	            System.out.print("Input Password: ");
	            phrase = console.next();
	        } while (!phrase.equals("abcd"));

	        System.out.println("Password benar! Akses diterima.");
	        console.close();
	    }
	}
