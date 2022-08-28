package paket;

import java.util.Scanner;

public class Upp3Rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double [] array = new double [50];
		
		int antalTal = 0 ; 
		
		//en do while sats för att fylla på värden:
		
		char fortsätt = 'j' ;
				do { 
					System.out.println("Mata in ett tal");
					System.out.println(antalTal);

					array[antalTal] = input.nextDouble();	//lagrar värden i array:en
					antalTal++;								//ökar på räknare/index
					System.out.println("Vill du mata in fler tal? j/n");
					fortsätt = input.next().charAt(0);	  //uppdaterar tecknet i fortsätt
				}while(fortsätt == 'j');
				for(int i = 0; i < 50 ; i++) {
					
					System.out.println(i);
					
					
					
					
				}
		

	}

}
