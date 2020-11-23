package strategyDesignPattern;

public class Context {
	
	private Sorter sorter;
	
	public Context(Sorter sorter) {
		this.sorter = sorter;
	}
	
	public void Sort(int[] array) {
		sorter.sort(array);
	}

}
