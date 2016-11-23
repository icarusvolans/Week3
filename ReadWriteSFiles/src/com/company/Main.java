package com.company;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        // set the path and name of the file
        Path myFilePath = Paths.get("SmallFileReadWrite.txt");
        String myFileContent = "We are writing and reading a small file.";

        // writing the small file
        try {
            // Write the file to disk
            Files.write(myFilePath, myFileContent.getBytes());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // reading the small file
        try {
            // Read the contents of the file and populate our byte[]
            byte[] fileContent = Files.readAllBytes(myFilePath);
            String bytesToString = new String(fileContent);
            System.out.println(bytesToString);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
