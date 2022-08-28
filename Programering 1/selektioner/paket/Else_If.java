package paket;

import java.util.Scanner;

public class Else_If {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Ange hoppets längd");
		// Det är en bättre längdhop registrering
		double längd = input.nextDouble();
		if(längd < 0) {
			System.out.println("Felakting inmatning");
		}
		else if(längd < 7) { 
			System.out.println("Hoppet är godkänt");
		}
		else if (längd >= 7) { 
			System.out.println("Nytt Rekord: ");
		}
		
	}

}
