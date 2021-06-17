# ☕ Java Design Patterns

## Prototype

This pattern aims to create copies of an instance, and that instance would serve as a template for those copies.

For example, let's suppose you have an Empire, and want to create an army with soldiers that you can easily control. Also, you have Obsessive Compulsive Disorder and want them all to look the same.

For that so, you can use clones.

In Java is easy to implement this because there is an interface called `Cloneable`. Then, you need to override the method `clone`:

```java
public class Trooper implements Cloneable {
    private String name;
    private Specie specie;
    private Gender gender;
    private Float height;
    private Color hairColor;
    private Color eyeColor;

    // Constructor, getters and setters were hidden for simplification

    @Override
    public Trooper clone() {
        try {
            return (Trooper) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
```

Then, you can build your army by cloning like:

```java
Trooper template = new Trooper("Jango Fett", Specie.HUMAN, Gender.MALE, 1.83f, Color.BLACK, Color.BROWN);
Trooper clone = template.clone();
```

And you also can modify as you want:

```java
clone.setName("Bobba Fett");
```
