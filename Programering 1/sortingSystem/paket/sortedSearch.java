package paket;

import java.util.Scanner;

public class sortedSearch {

	public static void main(String[] args) {
		// sorterade sökningar
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("Go till array sourcefolder och hitta där");
		
		
		int [] array = { 44,63,72,93,28,16,74,21};
		
		System.out.println("     random text  " );
		
		for (int i= array.length; i>0; i--) {
		for(int k =1; k < array.length; k++) {
			
		
			if (array[k] < array[k-1]) {
				int n = array[k];
				array[k]= array[k-1];
				array[k-1]= n;
		}
		}
		}
		for (int i = 0; i<array.length; i++) {
		System.out.print(array[i]+"  ");}
		
		System.out.println("\n test \n test");
		System.out.println(	sortSearch(4, array));
	}
	
	
	
	
	public static int sortSearch(int num, int []array){
	int index = -1;
	int min = 0 ;
	int max = array.length-1;
	int mid;
	
	 while (index == -1 && min <=max) {
		 mid = (min + max)/2;
		 if(num < array[mid]) {
			 max = mid;
		 }
		 else if (num > array[mid]) {
			 min = mid;
		 }
		 else { index = mid; }
	 }
	
	return index;
	
	}
	
	
	
}
