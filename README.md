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

It would be annoying and difficult to understand having all these attributes in a single constructor:

```java

public CrewMember(Integer id, String name, Species specie, Rank rank, String serialNumber, Status status, Date birthDate, BloodType bloodType)

```

With Builder, creating a complex object gets easier by dividing the process in parts.
