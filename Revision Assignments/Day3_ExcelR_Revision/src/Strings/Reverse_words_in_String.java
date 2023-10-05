package Strings;

public class Reverse_words_in_String {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] reversedArray = reverse(array);

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        return reversedArray;
    }
}
