package uppgifter3;

import java.util.Scanner;

public class TredjeUppgiften {

	public static void main(String[] args) {
		// mäta decimaltal
		
		Scanner input = new Scanner (System.in);

		
		
		double [] array = new double [50] ;
		int i = 0 ;
		char fortsätt = 'j'; 
		while (fortsätt == 'j') {
			System.out.println ("skriv ett decimaltal");
			
			array [i] = input.nextDouble();
			i++;
			
			System.out.println (i); 
			System.out.println ("meny /n ja /n  nej "); 
			 
			 fortsätt = input.next().charAt(0) ; 
		}
			 
		
		
		
		
		
			 
	}

}
