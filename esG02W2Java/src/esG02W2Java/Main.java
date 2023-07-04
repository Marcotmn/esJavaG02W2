package esG02W2Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Inserisci il numero di elementi: ");
	        int n = scanner.nextInt();

	        Set<String> words = new HashSet<>();
	        Set<String> duplicates = new HashSet<>();

	        System.out.println("Inserisci le parole:");
	        for (int i = 0; i < n; i++) {
	            String word = scanner.next();
	            if (!words.add(word)) {
	                duplicates.add(word);
	            }
	        }

	        System.out.println("Parole duplicate:");
	        for (String duplicate : duplicates) {
	            System.out.println(duplicate);
	        }

	        System.out.println("Numero di parole distinte: " + words.size());

	        System.out.println("Elenco delle parole distinte:");
	        for (String word : words) {
	            System.out.println(word);
	        }
	    }
}
