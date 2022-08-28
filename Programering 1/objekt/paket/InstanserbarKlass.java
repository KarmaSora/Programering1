package paket;

public class InstanserbarKlass {

	//konstruktor
	
	double radie = 3.0 ;
	double hastighet;
	double massa = 0.3;
	String färg;
	
	public InstanserbarKlass(String färg) {
		this.färg = färg;
		
	}
	//Metoder
	
	public void studs(double impuls ) {
		hastighet = (massa * hastighet - impuls) / massa;
	}
	
	
	
	
	
	
	
	
}
