package paket;

public class Strängar {

	public static void main(String[]  args) {
		// Slakta en sträng
		String mening = "det här är en mening";
int förstaBlanksteg = mening.indexOf(' '); //indexOf retunerar index för valt tecken
System.out.println(förstaBlanksteg); //kontrollutskrift
String förstaOrd = mening.substring(0, förstaBlanksteg); //substring plockar ut del av string
System.out.println(förstaOrd +".");
int andraBlanksteg = mening.indexOf(" ", förstaBlanksteg+1); 
System.out.println(andraBlanksteg); 
String andraOrd=mening.substring(förstaBlanksteg+1, andraBlanksteg);
System.out.println(andraOrd+"."); 
System.out.println(mening.indexOf(" ",  14));

//omvandling till string
int tal = 4598; 
String talltext = Integer.toString(tal);  //omvandla heltal till text
System.out.println(talltext);
double decTal = 1.414;
String rotenUrTvå = Double.toString(decTal);

String heltal = "5678";
int frånText = Integer.valueOf(heltal); //omvandlar tal i text till tal
System.out.println(frånText); 

	}

}
