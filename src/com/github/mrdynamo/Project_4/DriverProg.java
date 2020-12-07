package com.github.mrdynamo.Project_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DriverProg {

    /** Main Method **/
    // Test both implementations
    public static void main(String[] args) throws FTableException, IOException {

        // Quit boolean
        boolean quit = false;
        int wordCount = 0;

        // Frequency tables
        FTableArray arrFT = new FTableArray();
        ADTFrequencyTable bstFT = new FTableBST();

        // File
        File file = null;
        Scanner fileIn = null;

        // User input
        Scanner kbd = new Scanner(System.in);
        String input;

        // Prompt file
        System.out.println("Enter the name of the input file:");
        input = kbd.nextLine();

        // Read file
        System.out.println("Reading...\n");
        try {
            file = new File(input);
            fileIn = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: No file found!");
            //e.printStackTrace();
            quit = true;
        }

        // Parse file
        while (fileIn.hasNext()) {
            KeyedItem item = new KeyedItem(fileIn.next());
            arrFT.insert(item);
            //bstFT.insert(item);
        }

        // Print initial  table stats
        System.out.println("Printing initial table stats.");
        arrFT.saveFTable("outputArrayInitial.txt");
        //bstFT.saveFTable("outputBSTInitial.txt");

        // Operation loop
        while (!quit) {
            System.out.println("Please type a number to choose an operation:\n\t1) Retrieve\t2) Insert\t3) Quit");
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

        // Print modified table stats
        System.out.println("Printing modified table stats.");
        arrFT.saveFTable("outputArrayModified.txt");
        //bstFT.saveFTable("outputBSTModified.txt");

    } // End main

} // End DriverProg
