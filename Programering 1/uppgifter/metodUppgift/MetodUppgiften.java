package metodUppgift;

import java.util.Scanner;

public class MetodUppgiften {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		/*
		 //Uppgift 1 
		System.out.println("skriv ett tal");
		
		int tal = input.nextInt();
		posNegNum(tal) ;
		
		 */
		
		/*
		//uppgift 2
		String förNamn = "Karam";
		String efterNamn = "Matar";
		String mobilNum = "070-666-3629";
		

		System.out.println (person(förNamn + " ", efterNamn +" ", mobilNum));
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

	public static int posNegNum( int tal) {
		
			if(tal<0) {
			System.out.println("(-)" + tal +", talet är negativt (-)");
			return '-';
		} 
		
		if(tal>0) {
			System.out.println("(+)" + tal + ", talet är positivt(+)");
			return '+';
		}
		
		else {System.out.println("talet är 0, den är varekn positiv eller negativ");
		
		}
		return tal;
		
	}
	
	
	public static String person (String ett, String två, String tre ) {
		
				return ett + två + tre;
		
	}
	
	
	public static int expPot (int exp) {
		
		Scanner input = new Scanner(System.in); //inför en scanner
 
		int basTal = input.nextInt();
		int expTal = input.nextInt();
		System.out.println( basTal * expTal);
		
		return exp;
		
	}
	
	
}
