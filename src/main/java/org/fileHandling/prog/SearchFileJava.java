package org.fileHandling.prog;

import  java.io.File;
//Imagine a scenario where there are two drives on a computer,
//each with multiple nested folders, and some of these folders contain some file.
// Can you write a Java program to find out whether this file exists? How would you minimize the search time for any file?


public class SearchFileJava {

        public static void main(String[] args) {
            // Specify the drives and the file to search for
            String drive1 = "C:\\";
            String drive2 = "D:\\";
            String fileName = "example.txt"; // Replace with the file you are looking for

            // Create threads for searching in both drives
            Thread searchInDrive1 = new Thread(() -> searchFile(new File(drive1), fileName));
            Thread searchInDrive2 = new Thread(() -> searchFile(new File(drive2), fileName));

            // Start both threads
            searchInDrive1.start();
            searchInDrive2.start();

            // Wait for both threads to finish
            try {
                searchInDrive1.join();
                searchInDrive2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Search completed.");
        }

        private static void searchFile(File directory, String fileName) {
            // Base condition: if directory is null or not a directory
            if (directory == null || !directory.isDirectory()) {
                return;
            }

            // List all files and folders in the directory
            File[] files = directory.listFiles();
            if (files == null) {
                return;
            }

            // Iterate over files and folders
            for (File file : files) {
                if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                    System.out.println("File found at: " + file.getAbsolutePath());
                    return; // Stop search once the file is found
                } else if (file.isDirectory()) {
                    // Recursive call for sub-directories
                    searchFile(file, fileName);
                }
            }
        }
    }

