package strategyDesignPattern;

public class BubbleSort implements Sorter{

	@Override
	public void sort(int[] array) {
		System.out.println("Welcome to bubble sort, this is your sorted array:");
		int n = array.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                 if(array[j-1] > array[j]){  
	                 temp = array[j-1];  
	                 array[j-1] = array[j];  
	                 array[j] = temp;  
                 }  
                          
             }  
         }
         for(int i = 0 ;i< n; i++){
	         System.out.print(" "+array[i]);
	      }
		
	}

}
