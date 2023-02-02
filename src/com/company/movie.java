//Owen Riske
package com.company;

import java.util.Scanner;

public class movie {
    //setup movie stuff
    public static void makeMovie(Scanner INPUT){
        //input
        System.out.print("\nMovie Name\n>");
        String name=INPUT.nextLine();
        System.out.print("\nMovie Description\n>");
        String description=INPUT.nextLine();
        System.out.print("\nMovie Length\n>");
        double length=INPUT.nextDouble();
        System.out.print("\nRating\n>");
        int rating=INPUT.nextInt();
        //make and write a file for each movie
        file.makeFile(name);
        file.writeFile(name,"name: "+name+"\n rating: "+rating+"\n length: "+length+"\n description: "+description);
        //add movie to the file movieList
        file.writeFile("movieList",file.fileRead("movieList").replace(", ","\n")+"\n"+name);
    }
    public static String movieRead(String name){
        //output movie information
        String movieStuff=file.fileRead(name);
        return movieStuff.replace("name: ","\n").replace("rating: ","\n").replace("length: ","\n").replace("description: ","\n");
    }
    public static String movieList(){
        //list all the movies
        return file.fileRead("movieList").replace(", ","\n");
    }


}
