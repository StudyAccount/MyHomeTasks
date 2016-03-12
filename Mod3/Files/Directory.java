package com.goit.gojavaonline;

import java.util.*;

/**
 * Created by User on 06.03.2016.
 */
public class Directory {

    private ArrayList<File> files = new ArrayList<File>() {

    };
    private String directoryName;

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public void placeFiles(File file) {
        if (files.contains(file)) {
            System.out.println("This file already exist in directory");;
        } else {
            files.add(file);
            file.setLocation(this.directoryName);
        }

    }

    public void deleteFiles(File file){
        files.remove(file);
        file.setLocation("No location");
    }

    public void listDir(){
        System.out.println("Current directory is " + this.directoryName);
        System.out.println("File list:");

        if (files != null){
            for (int counter = 0; counter <files.size(); counter++){
                File file = files.get(counter);
                System.out.println("- " + file.name + file.extension + "  " +file.size );
            }
        }
    }
}
