package paket;

public class Räkneoperatorer {

	public static void main(String[] args) {
		// De fyra räknesätten
		int heltal1 = 4; 
		int heltal2 = 5; 
		int summa = heltal1 + heltal2;
		System.out.println(summa);
		int differens = heltal1 = heltal2;
		System.out.println(differens);
		int produkt = heltal1 * heltal2;
		
		double medelv = ( heltal1 + heltal2)/2.0;
		
		
		System.out.println(medelv);
		
		//Ökar stegvis
		heltal1++;
		System.out.println(heltal1);
		summa--;   //minskar stegvis
		

		//Modulo
		int rest = 3458%21;
		System.out.println(rest);
		
		
		
		
		
	}

}
