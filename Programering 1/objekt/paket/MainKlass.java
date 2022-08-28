package paket;

import javax.swing.JFrame;

public class MainKlass {

	public static void main(String[] args) {
		// skapar objekt
		//Klassnamn objektsnamn = new Konstruktorn (in-data) ;

		InstanserbarKlass boll1 = new InstanserbarKlass("gul");
		
		boll1.studs(2);
		System.out.println(boll1.hastighet);
		
		InstanserbarKlass boll2 = new InstanserbarKlass ("blue");
		
		//Skapar ett objekt av en färdig klass
		JFrame window = new JFrame("Fönster");
		
		window.setVisible(true);
		
	}

}
