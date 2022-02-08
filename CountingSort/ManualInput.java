package CountingSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ManualInput {
	
	static ArrayList<Integer> preArray;
	static CountingSort toSort;
	static int[] sorted;

	
	
	public static ArrayList<Integer> input() {
		System.out.println("Enter Integers that shall be sorted");
		System.out.println("When done Enter something else");
		ArrayList<Integer> input = new ArrayList<Integer>(100);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Next input (or no Int to end input process):");
			try {
				int nextInt = sc.nextInt();
				if(nextInt < 0) {
					throw new IllegalArgumentException("#### WARNING: Input should be positive####");
				}
				Integer nxtInt = nextInt;
				input.add(nxtInt);
			}
			catch (InputMismatchException e){
				sc.close();
				System.out.println("Input Sequence ended, starting Counting Sort");
				return input;
			}
			
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
		}
	}

	public static void main(String[] args) {
		System.out.println("###################################################");
		System.out.println("     <Counting Sort>          <Version 1.2.3>      ");
		System.out.println("---------------------------------------------------");
		preArray = input();
		toSort = new CountingSort(preArray);
		sorted = toSort.sort();
		
		
		System.out.println("The given Array got sorted to:");
		for(int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		
		}
		System.out.println();
		System.out.println("-------------------End of Process------------------");
		System.out.println("###################################################");
	}
}
