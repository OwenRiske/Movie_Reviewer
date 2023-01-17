package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String adminPass="blue";
        Scanner INPUT = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.println("1. See Movie List\n2. Find Specific Movie\n3. Admin Login");
            userInput = INPUT.nextLine();
            if (userInput.equalsIgnoreCase("See Movie List") || userInput.equalsIgnoreCase("Movie List") || userInput.equalsIgnoreCase("1")) {

            } else if (userInput.equalsIgnoreCase("Find Specific Movie") || userInput.equalsIgnoreCase("Find Movie") || userInput.equalsIgnoreCase("2")) {

            } else if (userInput.equalsIgnoreCase("Admin Login") || userInput.equalsIgnoreCase("Admin") || userInput.equalsIgnoreCase("3")) {
                while (userInput != adminPass || userInput != "quit") {
                    System.out.print("\nPassword\n>");
                    userInput = INPUT.nextLine();
                }
                if (userInput == adminPass) {
                    while (true) {
                        System.out.println("1. Add Movie");
                        userInput = INPUT.nextLine();
                        if (userInput.equalsIgnoreCase("Add Movie")||userInput.equalsIgnoreCase("Add")|| userInput.equalsIgnoreCase("1"))
                    }
                }

            }
        }
    }
}
