package com.language.programming.model.visitors;

import com.language.programming.model.Art;
import com.language.programming.model.Visitor;

public class Sculpture implements Art{

    private String name;
    private String artist;

    public Sculpture(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.exhibit(this);
    }
    
}
