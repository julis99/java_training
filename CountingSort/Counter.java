package CountingSort;

public class Counter{
	int[] counter;
	int maximum;

	public Counter(int max) {
		this.maximum = max;
		this.counter = new int[max + 1];
	}
	
	public void count(int[] toCount) {
		int i = 0;
		try {
			for(i = 0; i < toCount.length; i++) {
				this.counter[toCount[i]]++;
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Number " + toCount[i] + " out of bounds");
			return;
		}
	}
	public void convert() {
		for(int i = 1; i < this.counter.length; i++) {
			this.counter[i] = this.counter[i] + this.counter[i - 1];
		}
	}
}
