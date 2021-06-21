package com.language.programming.model;

import com.language.programming.model.factory.*;

public class Factory {

    public Blacksmith getDwarfBlacksmith() {
        return new DwarfBlacksmith();
    }

    public Blacksmith getElfBlacksmith() {
        return new ElfBlacksmith();
    }

    public Blacksmith getHumanBlacksmith() {
        return new HumanBlacksmith();
    }

    public Blacksmith getOrcBlacksmith() {
        return new OrcBlacksmith();
    }

}
