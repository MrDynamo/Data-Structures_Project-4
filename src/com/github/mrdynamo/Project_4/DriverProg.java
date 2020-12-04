package com.github.mrdynamo.Project_4;

import java.util.Scanner;

public class DriverProg {

    /** Main Method **/
    // Test both implementations
    public static void main(String[] args) {

        // Quit boolean
        boolean quit = false;

        // Frequency tables
        ADTFrequencyTable arrFT = new FTableArray();
        ADTFrequencyTable bstFT = new FTableBST();

        // User input
        Scanner kbd = new Scanner(System.in);
        String input;

        // Prompt file
        System.out.println("Enter the name of the input file:");
        input = kbd.nextLine();
        // parse

        System.out.println("Reading...\n");

        // Operation loop
        while (!quit) {
            System.out.println("Please type a number to choose an operation:\n\t1) Retrieve\t2)Insert\t3)Quit");
            input = kbd.nextLine();

            switch(Integer.parseInt(input)) {
                case 1:
                    // Retrieve
                case 2:
                    // Insert
                case 3:
                    // Quit
                    quit = true;
                default:
                    // Blah

            } // End switch

        } // End while

    } // End main

} // End DriverProg
