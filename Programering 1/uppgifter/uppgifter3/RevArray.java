package uppgifter3;

public class RevArray {

	public static void main(String[] args) {
		// skapa en array som visar tal minsta till störta och sedan omvänt
		
		System.out.println("Hello World");
		
		/*
		//skriver alla tal i arrayn i storleksordning
		int [] array = {1, 3, 7, 9, 11 }; 
		
		for(int i = 0; i< array.length ; i++ ) {
			
			System.out.println (array[i] + " " ) ;
				
		}
		
		*/
		
		
		int [] array = {1, 3, 7, 9, 11 }; 
		
		for(int i = 4; i>=0 ; i-- ) {
			
			System.out.println (array[i] + " " ) ;
		}
		
	}

}
