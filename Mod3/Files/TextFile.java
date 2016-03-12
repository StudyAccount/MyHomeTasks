package com.goit.gojavaonline;

/**
 * Created by User on 06.03.2016.
 */
public class TextFile extends File {

    protected long symbolCount;

    public TextFile(){

    }

    public TextFile ( String location, String name, String extension, float size, long symbolCount){
        super(location,name,extension,size);
        this.symbolCount = symbolCount;
    }


    public void setSymbolCount(long symbolCount) {
        this.symbolCount = symbolCount;
    }

    public long getSymbolCount() {

        return symbolCount;
    }

    public void description(){
        super.description();
        System.out.println("Have " + this.symbolCount + " symbols");
    }
}
