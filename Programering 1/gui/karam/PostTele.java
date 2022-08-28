package karam;

public class PostTele {

	//motsvarar instanserbarklass till gui telebok
	public String Namn; // dekleration av variabler
	public String Telenum;
	public String Contact = Namn + Telenum; 	//ifall jag ska använda den så har jag den.
	
	public  PostTele(String Namn, String Telenum) {
		this.Namn =  Namn;
		this.Telenum = Telenum;
	}
	
	
	// lägg till metoder som har funktioner för knapparna   använd getters and setters
	
	public String getNamn() {  	//en metod som söker efter Namn i arrayn av listan

		return Namn;
		
	}
	
	//något för att skriva över namn
	public void setNamn(String newNamn) {
	
		this.Namn = newNamn;  // med this.  gör jag att den nuvarande ... blir till/byter namn till ...
	}
	
	
	
	//samma sak som innan men för nummer istället för namn
	public void setTeleNum(String newTelenum) {
	
	this.Telenum = newTelenum;
		
	}
	
	public String getTelenum() {
		
		return Telenum;
	}
	
	
}

