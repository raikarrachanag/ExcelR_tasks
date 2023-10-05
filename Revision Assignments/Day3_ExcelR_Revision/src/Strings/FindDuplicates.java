package Strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 3, 8, 9, 1};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the duplicate elements
        System.out.println("Duplicate elements in the array:");

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
