package com.language.programming.model;

import com.language.programming.model.visitors.Painting;
import com.language.programming.model.visitors.Sculpture;

public interface Visitor {

    String exhibit(Painting painting);
    String exhibit(Sculpture sculpture);
    
}
