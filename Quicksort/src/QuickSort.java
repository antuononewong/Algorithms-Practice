/* Quicksort is a divide and conquer algorithm that partitions an array around
 * a pivot element. It is done in-place and this implementation isn't stable.
 * In the average case, it is O(nlogn), so it's efficient. There are different 
 * variations based on the pivot element. In this case, the last element will be 
 * chosen as the pivot.
 */

import java.util.Arrays;

public class QuickSort {
	int[] numbers;
	
	public QuickSort(int[] numbers) {
		this.numbers = numbers;
	}
	
	public void partition() {
		
	}
	
	public void print() {
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 8, 2, 3, 1, 7, 6, 10};
		
		QuickSort sort = new QuickSort(numbers);
		sort.print();
	}
	
}