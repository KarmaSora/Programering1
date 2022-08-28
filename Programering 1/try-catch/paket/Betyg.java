package paket;

public class Betyg {

	public static void main(String[] args) {
		// tar emot en syffermängd( mängd syffror och rättar
		//betyg i en array  mellan  0-5
		int[] betyg = { 1, 2, 4, 5, 0, 3, 2, 4, 1, 2, 4, 5, 2, 3, 5, 3, 4, 1, 9};
		
		//frekvens array där var position talar om hur många betyg där var av "index" -betyg
		int[] frekvens = new int[6];
		
		
		
		
		try { 
		//bläddra igenom arrayen med en for sats
		
		for(int i = 0; i < betyg.length; i++){
	
			//frekvens arrayens värde på index "betyg" ökar med ett
			frekvens[betyg[i]]++;
			
		}
		}catch(ArrayIndexOutOfBoundsException e) { // man kan även lägga till  | NumberFormatException e         
			System.out.println(e);
			e.printStackTrace();
		}
		
		for(int k = 0; k < frekvens.length; k++) {
			System.out.println("betyg " + k +" förekommer " + frekvens[k] + " gånger. " );
		
		}
		
		
		
		
		
	}

}
