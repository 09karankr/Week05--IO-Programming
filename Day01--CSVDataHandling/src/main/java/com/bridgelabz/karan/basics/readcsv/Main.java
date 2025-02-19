package com.bridgelabz.karan.basics.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String filePath = "D:\\Week05\\Day01--CSVDataHandling\\src\\main\\resources\\sample.csv"; // Path to your CSV file
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read the header line (optional)
            String header = br.readLine();
            if (header != null) {
                System.out.println("Student Records:");
                System.out.println("----------------------------------------");
                System.out.printf("%-5s %-15s %-5s %-5s%n", "ID", "Name", "Age", "Marks");
                System.out.println("----------------------------------------");
            }

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Split by comma

                if (data.length == 4) {
                    String id = data[0].trim();
                    String name = data[1].trim();
                    String age = data[2].trim();
                    String marks = data[3].trim();

                    // Print in formatted output
                    System.out.printf("%-5s %-15s %-5s %-5s%n", id, name, age, marks);
                }
            }
            System.out.println("----------------------------------------");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    }

