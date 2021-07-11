# ☕ Java Design Patterns

## Memento

Memento pattern record the state of an object and externalize it, so it can be restored later.

For example, let's say we are building an astronomic application where we need to simulate stars behaviour over time. That's the life cycle of a star:

<br>
<br>
<img src="./resources/StarLifeCycle.png" width="800px" />

<br>
<br>

The application requires us to go set the Star states, return to an specifc state and undo changes.

With memento, in our main class Star we add an list of states.

```java
public class Star {
    private StarState state;
    private List<StarState> memento = new ArrayList<>();

}
```

When the state changes, we add the change to the memento list.

```java
public void setState(StarState state) {
    this.state = state;
    this.memento.add(this.state);
}
```

Then, we just need to implement the methods to restore, undo and redo:

```java
public void restoreState(int index) {
    if (this.memento.isEmpty()) {
        return;
    }

    if (index < 0 || index > this.memento.size() - 1) {
        throw new IllegalArgumentException("Invalid index");
    }

    this.state = this.memento.get(index);

}

public void undo() {
    if (this.memento.isEmpty()) {
        return;
    }

    int current = this.memento.indexOf(this.state);

    if (current == 0) {
        return;
    }

    this.state = this.memento.get(current - 1);

}

```
