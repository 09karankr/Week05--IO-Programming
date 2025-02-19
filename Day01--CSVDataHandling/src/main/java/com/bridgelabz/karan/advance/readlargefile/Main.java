package com.bridgelabz.karan.advance.readlargefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\Week05\\Day01--CSVDataHandling\\src\\main\\resources\\customers-100.csv";
        int chunk = 100;
        int totalLines = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line;
            int count = 0;
            while((line = bufferedReader.readLine()) != null){
//                System.out.println("Processing: "+line);
                count++;
                totalLines++;

                if(count %chunk == 0){
                    System.out.println("Processed "+count+" lines");
                    System.out.println("total lines so far : "+totalLines);
                    count=0;

                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}