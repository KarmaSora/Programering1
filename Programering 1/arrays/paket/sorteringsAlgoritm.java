package paket;
import paket.sortingArr;

public class sorteringsAlgoritm {

	public static void main(String[] args) {
		

		int[] array = { 31, 60, 25, 33, 9, 6};
		System.out.print(" Hello World  \t");

		
		for(int i = array.length -1 ; i>0; i--) {  // kan ta bort -1
		for (int k = 1; k < array.length; k++) { // en loop som ser till att det största värdet sitter längst till höger
			
			if (array[k] < array[k - 1]) {
				int t = array[k];
				 array[k] = array[k - 1] ;
				array[k - 1] = t;
			}
			
	}	
		}
	
			for (int k = 0 ; k < array.length; k++) {
				System.out.print(array[k] +" "); // loopar igenom arrayen och skriver ut den
			}
	System.out.println("\n  this is the new sorted version oga boga boga the code .... \n \n");
	
		
	}

	
}
