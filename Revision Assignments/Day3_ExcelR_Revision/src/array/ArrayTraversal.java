package array;

public class ArrayTraversal {

	public static void main(String[] args) {
		 int[] arr = {22,44,66,88,110 };

	        System.out.println("Using a for loop:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Element at index " + i + ": " + arr[i]);
	        }

	        System.out.println("\nUsing an enhanced for loop (for-each loop):");
	        for (int element : arr) {
	            System.out.println("Element: " + element);
	        }
	    }

	}

