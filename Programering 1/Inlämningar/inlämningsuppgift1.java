import java.util.Scanner;

public class inlämningsuppgift1 {

	public static void main(String[] args) {
		// inlämningsuppgift 1
		
		Scanner input = new Scanner(System.in); //inför en scanner
		
		char fortsätt = 'j';   // skapar en bokstav och ger den värdet fortsätt
		
		do {      //do while är ett sätt att skapa en loop så att koden ska kunna spelas om och om igen.
		
		System.out.println("Hur mycket sattar du?"); //System.out.println används för att skriva saker användaren ska kunna se 

			int satsning = input.nextInt();//skapar en variable som heter satsning variable Satsning får sitt värde av användaren
		
		System.out.println(">" + satsning); //skriver ut ">" tecknet + värdet på satsningen
		
			int tärning1 = (int)(Math.random( ) * 6+1); //skapar en variable som kallas tärning1 och ges ett värde mellan 6 och 1

		System.out.println("tärning1: " + tärning1); //skriver ut tärning1 samt värdet på variablen
		
			int tärning2 = (int)(Math.random( ) * 6+1); //skapar en variable som kallas tärning2 och ges ett värde mellan 6 och 1
		
		System.out.println("tärning2: " + tärning2); //skriver ut tärning2 samt värdet på den variablen
		
		
		if(tärning1 == 1 && tärning2 == 6 || tärning2 == 1 && tärning1 ==6 ) { // en av tärningarna har värdet 6 och den andra värdet 1 
			System.out.println("DoubleVinst"); // då skrivs "Double vinst"
			System.out.println(satsning * 3); // och man får 3 ggr satsningen
		}
		
		else if (tärning1 + tärning2 == 7) { // om summan på båda tärningarna är lika med 7 då..
			System.out.println("Vinst:"); //då skrivs det ordet "Vinst" och man får dubblet så mycket tillbaka som man satsade på.
			System.out.println(satsning * 2);
		}
		
		else if (tärning1 == tärning2) { // om tärning1 och tärning2 har samma värde då...
			System.out.println("Par:"); //  skrivs det ordet Par
			System.out.println(satsning); // man får tillbaka summan man satsade..
		}
		
		else { System.out.println("Förlust"); // om man inte får något av de angevna vinstregler då skrivs det ut "Förlust"
		}
		
		
		System.out.println(" "); //skapa mellanrum i texten, detta är för att man ska kunna ha lättare att läsa
		System.out.println("för att avsluta spelet tryck n"); // egentligen kan man trycka vad som helst för att avsluta koden förutom bokstaven j,
														//men jag ville andå berätta ett sätt att avsluta koden, och bokstaven n passar bra i detta fall
		System.out.println("tryck J för att spela igen ..."); //skriver ut valen man har, avsluta eller forsätta spela
		
		fortsätt = input.next().charAt(0);	   // uppdaterar tecknet i fortsätt
		System.out.println(" ");               //skapar text mellanrum mellan spelen

			//använd do while satsen för att fortsätta/skapa loop....
		
		}while(fortsätt == 'j');            // loppen kommer fortsätta så länge man trycker j är true/man använder j
											// om man trycker på något annat då avslutas koden


		

		
		
		
	}

}
