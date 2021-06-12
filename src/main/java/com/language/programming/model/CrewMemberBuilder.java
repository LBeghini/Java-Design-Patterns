package com.language.programming.model;

import java.time.LocalDate;

import com.language.programming.model.enumerators.*;
import com.language.programming.model.error.InvalidId;
import com.language.programming.model.error.InvalidName;

public class CrewMemberBuilder {

    private CrewMember crewMember;

    public CrewMemberBuilder() {
        crewMember = new CrewMember();
    }

    public CrewMember build() {
        if (crewMember.getId() == null){
            throw new InvalidId("Invalid id");
        }

        if (crewMember.getName().isEmpty()) {
            throw new InvalidName("Invalid name");
        }

        return crewMember;
    }

    public CrewMemberBuilder setId(Integer id) {
        crewMember.setId(id);
        return this;
    }

    public CrewMemberBuilder setName(String name) {
        crewMember.setName(name);
        return this;
    }

    public CrewMemberBuilder setspecie(Specie specie) {
        crewMember.setSpecie(specie);
        return this;
    }

    public CrewMemberBuilder setRank(Rank rank) {
        crewMember.setRank(rank);
        return this;
    }

    public CrewMemberBuilder setSerialNumber(String serialNumber) {
        crewMember.setSerialNumber(serialNumber);
        return this;
    }

    public CrewMemberBuilder setStatus(Status status) {
        crewMember.setStatus(status);
        return this;
    }

    public CrewMemberBuilder setBirthDate(LocalDate birthDate) {
        crewMember.setBirthDate(birthDate);
        return this;
    }

    public CrewMemberBuilder setBloodType(BloodType bloodType) {
        crewMember.setBloodType(bloodType);
        return this;
    }

}
