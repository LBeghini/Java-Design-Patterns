package com.language.programming.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.language.programming.model.visitors.Painting;
import com.language.programming.model.visitors.Sculpture;

public class Museum implements Visitor {

    private static Museum instance = new Museum();
    
    private Museum() {};
    
    public static Museum getInstance() {
        return instance;
    }

    public String exhibit(Art art) {
        return art.accept(this);
    }

    @Override
    public String exhibit(Painting painting) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(painting);
    }

    @Override
    public String exhibit(Sculpture sculpture) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(sculpture);
    }
    
    
}
