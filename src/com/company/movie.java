package com.company;

import java.io.IOException;  // Import the IOException class to handle errors
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
        file.makeFile(name);
        file.writeFile(name,"name: "+name+"\n, rating: "+rating+"\n, length: "+length+"\n, description: "+description);
        file.writeFile("movieList",file.fileRead("movieList").replace(", ","\n")+"\n"+name);
    }
    public static String movieRead(String name){
        String movieStuff=file.fileRead(name);
        return movieStuff.replace("name: ","\n").replace("rating: ","\n").replace("length: ","\n").replace("description: ","\n");
    }
    public static String movieList(){
        return file.fileRead("movieList").replace(", ","\n");
    }


}
