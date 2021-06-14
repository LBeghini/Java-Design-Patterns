package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import com.language.programming.model.enumerators.BloodType;
import com.language.programming.model.enumerators.Rank;
import com.language.programming.model.enumerators.Specie;
import com.language.programming.model.enumerators.Status;
import com.language.programming.model.error.InvalidId;
import com.language.programming.model.error.InvalidName;

public class CrewMemberTest {

  @Test
  public void shouldSucceedCreateCrewMember() {
    try {
      CrewMemberBuilder crewMemberBuilder = new CrewMemberBuilder();
      CrewMember crewMember = crewMemberBuilder.setId(1).setName("Spock").setspecie(Specie.VULCANO)
          .setRank(Rank.COMMANDER).setSerialNumber("S 179-276 SP").setStatus(Status.MISSING)
          .setBirthDate(LocalDate.of(2285, 1, 6)).setBloodType(BloodType.T).build();

      assertNotNull(crewMember);

    } catch (InvalidId e) {

    }
  }

  @Test
  public void shouldFailCrewMemberWithoutId() {
    assertThrows(InvalidId.class, () -> {
      CrewMemberBuilder crewMemberBuilder = new CrewMemberBuilder();
      CrewMember crewMember = crewMemberBuilder.setName("Spock").setspecie(Specie.HUMAN).setRank(Rank.CAPTAIN)
          .setSerialNumber("SC937-0176CEC").setStatus(Status.DECEASED).setBirthDate(LocalDate.of(2233, 3, 22))
          .setBloodType(BloodType.AB).build();
    });
  }

  @Test
  public void shouldFailCrewMemberWithoutName() {

    assertThrows(InvalidName.class, () -> {
      CrewMemberBuilder crewMemberBuilder = new CrewMemberBuilder();
      CrewMember crewMember = crewMemberBuilder.setId(3).setName("").setspecie(Specie.HUMAN).setRank(Rank.ADMIRAL)
          .setSerialNumber("SCAS-13JDS").setStatus(Status.RETIRED).setBirthDate(LocalDate.of(2227, 6, 20))
          .setBloodType(BloodType.T).build();

    });
  }
}