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
	
	public void partition() {
		int pivot = numbers[numbers.length - 1];
		int midpoint = (int) (Math.ceil(numbers.length / 2));
		int left_index = 0;
		int right_index = midpoint + 1;
		
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] < pivot) {
				swap(i, left_index);
				left_index += 1;
			}
			else {
				if (right_index < numbers.length - 1) {
					swap(i, right_index);
					right_index += 1;
				}
			}	
		}
		swap(numbers.length - 1, midpoint - 1);
	}
	
	public void swap(int x, int y) {
		int temp = numbers[x];
		numbers[x] = numbers[y];
		numbers[y] = temp;
	}
	
	public void print() {
		System.out.println(Arrays.toString(numbers));
	}
	
	public void recurse() {
		partition();
	}
	
	public static void main(String[] args) {
		int[] numbers = {10, 8, 2, 3, 1, 7, 6, 5};
		
		QuickSort sort = new QuickSort(numbers);
		sort.recurse();
		sort.print();
	}
	
}