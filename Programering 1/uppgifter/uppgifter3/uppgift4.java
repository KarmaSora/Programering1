package uppgifter3;

import java.util.Scanner;

public class uppgift4 {

	public static void main(String[] args) {

		
		//a) Programmet skall skriva ut samtliga inlästa tal.

		/*
			
	Scanner input = new Scanner(System.in);
		
		double [] array = new double [50];
		
		int antalTal = 0 ; 
		
		//en do while sats för att fylla på värden:
		
		char fortsätt = 'j' ;
				do { 
					System.out.println("Mata in ett tal");

					array[antalTal] = input.nextDouble();	//lagrar värden i array:en
					antalTal++;								//ökar på räknare/index
					System.out.println("Vill du mata in fler tal? j/n");
					System.out.println(antalTal);
					fortsätt = input.next().charAt(0);	  //uppdaterar tecknet i fortsätt
				}while(fortsätt == 'j');
		
			for(int i = 0; i < antalTal; i++) {
				
				System.out.println(array[i]);
			}
				
			*/
			
		//	b) Programmet skall skriva ut samtliga inlästa tal i omvänd ordning.

			/*
	Scanner input = new Scanner(System.in);
		
		double [] array = new double [50];
		
		int antalTal = 0 ; 
		
		//en do while sats för att fylla på värden:
		
		char fortsätt = 'j' ;
				do { 
					System.out.println("Mata in ett tal");

					array[antalTal] = input.nextDouble();	//lagrar värden i array:en
					antalTal++;								//ökar på räknare/index
					System.out.println("Vill du mata in fler tal? j/n");
					System.out.println(antalTal);
					fortsätt = input.next().charAt(0);	  //uppdaterar tecknet i fortsätt
				}while(fortsätt == 'j');
		
				for(int i= antalTal-1; i>=0; i--)  {
				
				System.out.println(array[i]);
			}
					
			*/

		
		//			____________________________________________________________
		
		
		// c) Programmet skall skriva ut de tal som är positiva i arrayen.
		
		

		Scanner input = new Scanner(System.in);
		
		double [] array = new double [50];
		
		int antalTal = 0 ; 
		
		//en do while sats för att fylla på värden:
		
		char fortsätt = 'j' ;
				do { 
					System.out.println("Mata in ett tal");

					array[antalTal] = input.nextDouble();	//lagrar värden i array:en
					antalTal++;								//ökar på räknare/index
					System.out.println("Vill du mata in fler tal? j/n");
					System.out.println(antalTal);
					fortsätt = input.next().charAt(0);	  //uppdaterar tecknet i fortsätt
				}while(fortsätt == 'j');
		
			for(int i = 0; i < antalTal; i++) {
				
				System.out.println(array[i]);
			}
		/*	
		for(int k = 0; k < i;) {
			
			System.out.println(array [k]);
		}
		*/
		
			
			
			
			
			
	}

}
