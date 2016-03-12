package com.goit.gojavaonline;

/**
 * Created by User on 06.03.2016.
 */
public class ImageFile extends File {
    protected long pixels;

    public ImageFile(){

    }

    public ImageFile ( String location, String name, String extension, float size, long pixels){
        super(location,name,extension,size);
        this.pixels = pixels;
    }

    public void setLength(int length) {
        this.pixels = length;
    }

    public long getLength() {

        return pixels;
    }

    public void description() {
        super.description();
        System.out.println("Have " + this.pixels + " pixels");
    }
}
