package paket;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// ett sätt att göra selektion av heltal. 
		//Meny med SwitchCase
		java.util.Scanner input = new Scanner(System.in) ;
		System.out.println ("Välj: \n1 alternativ 1 \n2 alternativ 2"
				+ "\n3: alternativ 3 \n4: avsluta ");

		int val = input.nextInt();
		
		switch(val) {
		case 1:
			System.out.println("Du valde 1");
			break; 
		case 2: 
			System.out.println("Du valde 2");
			break;
		case 3:
			System.out.println("Du valde 3");
			break;
		case 4: 
			System.out.println("Avsluta ...");
			break;
			default:
				System.out.println("Felaktikgt val, försök igen");
		
		}
		
	}

}
