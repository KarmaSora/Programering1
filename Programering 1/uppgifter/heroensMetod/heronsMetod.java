package heroensMetod;

import java.util.Scanner;

public class heronsMetod {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//räkna ut roten ur ett tal genom gissningar med hjälp av herons metoden
		System.out.println("Beräkna roten ur ett tal genom gissningar ");
		
		System.out.println("Skriv in ett tal");
		
		
		double s = input.nextDouble(); //talet
			System.out.println("gör en gissning");
		double x = input.nextDouble(); //gissning
		
		
		
			
			for(int i = 0; i < 10; i++) {  // skapa en loop
				x = 0.5 *x +0.5* s/x ; // räknesättet 
		
				// skriva ut värdet på roten ur talet
				
				System.out.println("det blir" + x);
				
				//för att styra loopet använd while-satsen eller do-satsen
				
				
		}
		
		// gör alla negativa tal till positiva genom att multiplicera med -1
		if (s<0) {
			System.out.println(s*-1);
		
		}
	
		 
		 

		
			
		
				
		
		
		
	}

}
