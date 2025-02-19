package com.bridgelabz.karan.intermediate.searchrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\Week05\\Day01--CSVDataHandling\\src\\main\\resources\\employeeee.csv";
        String name = "Karan Kumar";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            String[] columns = line.split(",");

            System.out.printf("%-20s%-20s%-5s%n",columns[0],columns[1],columns[2]);
            System.out.println();
            while ((line = bufferedReader.readLine()) != null) {

                columns = line.split(",");
                if(columns[0].equals(name)){
                    System.out.printf("%-20s%-20s%-5s%n",columns[0],columns[1],columns[2]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
