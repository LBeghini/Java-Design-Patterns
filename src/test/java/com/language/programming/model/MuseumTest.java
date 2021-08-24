package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.visitors.*;

public class MuseumTest {
        
    @Test
    public void shouldExhibitPainting() {
        Painting painting = new Painting("Mona Lisa", "Leonardo da Vinci"); 
        assertEquals("{\n  \"name\": \"Mona Lisa\",\n  \"artist\": \"Leonardo da Vinci\"\n}", Museum.getInstance().exhibit(painting));
    }

    @Test
    public void shouldExhibitSculpture() {
        Sculpture sculpture = new Sculpture("The Thinker", "Auguste Rodin"); 
        assertEquals("{\n  \"name\": \"The Thinker\",\n  \"artist\": \"Auguste Rodin\"\n}", Museum.getInstance().exhibit(sculpture));
    }
    
}
