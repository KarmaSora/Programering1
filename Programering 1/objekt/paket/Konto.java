package paket;

public class Konto {
	//instansvariabler
	private String namn; 
	private int saldo;
	private int kontonr;
	
	//klassvariabel
	private static int räknare = 1;
	
	//skapa konstruktorn
	public Konto (String name) {
		this.namn = name;
		kontonr = 1000 + räknare;
		räknare++;
		
	}
	
	//Set and Get metoder
	
	public int getSaldo() {
		return saldo;
		
	}
	
	public void setNamn(String namn) {
		this.namn = namn;
	}
	
	public int getNr() {
		
		return kontonr;
	}
	
	
	//insättningn och uttagningsmetoder
	public void ins (int belopp){
		saldo +=belopp;
	}
	
	public boolean uttag(int belopp) {
		boolean ok = false;
			
			if(saldo >= belopp) {
				saldo -= belopp;
				ok = true;
			}
			return ok;
	}
	//statisk metod som retunerar antal skapade konton
	public static int antalKunder() {
		return räknare -1;
	}
	
	
	
}
