package com.github.mrdynamo.Project_4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    private static String fileIn;
    private static String[] rawWords;
    private static int count;
    private final int MAX_SIZE = 10000;

    public ReadFile(String fileIn) {
        this.fileIn = fileIn;
        rawWords = new String[MAX_SIZE];
        count = 0;
    }

    public static void main(String[] args) throws IOException  {

        File file = new File(fileIn);
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            rawWords[count] = input.next();
            count++;
        }

        System.out.println("File read succesfully.");

    }

}
