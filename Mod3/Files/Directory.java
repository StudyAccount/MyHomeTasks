package com.goit.gojavaonline;

import java.util.*;

/**
 * Created by User on 06.03.2016.
 */
public class Directory {

    protected List<File> files = new ArrayList<File>() {

    };
    protected String directoryName;

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
        System.out.println("File list: ");

        if (!files.isEmpty()){
            for (File fileInDirectory : files) {
                System.out.println("- " + fileInDirectory.name + fileInDirectory.extension + "  " + fileInDirectory.size);
            }
        }
    }
}
