# ☕ Java Design Patterns

## Flyweight

Fliweight pattern defines an object that minimizes memory use by sharing the same object in varios different locations.

For example, when creating a characters to a game, a pre defined color is something all characters might share. You can have a character with a red hair and blue eye and yellow skin, and have another character with yellow hair, red eye and blue skin. Even in different attributes, the color is the same, and doesn't need to be kept in memory for every character you create: just create one color (let's say blue) and them for all the objects that uses this color, call the same object.