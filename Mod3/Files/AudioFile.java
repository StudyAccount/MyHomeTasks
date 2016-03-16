package com.goit.gojavaonline;

/**
 * Created by User on 06.03.2016.
 */
public class AudioFile extends File {
    protected int length;

    public AudioFile ( String location, String name, String extension, float size, int length){
        super(location,name,extension,size);
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {

        return length;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Lasts " + this.length + " seconds");
    }
}
