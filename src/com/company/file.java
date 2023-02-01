//Owen Riske

package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class file {
    public static void makeFile(String fileName) {
        try {
            File myObj = new File(fileName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("Movie added: " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
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
            System.out.println("The file you are trying to find isn't recorded on this system.");
            e.printStackTrace();
            return "ERROR";
        }
    }

    private String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader (file));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }
}


