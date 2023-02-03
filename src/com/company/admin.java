//Owen Riske
package com.company;

import java.util.Scanner;

public class admin {
    public static void adminStuff(Scanner INPUT){
        String userInput="";
        String adminPass="blue";
//password (user can quit)
        while (!userInput.equals(adminPass) && !userInput.equalsIgnoreCase("quit")) {
            System.out.print("\nPassword\n>");
            userInput = INPUT.nextLine();
        }
        //only let through if password was inputted, they didn't quit
        if (userInput.equalsIgnoreCase(adminPass)) {
            while (true) {
                    System.out.print("\n1. Add Movie\n2. Edit Movie \n3. Movie List\n4. Exit\n>");
                    userInput = INPUT.nextLine();

                //add movie
                if (userInput.equalsIgnoreCase("Add Movie")||userInput.equalsIgnoreCase("Add")|| userInput.equalsIgnoreCase("1")){
                    movie.makeMovie(INPUT);
                }
                else if (userInput.equalsIgnoreCase("Edit Movie")||userInput.equalsIgnoreCase("Edit")||userInput.equalsIgnoreCase("2")){
                    System.out.print("Movie name\n>");
                    userInput=INPUT.nextLine();
                    if(!userInput.equalsIgnoreCase("movieList")){
                        movie.editMovie(userInput, INPUT);
                    }
                }
                //print all movie names
                else if (userInput.equalsIgnoreCase("Movie List")||userInput.equalsIgnoreCase("List")||userInput.equalsIgnoreCase("3")){
                    System.out.println(movie.movieList());
                }
                //exit admin stuff
                else if (userInput.equalsIgnoreCase("4")||userInput.equalsIgnoreCase("exit")||userInput.equalsIgnoreCase("quit")){
                    break;
                }
                else {
                    System.out.println("Sorry, " + userInput + " isn't an available option");
                }
            }
        }

    }
}


