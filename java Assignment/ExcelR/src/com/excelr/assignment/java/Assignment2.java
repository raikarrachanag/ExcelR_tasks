package com.excelr.assignment.java;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Concatenate Strings");
            System.out.println("2. Find Length of a String");
            System.out.println("3. Convert to Uppercase and Lowercase");
            System.out.println("4. Extract Substring");
            System.out.println("5. Split a Sentence");
            System.out.println("6. Reverse a String");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    String concatenated = str1 + str2;
                    System.out.println("Concatenated String: " + concatenated);
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine();
                    int length = inputString.length();
                    System.out.println("Length of the string: " + length);
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    String inputStr = scanner.nextLine();
                    System.out.println("Uppercase: " + inputStr.toUpperCase());
                    System.out.println("Lowercase: " + inputStr.toLowerCase());
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    String sourceString = scanner.nextLine();
                    System.out.print("Enter starting index: ");
                    int startIndex, endIndex;
                    try {
                        startIndex = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter ending index: ");
                        endIndex = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter valid indices.");
                        continue;
                    }
                    if (startIndex >= 0 && endIndex <= sourceString.length() && startIndex <= endIndex) {
                        String substring = sourceString.substring(startIndex, endIndex);
                        System.out.println("Substring: " + substring);
                    } else {
                        System.out.println("Invalid indices.");
                    }
                    break;
                case 5:
                    System.out.print("Enter a sentence: ");
                    String sentence = scanner.nextLine();
                    String[] words = sentence.split("\\s+");
                    System.out.println("Words in the sentence:");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();
                    String reversed = new StringBuilder(input).reverse().toString();
                    System.out.println("Reversed string: " + reversed);
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}
