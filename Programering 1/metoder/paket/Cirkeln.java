package paket;

public class Cirkeln {
	//klassvariabel
	public static final double pi = 3.1415926;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		info();           //metodkall för en voidmetod	
		System.out.println(antalHörn());		//Metodkall som skriver ut returvärde

		double omkr = omkrets(4);
		System.out.println(omkr);
		
		System.out.println(vadÄrJag()); 
		
		
		
		
	}
	//static går att köra utan objekt, "returtyp", "metodnamn" (indata)
	static void info() {
		System.out.println("Cirkeln har endast ett mått, radien");
			
	}
	
	static int antalHörn() {
		return 0;
		
	}
	static double omkrets(double radie) {
		
		double omkr = 2*pi*radie;
		return omkr;
		
	}
	
	
	static String vadÄrJag() {
		
		return "jag är en cirkel";
	}
	
	
	
	
	
	
}
