package paket;

import java.util.Scanner;

public class Uppgifter_två {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ålder");
		double ålder = input.nextDouble(); 
		
		if (ålder >= 17) {
			System.out.println("du är myndig");
		}
			 if (ålder < 17) {
				System.out.println ("Du är inte myndig");
			}
		
			
		
		
	}

}
