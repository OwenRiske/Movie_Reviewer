package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class movie {
    public static void makeMovie(Scanner INPUT){
        System.out.print("\nMovie Name\n>");
        String name=INPUT.nextLine();
        System.out.print("\nMovie Description\n>");
        String description=INPUT.nextLine();
        System.out.print("\nMovie Length\n>");
        double length=INPUT.nextDouble();
        System.out.print("\nRating\n>");
        int rating=INPUT.nextInt();
        movieFile(name,description,length,rating);

    }

    private static void movieFile(String name, String description, double length, int rating){
        File f = new File("F:\\"+name+".txt");

        try {
            //create and write movie file
            if (f.createNewFile()){
                System.out.println(name + " has been created");
                FileWriter fWrite = new FileWriter(name+".txt");
                fWrite.write("Name: "+name+"\nDescription: "+description+"\nLength: "+length+"\nRating: "+rating); }
            //movie is already saved
            else{
                System.out.println(name + " already exists");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //file stuff from:
        //https://www.w3schools.com/java/java_files_create.asp
        //https://www.geeksforgeeks.org/file-class-in-java/
    }
}
