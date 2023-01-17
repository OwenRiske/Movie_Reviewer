package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class movie {
    String name;
    int rating;
    double length;
    String description;

    //constructor
    movie(String name, String description, double length, int rating){
        this.name=name;
        this.description=description;
        this.length=length;
        this.rating=rating;
        movieFile(name,description,length,rating);
    }
    movie(String name, String description, int rating){
        this.name=name;
        this.description=description;
        this.length=0.0;
        this.rating=rating;
        movieFile(name,description,length,rating);
    }

    String getName(){
        return name;
    }

    void movieFile(String name, String description, double length, int rating){
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
    }

    }



