# ☕ Java Design Patterns

## Singleton

Singleton pattern is used when you need only one instance of some class for the hole program.  

For example, let's say we have a class Spaceshipt with the attributes:

- Name
- Lenght
- Diameter
- Height
- Crew
- Fuel

Imagine that the navigation team wants to land the ship into a new planet, but for some mistake an intern created another instance of the ship to play with. Somehow, the navigation team got the wrong instance of the ship, and the landing calculations where all messed up and the spaceship crashed against the planet.

To avoid disasters like this, we would want every crew member in the Spaceship to have access to the same information, with no more than one instance of the Spaceship.

Singleton pattern solves this problem, where the class constructor is private, meaning that no one can implement a new instance of the class except for itself. The class attributes belongs to the class, so they are  static.