package com.language.programming.src.objects;

import com.language.programming.src.Chair;

public class FabricChair implements Chair {

    @Override
    public String build() {
        return "Fabric Chair";
    }
    
}
