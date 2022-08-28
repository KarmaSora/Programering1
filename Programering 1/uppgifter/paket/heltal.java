package paket;

import java.util.Scanner;

public class heltal {

	public static void main(String[] args) {
		// ett program som läser två heltal 
		Scanner heltal = new Scanner (System.in);
		
		 
		System.out.println("skriv ett tal");
		int tal1 = heltal.nextInt() ;
		
		
		System.out.println("skriv ett annat tal");
		int tal2 = heltal.nextInt() ; 
		
		if (tal1 > tal2) { 
			System.out.println("det första talet är större än det andra talet") ;
			//kunde ha gjort System.out.println(tal1 + " > " + tal2 );
		}
			else if (tal1 < tal2) {
				System.out.println("det första talet är mindre än det andra talet");
			}
		//kunde ha gjort System.out.println(tal1 + " < " + tal2 );
				else {
					System.out.println("talen är lika värda");
					//kunde ha gjort System.out.println(tal1 + " = " + tal2 );
				}
	

}
}