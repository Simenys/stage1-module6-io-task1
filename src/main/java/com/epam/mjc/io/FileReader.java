package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        return new Profile();
    }

    public void file() throws IOException {
        String directory = System.getProperty("user.home");
        String fileName = "Profile.txt";
        String path = directory + File.separator + fileName;
        StringBuilder textRead = new StringBuilder();
        try (BufferedReader read = new BufferedReader((new java.io.FileReader(path)))) {
            String line;
            while ((line = read.readLine()) != null) {
                textRead.append(line).append("\n");
            }
        } catch (IOException e) {

        }
    }
}
