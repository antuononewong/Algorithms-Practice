// Given 3 arrays sorted in ascending order, print all common elements in these arrays

public class findCommonElementsArrays {
	public findCommonElementsArrays() {}
	
	public static void getCommonElements(int[] arr1, int[] arr2, int[] arr3) {
		int x = 0;
		int y = 0;
		int z = 0;
		
		while (x < arr1.length || y < arr2.length || z < arr3.length) {
			
			if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				System.out.println(Integer.toString(arr1[x]));
				x += 1;
				y += 1;
				z += 1;
			}
			
			if (arr1[x] < arr2[y] && x < arr1.length - 1) {
				x += 1;
			}
			if (arr2[y] < arr3[z] && y < arr2.length - 1) {
				y += 1;
			}
			if (arr3[z] < arr2[y] && z < arr3.length - 1) {
				z += 1;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {2, 3, 5, 9, 10, 14, 21};
		int[] arr3 = {2, 3, 6, 13};
		
		getCommonElements(arr1, arr2, arr3);
	}
}
