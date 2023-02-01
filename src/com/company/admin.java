package com.company;

import java.util.Scanner;

public class admin {
    public static void admin(Scanner INPUT){
        String userInput="";
        String adminPass="blue";

        while (!userInput.equals(adminPass) && !userInput.equalsIgnoreCase("quit")) {
            System.out.print("\nPassword\n>");
            userInput = INPUT.nextLine();
        }
        if (userInput.equalsIgnoreCase(adminPass)) {
            while (true) {
                userInput="";
                System.out.print("\n1. Add Movie\n2. Movie List\n3. Exit\n>");
                userInput = INPUT.nextLine();
                if (userInput.equalsIgnoreCase("Add Movie")||userInput.equalsIgnoreCase("Add")|| userInput.equalsIgnoreCase("1")){
                    movie.makeMovie(INPUT);
                }
                else if (userInput.equalsIgnoreCase("Movie List")||userInput.equalsIgnoreCase("List")||userInput.equalsIgnoreCase("2")){
                    System.out.println(movie.movieList());
                }
                else if (userInput.equalsIgnoreCase("3")||userInput.equalsIgnoreCase("exit")||userInput.equalsIgnoreCase("quit")){
                    break;
                }
            }
        }

    }
}


