package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String adminPass="blue";
        Scanner INPUT = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.print("\n1. See Movie List\n2. Find Specific Movie\n3. Admin Login\n>");
            userInput = INPUT.nextLine();
            if (userInput.equalsIgnoreCase("See Movie List") || userInput.equalsIgnoreCase("Movie List") || userInput.equalsIgnoreCase("1")) {

            } else if (userInput.equalsIgnoreCase("Find Specific Movie") || userInput.equalsIgnoreCase("Find Movie") || userInput.equalsIgnoreCase("2")) {

            } else if (userInput.equalsIgnoreCase("Admin Login") || userInput.equalsIgnoreCase("Admin") || userInput.equalsIgnoreCase("3")) {
                while (!userInput.equals(adminPass) && !userInput.equalsIgnoreCase("quit")) {
                    System.out.print("\nPassword\n>");
                    userInput = INPUT.nextLine();
                }
                if (userInput.equalsIgnoreCase(adminPass)) {
                    while (true) {
                        System.out.print("\n1. Add Movie\n 2. Delete Movie\n>");
                        userInput = INPUT.nextLine();
                        if (userInput.equalsIgnoreCase("Add Movie")||userInput.equalsIgnoreCase("Add")|| userInput.equalsIgnoreCase("1")){
                            System.out.print("Movie Name\n>");
                            movie.makeMovie(INPUT);
                        }
                        else if (userInput.equalsIgnoreCase("Delete Movie")||userInput.equalsIgnoreCase("Delete")||userInput.equalsIgnoreCase("2")){

                        }
                    }
                }

            }
        }
    }
}
