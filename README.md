# ☕ Java Design Patterns

## State

State pattern is used when you need to control the state of an object.

For example, if we want to create a keep track of the state of a music, that follows the diagram:

<img src="./resources/StateDiagram.png" width="800px" />

we would implement a class like below:

```java
public class Music {
    private String title;
    private String artist;
    private MusicState state;

    // constructor, getters and setters were ommited for simplification
}
```

and create a MusicState interface:

```java
public interface MusicState {

    String getState();

    String play(Music music);

    String pause(Music music);

    String skip(Music music);

    String stop(Music music);
}

```
