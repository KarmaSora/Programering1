package paket;

import java.util.Scanner;

public class If_satser {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		//inloggning
		System.out.println("Ange Lösenord: ");
		String lösen = input.nextLine(); //inmatning via consol lagras som "lösen"
		String korrektLösen = "1234567";
		if(korrektLösen.equals(lösen)) {
			
		//kodblock som körsom villkoret ovan är uppfyllt
		System.out.println("Välkommen");
		
		}
		
		else {
			//kodblock som körs om villkoret ej är uppfyllt
			System.out.println("Fel Lösenord");
		}
		
	}

}
