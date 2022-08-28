package metodUppgift;

import java.util.Scanner;

public class extraUpp {

	public static void main(String[] args) {
		// Extra uppgifter, en metod som ser till att det finns en punkt i slutet av koden
		
		String a = "This is a sentence without a dot.";
		pointMaker(a) ;

	}
	
	
	public static String pointMaker (String dot) {
		
		
		if( dot.endsWith(" ") )   //ends with metoden ser om metoden slutar med tecknet / ordet du väljer. eller inte
								// med if satsen gör jag att om den inte slutar med det då skall den läggas till
		 {
			
			System.out.println(dot + ".");   
		}


		else if (dot.endsWith(".")){
			
			System.out.print(dot);
			}
			
		return dot;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
