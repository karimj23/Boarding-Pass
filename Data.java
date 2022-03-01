package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Data {
    public void writeToAFile(String fileName,String field, String line, Boolean append ) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append));
        writer.append(field).append(" : ").append(line);
        writer.newLine();
        writer.close();
    }
}
