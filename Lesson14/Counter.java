public class Counter {
	private int x;
	
	public void increment() {
		x++;
	}
	
	public void decrement() {
		x--;
	}
	
	public int value() {
		return x;
	}
	
	public void reset() {
		x = 0;
	}
}
