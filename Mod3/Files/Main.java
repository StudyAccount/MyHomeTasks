package com.goit.gojavaonline;

/**
 * Created by User on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        AudioFile file = new AudioFile("Program Files", "Virus", ".exe", 3.12f, 32);
        TextFile file1 = new TextFile("Program Files", "dd", ".txt", 3.12f, 13L);

        Directory directory = new Directory();

        directory.setDirectoryName("Programs");

        directory.placeFiles(file);
        directory.placeFiles(file1);
        directory.listDir();

        //file.description();
    }
}

