//Owen Riske

package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class file {
    //make a file
    public static void makeFile(String fileName) {
        try {
            File myObj = new File(fileName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("Movie added: " + myObj.getName().replace(".txt",""));
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //write in file
    public static void writeFile(String fileName, String text){
        try {
            FileWriter myWriter = new FileWriter(fileName+".txt");
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //read file
    public static String fileRead(String fileName){
        try {
            File myObj = new File(fileName+".txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList total = new ArrayList();
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                total.add(data);
            }
            myReader.close();
            return String.join(", ", total);
        } catch (FileNotFoundException e) {
            System.out.println("The movie you are trying to find has yet to be added.");
            return "";
        }
    }
}


