package paket;

import java.util.ArrayList;

public class Bank {

	public static void main(String[] args) {
		// 
		
		Konto kund1 = new Konto("Karam");
		kund1.ins(30000);
		System.out.println(Konto.antalKunder());
		if(kund1.uttag(35000)) {
			
			System.out.println("utttag skickades");
			
		}
		else { System.out.println("Insufficent funds");
		
	}
		
		//lagrar objekt i samlingar
		
		ArrayList<Konto> kontoSamling = new ArrayList<>();
		
		//skapar ett nytt objekt och lagrar till i min arraylist
		kontoSamling.add(new Konto("Karl"));
		
		//hämtar ett objekt ur arraylist
		int index = 0;
		for(int i = 0 ; i > kontoSamling.size(); i++) {
			if(kontoSamling.get(i).getNr() == 1001) {
				index = i; 
				break;
			}
		}
		kontoSamling.get(index).ins(100000);
		
		System.out.println(kontoSamling.get(index).getSaldo());

	}
	
	
	
	
}