package paket;

import java.util.Scanner;

public class Repetitionssatser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Repetitionssater
		//While-sats
		int räknare = 0;
		int max = 10;
		while(räknare < max) {  // används mycket när man arbetar med mattematisk programering
			räknare++;			//while satsen styrs av ett villkor
			System.out.println(räknare);	//kodblocket körs om och om igen så länge vilkoret är uppfyllt
			
		}

		//do while sats styrs med en boolsk variabel
		boolean fortsätt = true;
		
		do {
				System.out.println("meny:  \n1:... \n2: .... \n3: avsluta");
						int val = input.nextInt();
						switch(val) {
						case 1: 
							break;
						case 2:
							break;
						case 3: 
							fortsätt = false;
							break;
							default:
								System.out.println("felaktig val");
						}
		}while (fortsätt) ;  // villkoret kommer efter loopen körts en gång, glöm ej ;
		
		
		//for satsen, har tre villkot: start, slut och steg
		
		for(int i = 0; i < 10; i++) {
			System.out.println( 9*i); //nians tabell
		}
		//nästlade for satser
		
		for(int i = 0 ; i < 10; i++) {
			for(int j = 0; j<i; j++) { //sin inre for-sats körs beroende på den ytters
			System.out.print(i*j + " ");//räknare
		}
		System.out.println();
		
		}
	}
}
