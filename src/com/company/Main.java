//Owen Riske
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        String userInput;
        while (true) {
            //user options
            System.out.print("\n1. See Movie List\n2. Find Specific Movie\n3. Movie Search \n4. Admin Login\n>");
            userInput = INPUT.nextLine();
            //what user can choose
            if (userInput.equalsIgnoreCase("See Movie List") || userInput.equalsIgnoreCase("Movie List") || userInput.equalsIgnoreCase("1")) {
                //print all saved movies
                System.out.println(movie.movieList());
            }
            //allow user to find a specific movie
            else if (userInput.equalsIgnoreCase("Find Specific Movie") || userInput.equalsIgnoreCase("Find Movie") || userInput.equalsIgnoreCase("2")) {
                System.out.print("Movie name\n>");
                System.out.println(movie.movieRead(INPUT.nextLine()).replace(", ", ""));
            }
            //user can use a search engine
            else if (userInput.equalsIgnoreCase("Movie Search")||userInput.equalsIgnoreCase("Search")||userInput.equalsIgnoreCase("3")){
                System.out.print("Movie name\n>");
                search.searchByName(INPUT.nextLine());
            }
            //login to admin stuff
            else if (userInput.equalsIgnoreCase("Admin Login") || userInput.equalsIgnoreCase("Admin") || userInput.equalsIgnoreCase("4")) {
                admin.adminStuff(INPUT);
            }
            //user inputs an unknown choice
            else{
                System.out.println("Sorry, "+userInput+" isn't an available option");
            }
        }
    }
}
