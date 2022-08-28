package paket;

import java.util.Scanner;

public class rektangel {

	public static void main(String[] args) {
		// Räkna rektangels area, längd och bredd


		 Scanner input = new Scanner(System.in); 
		
		System.out.println("skriv ett  tal");
		
		int längd = input.nextInt() ; 
		System.out.println("skriv ett annat tal");
		int bredd = input.nextInt() ; ;
		
		
		int area = längd*bredd;
		
		System.out.println(" Rektangelns area är" + area);
		
	}

}
