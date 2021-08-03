package com.language.programming.src;

import java.util.ArrayList;
import java.util.List;

public class Box extends Package {

    private List<Package> content;

    public Box(String description) {
        super(description);
        this.content = new ArrayList<>();
    }

    public void addContent(Package content) {
        this.content.add(content);
    }

    @Override
    public String getContent() {
        StringBuilder output = new StringBuilder();
        output.append(this.getDescription() + "\n");
        for (Package content : content) {
            output.append(content.getContent() + "\n");
        }
        return output.toString();
    }
}
