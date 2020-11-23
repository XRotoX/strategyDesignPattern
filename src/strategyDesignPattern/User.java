package strategyDesignPattern;

public class User {

	public static void main(String[] args) {
		
		int[] array = {65, 54, 6, 21, 9, 219, 33, 10};
				
		new Context(new QuickSort()).Sort(array);
		System.out.println("\n");
		new Context(new BubbleSort()).Sort(array);
		System.out.println("\n");
		new Context(new SelectionSort()).Sort(array);
		
		

	}

}
