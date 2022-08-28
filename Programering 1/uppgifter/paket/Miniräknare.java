package paket;

import java.util.Scanner;

public class Miniräknare {

	public static void main(String[] args) {
		// Detta ska vara en miniräknare
		
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Välj: \n1 Addition \n2 Substraktion \n3 Multiplikation"
					+ "\n4 Divition \n5 Avsluta..."); //skriver ut vilka val man har.
			
			
			int val = input.nextInt(); //kontrolerar värden man skrev
			
			
			System.out.println("Skriv det första talet");
			int tal1 = input.nextInt(); //diffinerrar tal 1 som variabel

				System.out.println("skriv det andra talet");
			int tal2 = input.nextInt();
				
			
			switch(val) { 
			
			
			case 1: 
				System.out.println("Du valde Addition");
				
				int summa = tal1 + tal2; // adderar tal 1 och tal 2 
			System.out.println(summa); //skriver ut summan av de två talen
			
				
			break; // med break kan man avsluta coden/case
				
			case 2: 
				System.out.println("Du valde Substraktion");
				
				int differansen = tal1 - tal2; //räknar ut differansen mellan talen 1 och 2
				System.out.println(differansen);
				
				break; 
				
			case 3:
				System.out.println("Du valde Multiplikation");
				int multi = tal1 * tal2; // multiplicerar talen med varandra
				System.out.println("produkten blir " + multi);
				
				break;
				
			case 4: 
				if (tal2 == 0) {
					 System.out.println("kan ej div med 0");
				 }
				else {
				System.out.println("Du valde Divition");
				int div = tal1 / tal2; 
				
				 
				System.out.println(div);
				}
				
				break;
			case 5:
				System.out.println("Du har avslutat räknaren");
				
				break;
				default: 
				System.out.println("gick inte...välj något av altinativen");
			
			
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
