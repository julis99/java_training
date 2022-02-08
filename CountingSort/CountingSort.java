package CountingSort;

/**
 * @version 1.1.3
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountingSort{
	private int[] watched;
	private int maximum;
	private Counter counter;
	
	public CountingSort(ArrayList<Integer> input) {
		this.maximum = Collections.max(input);
		this.counter = new Counter(this.maximum);
		this.watched = new int[input.size()];
		for (int i=0; i < watched.length; i++) {
	       watched[i] = input.get(i).intValue();
	   }
	}
	
	public CountingSort(int[] input) {
		this.maximum = 0;
		for(int i = 0; i < input.length; i++) {
			if(this.maximum <= input[i]) {
				this.maximum = input[i];
			}
			continue;
		}
		this.watched = input;
		this.counter = new Counter(this.maximum);
	}
	
	public int[] sort() {
		int[] sorted = new int[watched.length];
		this.counter.count(watched);
		this.counter.convert();
		for(int i = watched.length - 1; i>=0; i--) {
			try {
				sorted[this.counter.counter[watched[i]]-1] = watched[i];
				this.counter.counter[watched[i]]--;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				continue;
				}
		}
		return sorted;
	}
}
