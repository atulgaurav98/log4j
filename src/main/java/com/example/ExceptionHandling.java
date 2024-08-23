package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Unchecked Exception (ArithmeticException)
        try {
            // Example of an arithmetic operation that can throw an unchecked exception (division by zero)
            int result = divide(10, 0);  // This will throw an ArithmeticException
            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            // Handling the unchecked ArithmeticException
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (Exception e) {
            // This is a generic catch block that catches any other exceptions (safeguard)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Checked Exception (IOException)
        try {
            // Example of an operation that can throw a checked exception (file reading)
            readFile("nonexistentfile.txt");  // This will throw an IOException if the file doesn't exist

        } catch (IOException e) {
            // Handling the checked IOException
            System.out.println("Error: File not found or cannot be read!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block to handle any other unexpected exceptions
            System.out.println("An unexpected error occurred during file reading: " + e.getMessage());
        } finally {
            // Finally block executes regardless of exception, typically used for cleanup
            System.out.println("Execution completed. Cleaning up resources if any.");
        }
    }

    // A method that performs division and can potentially throw an unchecked exception
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        // If the denominator is zero, Java will throw an ArithmeticException (unchecked exception).
        return numerator / denominator;
    }

    // A method that reads a file and throws a checked exception if something goes wrong
    public static void readFile(String filePath) throws IOException {
        // Try to open and read the file
        FileReader fileReader = new FileReader(filePath);  // This can throw a FileNotFoundException (which is a subclass of IOException)
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read and print the first line of the file
        String line = bufferedReader.readLine();
        System.out.println("First line of the file: " + line);

        // Close the reader to free resources
        bufferedReader.close();
    }
}
