package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.print("\n1. See Movie List\n2. Find Specific Movie\n3. Admin Login\n>");
            userInput = INPUT.nextLine();
            if (userInput.equalsIgnoreCase("See Movie List") || userInput.equalsIgnoreCase("Movie List") || userInput.equalsIgnoreCase("1")) {
                System.out.println(movie.movieList());
            } else if (userInput.equalsIgnoreCase("Find Specific Movie") || userInput.equalsIgnoreCase("Find Movie") || userInput.equalsIgnoreCase("2")) {
                System.out.print("Movie name\n>");
                System.out.println(movie.movieRead(INPUT.nextLine()).replace(", ", "\n"));
            } else if (userInput.equalsIgnoreCase("Admin Login") || userInput.equalsIgnoreCase("Admin") || userInput.equalsIgnoreCase("3")) {
                admin.admin(INPUT);
            }
        }
    }
}
