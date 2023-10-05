package Strings;

import java.util.HashMap;
import java.util.Map;

public class Counting_Vowels_and_Consonents {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 3, 6, 3, 7, 4, 2};

        Map<Integer, Integer> occurrences = countOccurrences(array);

        System.out.println("Element occurrences in the array:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

    public static Map<Integer, Integer> countOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        return occurrences;
    }
}
