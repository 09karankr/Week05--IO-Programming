package com.bridgelabz.karan.basic.readcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\Week05\\Day01--CSVDataHandling\\src\\main\\resources\\sample.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            int count = 0;
            String line;
            while((line = bufferedReader.readLine())!=null){
                count++;
            }
            System.out.println("Number of rows in csv file = "+(count-1));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
