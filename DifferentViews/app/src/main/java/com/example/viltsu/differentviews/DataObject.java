package com.example.viltsu.differentviews;

/**
 * Created by ville-pekkapalmgren on 26/02/18.
 */

public class DataObject {
    private String name;
    private int pictureId;

    public DataObject(String name, int pictureId) {
        this.name = name;
        this.pictureId = pictureId;
    }

    public DataObject(){
        name = "";
        pictureId = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
