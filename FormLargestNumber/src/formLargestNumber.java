import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*Given a list of non negative integers, arrange them in such a manner that 
* they form the largest number possible.The result is going to be very large, 
* hence return the result in the form of a string.
*/

public class formLargestNumber {
	
	// Takes in an array of ints as Strings and converts into ArrayList.
	// Sorts the new ArrayList and prints it out.
	public void formNumber(String[] arr1) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		
		Collections.sort(list, new Compare());
		printNumber(list);
	}
	
	// Prints elements of ArrayList together on one line
	public void printNumber(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	
	// Compares elements of ArrayList to each other in different combinations and orderings
	public static class Compare implements Comparator<String>
	{
	    public int compare(String str1, String str2)
	    {
	        return Integer.compare(Integer.parseInt(str2 + str1), Integer.parseInt(str1 + str2));
	    }
	}

	// Driver 
	public static void main(String[] args) {
		// Assumption - arrays are sorted increasing order and by position of the digits
		String[] arr1 = {"3", "30", "34", "5", "9"};  //9534330
		String[] arr2 = {"54", "546", "548", "60"}; //6054854654
		
		formLargestNumber form = new formLargestNumber();
		form.formNumber(arr1);
		form.formNumber(arr2);
	
	}

}

/*Output
* [3, 30, 34, 5, 9]
* 9534330
* [54, 546, 548, 60]
* 6054854654
*/