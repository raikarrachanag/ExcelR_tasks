package com.excelr.assignment.java;

import java.util.*;
import java.util.List;

// Base class for collection managers
abstract class CollectionManager<T> {
    protected List<T> collection;

    public CollectionManager() {
        collection = new ArrayList<>();
    }

    public void add(T element) {
        collection.add(element);
    }

    public void remove(T element) {
        if (collection.contains(element)) {
            collection.remove(element);
        } else {
            System.out.println("Element not found.");
        }
    }

    public void displayAll() {
        System.out.println("All elements:");
        for (T element : collection) {
            System.out.println(element);
        }
    }

    abstract void performOperation();
}

// List manager
class ListManager extends CollectionManager<String> {
    @Override
    void performOperation() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation for the list:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display all elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to add: ");
                    String elementToAdd = scanner.nextLine();
                    add(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter an element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    remove(elementToRemove);
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

// Set manager
class SetManager extends CollectionManager<String> {
    @Override
    void performOperation() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation for the set:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display all elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to add: ");
                    String elementToAdd = scanner.nextLine();
                    add(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter an element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    remove(elementToRemove);
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

// Map manager
class MapManager extends CollectionManager<Map.Entry<String, String>> {
    @Override
    void performOperation() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation for the map:");
            System.out.println("1. Add a key-value pair");
            System.out.println("2. Remove a key-value pair");
            System.out.println("3. Display all key-value pairs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter a value: ");
                    String value = scanner.nextLine();
                    Map.Entry<String, String> entry = new AbstractMap.SimpleEntry<>(key, value);
                    add(entry);
                    break;
                case 2:
                    System.out.print("Enter a key to remove: ");
                    String keyToRemove = scanner.nextLine();
                    Map.Entry<String, String> entryToRemove = collection.stream()
                            .filter(e -> e.getKey().equals(keyToRemove))
                            .findFirst()
                            .orElse(null);
                    if (entryToRemove != null) {
                        remove(entryToRemove);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a collection type:");
            System.out.println("1. List");
            System.out.println("2. Set");
            System.out.println("3. Map");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            CollectionManager<?> manager;

            switch (choice) {
                case 1:
                    manager = new ListManager();
                    break;
                case 2:
                    manager = new SetManager();
                    break;
                case 3:
                    manager = new MapManager();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
            }

            manager.performOperation();
        }
    }
}
