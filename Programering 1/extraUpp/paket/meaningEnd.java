package paket;

public class meaningEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Uppgift 1 :  
		//Skriv en metod som tar emot en textsträng och kontrollerar om textsträngen slutar med punkt, 
		//om inte lägger metoden till en punkt. 
		//Här kan du ha användning för Unicode tabellen som du finner på fronter.

		
		
		System.out.print(control ("Behold, Almighty Me.") );
	
	}

	public static String control(String meaning) {
		
		if (meaning.endsWith("."))  {
			System.out.print(meaning + "Thats all for now!!");
		}
		else if (meaning.endsWith("")) {
			System.out.print(control(meaning + "."));
		}
		
		
		return meaning;
		
		
		
		
		
	}
	
	
	
	
	
}
