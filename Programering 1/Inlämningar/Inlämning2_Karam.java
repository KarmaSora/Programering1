import java.lang.reflect.Array;
import java.util.Scanner;

public class Inlämning2_Karam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Detta är ett program som tar det största värdet och attraherar det minsta värdet inom en array"); // skiver ut en text, för det första för att förklara var programmet gör, för det andra att kontrolera att programmet fungerar

		double[] talfält = {3, 19, 8, 3, 6 };  //skapar en array och ger den namnet talfält och den innehåller några olika tal
		 
		System.out.println(varbredd(5, talfält));  //kallar på varbredds metoden som jag skapade längst ner i webbsidan
	}
	
	public static double varbredd ( int antal, double[] arr  ) {  //skapar en ny metod som kallas för varbredd
		// arr står för array eller i detta fall tal som finns i arrayn

		double Max = arr [0];      //skapa en variable och ge den värdet av index av noll
		double Min = arr [0];  		//skapa en variable och ge den värdet av index av noll
	
		for(int k = 0; k < antal ; k++ ) { // skapar en loop och en variable med värdet 0 (index 0) och kontolerar om det större/mindre än antalet tal som finns i arrayn
		//för att minska koden jag skriver som använde jag "eller" || tecken. på det sättet så behöver jag inte skapa 2 olika lopar, for (int ....
			
			if( arr[k] > Max )  {  // om talet inom den nya index är större än max då får variabeln max det nya värdet och fortsätter vidare 
				Max = arr[k];    //varaibeln får tillslut det hösta värdet i arrayn
				}
			if ( arr [k] < Min ) { // om talet inom den nya index är mindre än Min då får variabeln Min det nya värdet och fortsätter vidare 
					Min = arr[k]; //variablen får tillslut värdet av det minsta talet i arrayn
				}
		}
		
			return Max - Min;   //retunerar ett värde på metoden. i detta fall högsta värde minus minsta värde
		
	}
		
}
