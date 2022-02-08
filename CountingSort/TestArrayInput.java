package CountingSort;

public class TestArrayInput {
	public static void main(String[] args) {
		int[] test = {12, 2, 4, 43, 4, 3, 2, 2, 3, 4, 3, 2, 3, 2, 0};
		CountingSort testCount = new CountingSort(test);
		test = testCount.sort();
		System.out.println("The test Array has been sorted to:");
		for(int i = 0; i < test.length; i++) {
			System.out.print(String.format("%d", test[i]) + " ");
		}
	}
}
