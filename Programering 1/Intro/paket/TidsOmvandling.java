package paket;

public class TidsOmvandling {

	public static void main(String[] args) {
		// Omvandlar tid i ms till tid i timmar minuter och sekunder
		
		int ms = 234872346; 
		int sek = ms/1000 ;
		int min = sek/60;
		int sekFinal = sek%60;  //plockar ut resten antalet sekunder som kommer vara mindre än < 60
		

		int timmar = min/60; // plockar ut hela antal timmar
		
		int minFinal = min%60;   // plockar ut hela antal minuter < 60
		
		int dygn = timmar/24 ;  //plockar ut hela antal dygn
		int timmarFinal = timmar%24; // plockar ut timmar < 24		
		
		System.out.println(ms +" ms är: " +dygn +"dygn" +timmarFinal +" h " 
				+ minFinal +" min " + sekFinal + " s ");
	}

}
