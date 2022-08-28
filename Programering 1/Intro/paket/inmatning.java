package paket;

import java.util.Scanner;

public class inmatning {

	public static void main(String[] args) {
		// inmatning
		Scanner input = new Scanner(System.in); // skapar ett objekt av scannerklassen
		                                       //som jag döper till "input" 
		System.out.println("skriv ett heltal");  
		int tal = input.nextInt();        // inmatning ger tal des värde 
		System.out.println("Du skrev talet " +tal);
		
		
		
		
	}

}
