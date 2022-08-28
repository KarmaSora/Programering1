package paket;

import java.util.Scanner;

public class If_logik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// och : &&, eller : ||, icke : !, lika : ==, icke lika : != 
		System.out.println("Ange hoppets längd: ");
		double längd = input.nextDouble();
		
		
		if(längd > 0 && längd < 7) {
			System.out.println("Hoppet är godkänt");
		}
			else { //annars
				System.out.println("hoppet är ej godkänt, mät igen");
			}
		//omvänt  villkor
	
		if (längd >= 0 || längd <=7) {
			System.out.println("Hoppet är godkänt");
		}
		else {
			System.out.println("hoppet är godkänt");	
		}
	}
}
	






