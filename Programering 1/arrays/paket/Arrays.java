package paket;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays eller tillfält är flera värden under ett namn
		
		
		int[] talfält = {1, 34, 22, 55, 99} ; 
		
		
		System.out.println(talfält); // går ej att skriva ut så här
		
		System.out.println(talfält[0]); //går att skriva ut värdena med index [ ... ]
		
		
		//skriver ut värden med en for sats
		for(int i = 0; i<talfält.length; i++) {
			System.out.println(talfält[i]);
		}
		
		double[] decFält = new double[5];
		
		// fylla en array
		
		for(int i = 0; i < decFält.length; i++) {
			decFält[i] = i * 0.707; //fyller positionerna med multipilar av 1/rotenUrTvå
		
		}
		
		String [] textFält = new String [3];
		textFält[1] = "Hej";
		//även objekt går att spara i fält. 
		Scanner[] scannerFält = new Scanner[3]; 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
