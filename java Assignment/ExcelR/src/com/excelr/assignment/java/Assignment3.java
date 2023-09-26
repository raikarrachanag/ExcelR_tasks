package com.excelr.assignment.java;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a file operation:");
            System.out.println("1. Create a new directory");
            System.out.println("2. Create a new text file and write content to it");
            System.out.println("3. Read the content from an existing text file");
            System.out.println("4. Append new content to an existing text file");
            System.out.println("5. Copy the content from one text file to another");
            System.out.println("6. Delete a text file");
            System.out.println("7. List all files and directories in a directory");
            System.out.println("8. Search for a specific file in a directory and its subdirectories");
            System.out.println("9. Rename a file");
            System.out.println("10. Get information about a file");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createDirectory(scanner);
                    break;
                case 2:
                    createAndWriteToFile(scanner);
                    break;
                case 3:
                    readFromFile(scanner);
                    break;
                case 4:
                    appendToFile(scanner);
                    break;
                case 5:
                    copyFile(scanner);
                    break;
                case 6:
                    deleteFile(scanner);
                    break;
                case 7:
                    listFilesAndDirectories(scanner);
                    break;
                case 8:
                    searchForFile(scanner);
                    break;
                case 9:
                    renameFile(scanner);
                    break;
                case 10:
                    getFileInfo(scanner);
                    break;
                case 11:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void createDirectory(Scanner scanner) {
        System.out.print("Enter the directory name: ");
        String directoryName = scanner.nextLine();

        File directory = new File(directoryName);

        if (directory.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create the directory.");
        }
    }

    private static void createAndWriteToFile(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.print("Enter the content to write to the file: ");
            String content = scanner.nextLine();

            writer.write(content);
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    private static void readFromFile(Scanner scanner) {
        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File content:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    private static void appendToFile(Scanner scanner) {
        System.out.print("Enter the file name to append: ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true)) {
            System.out.print("Enter the content to append to the file: ");
            String content = scanner.nextLine();

            writer.write(content);
            System.out.println("Content appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }

    private static void copyFile(Scanner scanner) {
        System.out.print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();
        System.out.print("Enter the destination file name: ");
        String destinationFileName = scanner.nextLine();

        try (FileInputStream source = new FileInputStream(sourceFileName);
             FileOutputStream destination = new FileOutputStream(destinationFileName)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = source.read(buffer)) != -1) {
                destination.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.nextLine();

        File fileToDelete = new File(fileName);

        if (fileToDelete.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    private static void listFilesAndDirectories(Scanner scanner) {
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] filesAndDirectories = directory.list();

            if (filesAndDirectories != null && filesAndDirectories.length > 0) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (String item : filesAndDirectories) {
                    System.out.println(item);
                }
            } else {
                System.out.println("No files or directories found in " + directoryPath);
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    private static void searchForFile(Scanner scanner) {
        System.out.print("Enter the directory path to search in: ");
        String directoryPath = scanner.nextLine();
        System.out.print("Enter the file name to search for: ");
        String fileNameToSearch = scanner.nextLine();

        try {
            Files.walk(Paths.get(directoryPath))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().equals(fileNameToSearch))
                    .forEach(path -> System.out.println("Found at: " + path));
        } catch (IOException e) {
            System.out.println("An error occurred during the search: " + e.getMessage());
        }
    }

    private static void renameFile(Scanner scanner) {
        System.out.print("Enter the current file name: ");
        String currentFileName = scanner.nextLine();
        System.out.print("Enter the new file name: ");
        String newFileName = scanner.nextLine();

        File currentFile = new File(currentFileName);
        File newFile = new File(newFileName);

        if (currentFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }

    private static void getFileInfo(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File Information:");
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size (bytes): " + file.length());
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
    }
}
