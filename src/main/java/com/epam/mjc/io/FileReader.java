package com.epam.mjc.io;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String[] lines = new String[4];
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null && i < 4) {
                lines[i] = line;
                i++;
            }
        } catch (IOException e) {
            // Handle IOException if needed
        }

        if (lines[0] != null && lines[1] != null && lines[2] != null && lines[3] != null) {
            String name = lines[0].substring(lines[0].indexOf(":") + 2);
            Integer age = Integer.parseInt(lines[1].substring(lines[1].indexOf(":") + 2));
            String email = lines[2].substring(lines[2].indexOf(":") + 2);
            Long phone = Long.parseLong(lines[3].substring(lines[3].indexOf(":") + 2));
            return new Profile(name, age, email, phone);

        } else {
            // Handle the case where not all lines were found or parsed correctly
            return null; // Or throw an exception
        }

    }
}
