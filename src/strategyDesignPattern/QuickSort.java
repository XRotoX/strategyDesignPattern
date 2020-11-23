package strategyDesignPattern;

public class QuickSort implements Sorter{
	

	@Override
	public void sort(int[] array) {
		
		System.out.println("Welcome to quick sort, this is your sorted array:");
		
		int size = array.length;
		
		int low = 0;
		int high = size-1;
		
		sorter(array, low, high);
		for (int i = 0 ;i< size; i++){
	         System.out.print(" "+array[i]);
	      }
		
	}
	

	 int partition(int array[], int low, int high) { 
	     int pivot = array[high];  
	     int i = (low-1);
	     for (int j=low; j<high; j++) { 
	         if (array[j] < pivot) { 
	             i++; 
	             int temp = array[i]; 
	             array[i] = array[j]; 
	             array[j] = temp; 
	         } 
	     } 
	
	     int temp = array[i+1]; 
	     array[i+1] = array[high]; 
	     array[high] = temp; 
	
	     return i+1; 
	 } 
	
	 void sorter(int array[], int low, int high) { 
	     if (low < high) { 
	         int pi = partition(array, low, high); 
	         sorter(array, low, pi-1); 
	         sorter(array, pi+1, high); 
	     } 
	 }

}
