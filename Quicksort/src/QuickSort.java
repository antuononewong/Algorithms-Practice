/* Quicksort is a divide and conquer algorithm that partitions an array around
 * a pivot element. All elements < go into the left partition and elements > go into the right partition.
 * Repeat until you reach empty array. It is done in-place and this implementation isn't stable.
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
	
	// Takes a left and right index indicating a subset of original array. Checks
	// each element in the array then makes appropriate swaps depending on if < or >
	// the pivot element.
	public int partition(int left, int right) {
		int pivot = numbers[right];
		int pivot_index = left - 1;
		
		for (int i = left; i < right; i++) {
			if (numbers[i] <= pivot) {
				pivot_index += 1;
				swap(pivot_index, i);
			}
		}
		
		swap(pivot_index + 1, right);
		
		return pivot_index + 1;
	}
	
	// Handles recursion of QuickSort to go into the smaller subsets
	public void recurse(int left, int right) {
		if (left < right) {
			int pivot_index = partition(left, right);
			recurse(left, pivot_index - 1);
			recurse(pivot_index + 1, right);
		}
	}
	
	// Simple swap of elements at index x and y
	public void swap(int x, int y) {
		int temp = numbers[x];
		numbers[x] = numbers[y];
		numbers[y] = temp;
	}
	
	// Prints out whole array
	public void print() {
		System.out.println(Arrays.toString(numbers));
	}
	
	// Driver function
	public static void main(String[] args) {
		int[] numbers = {10, 5, 2, 3, 1, 8, 6, 7};
		
		QuickSort sort = new QuickSort(numbers);
		sort.recurse(0, numbers.length - 1);
		sort.print();
	}
	
}

/* Output
 * [1, 2, 3, 5, 6, 7, 8, 10]
*/