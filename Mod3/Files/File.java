package com.goit.gojavaonline;

/**
 * Created by User on 06.03.2016.
 */
public class File {

    protected String extension;
    protected float size;
    protected String name;
    protected String location;

    public File(){

    }

    public File ( String location, String name, String extension, float size){
        this.location = location;
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public float getSize() {
        return size;
    }

    public String getExtension() {
        return extension;
    }

    public String getLocation() {
        return location;
    }

    public void description() {
        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
        System.out.println("File size: " + size + "Mb");
        System.out.println("File location: " + location);

    }
}
