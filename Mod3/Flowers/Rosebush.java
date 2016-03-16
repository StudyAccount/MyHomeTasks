package com.goit.gojavaonline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07.03.2016.
 */
public class Rosebush {
    private List<Rose> roses = new ArrayList<Rose>();

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    public void addRoses(Rose rose){
        roses.add(rose);
    }
}
