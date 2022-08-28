package paket;
//Karam Matar
public class Variabler {

	public static void main(String[] args) {
		// Variabler
		int heltal1 = 1;  //skapa en heltal variabel som heter heltal1 och har värdet 1
		heltal1 = 4;   // tilldela nytt värde på variablen
		
		double decTal = 1.34;   // skapar en decimaltal variable med värdet 1,34
		
		float dectal2 = 1.22f;  //en annan typ av decimaltal 
		
		boolean val = true;   // en boolsk variabel fungerar som en switch 1 eller 0  True eller False
		val = false; 
		
		char tecken = 'k';  //skapa en variabel som är ett tecken, omges av  ''
		
		int deltal2 = (int)decTal;  // skapar variabeln heltal 2 som får heltal värdet av decTal


		//avrundning
		decTal = decTal + 0.5; 
		int avrundat = (int)decTal; 
		
		//med koden nedan tar vi reda på differensen i stora och små bokstävers "nummer"
		int teckenTal = (int)tecken;  //omvandlar char till heltal
		
		char tecken2 = 'g'; 
		
		int teckenTal2 = (int)tecken2;  //omvandlar
		
		
		System.out.print("\n"  +teckenTal +" " +teckenTal2); // utskrift
		
		//textsträngar
		
		String namn = "David"; //skapar en textsträng som heter namn
		
		String förNamn = "david";
				System.out.println(namn.compareTo(förNamn)); 
		
		System.out.println(namn.equalsIgnoreCase(förNamn)); // jämför utan hänsyn till varelser/ gemensam)
		
		
		
		
		

	}

}
