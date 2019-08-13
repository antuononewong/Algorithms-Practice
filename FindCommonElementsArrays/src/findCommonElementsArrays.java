// Given 3 arrays sorted in ascending order, print all common elements in these arrays

public class findCommonElementsArrays {
	public findCommonElementsArrays() {}
	
	// Iterates through all 3 arrays simultaneously and compare elements. If a common
	// element is found, it is printed to console.
	public static void getCommonElements(int[] arr1, int[] arr2, int[] arr3) {
		int x = 0, y = 0, z = 0;
		
		while (x < arr1.length && y < arr2.length && z < arr3.length) {
			
			if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				System.out.println(Integer.toString(arr1[x]));
				x += 1;
				y += 1;
				z += 1;
			}
			
			else if (arr1[x] <= arr2[y]) {
				x += 1;
			}
			else if (arr2[y] <= arr3[z]) {
				y += 1;
			}
			else {
				z += 1;
			}
			//System.out.println("x: " + Integer.toString(x) + " y: " + Integer.toString(y) + " z: " + Integer.toString(z));
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {2, 3, 5, 6, 9, 10, 14, 21};
		int[] arr3 = {2, 3, 6, 13};
		
		getCommonElements(arr1, arr2, arr3);
	}
}

/* Output
 * 2
 * 3
 * 6
*/