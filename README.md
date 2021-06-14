# ☕ Java Design Patterns

## Builder

Builder pattern is useful to dinamically create classes, separating the construction of a complex object.

For example, let's say we want to create a crew member of a spaceship. It's a role that demands a lot of responsability, and many documents are necessary to register a crew member:

- id
- name
- species
- rank
- serialNumber
- status
- birthDate
- bloodType

### Without Builder

It would be annoying and difficult to understand having all these attributes in a single constructor:

```java

public CrewMember(Integer id, String name, Specie specie, Rank rank, String serialNumber, Status status, Date birthDate, BloodType bloodType);

```

and the creation would be:
```java

CrewMember crewMember = new CrewMember(1, "Spock", Specie.HUMAN, Rank.CAPTAIN, "SC937-0176CEC", Status.DECEASED, LocalDate.of(2233, 3, 22), BloodType.T);

```

witch is hard to understand what each part is, and is important to keep everything in the same place implemented by the constructor.


### With Builder
Creating a complex object gets easier by dividing the process in parts

```java

CrewMember crewMember = crewMemberBuilder.setName("Spok").setspecie(Specie.HUMAN).setRank(Rank.CAPTAIN)
                                         .setSerialNumber("SC937-0176CEC").setStatus(Status.DECEASED)
                                         .setBirthDate(LocalDate.of(2233, 3, 22)).setBloodType(BloodType.AB).build();

```

witch is better to read and understand, and the order of the steps doesn't matter.
