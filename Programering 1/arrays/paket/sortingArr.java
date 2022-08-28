package paket;

public class sortingArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 4, 7, 1, 3, 9, -3, 2};
		int[]sortArray = sort(array);
		
		for (int i = 0; i<sortArray.length; i++) {
			System.out.print(sortArray[i] + "  ");
		}
		
		System.out.println("\n \n test");
		System.out.print(sökning(2, array));
		
		
		
	}

	
	 static int[] sort (int [] array) {
	int size = array.length;
	//repititionsssats som styr avgränsning av array // minska en forsats
	for(int i = size -1; i>0; i--) {
		//rep sats som tilllåter stora värden dubbla upp
		for(int k = 0; k<i; k++) {
			if(array[k] > array[k+1]) {
				int temp = array [k+1];
				array[k+1] = array[k];
				array[k] = temp;
			}
		}
	}
	return array ;
}
	 static int sökning (int talet, int [] array) {
		 int index = -1;   
		 int min = 0;
		 int max = array.length -1;
		 int mid;
		 while (index == -1 && min <=max) {
			 mid = (min + max)/2;
			 if(talet < array[mid]) {
				 max = mid-1;
			 }
			 else if (talet > array[mid]) {
				 min = mid +1;
			 }
			 else { index = mid;
			 }
		 }
		 return index;
}
	 }