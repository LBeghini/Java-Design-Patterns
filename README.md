# ☕ Java Design Patterns

## Bridge

Bridge pattern separate the abstraction from the implementation, allowing them to be developed idependently and let the access to the abstraction part dissociate from the implementation part.

For example, lets say that we have a factory that makes two types of candy: cakes and ice cream. That's our abstraction.

For each candy, there's two flavours: chocolate and strawberry. That's our interface.

The bridge is between each candy with the flavours.

<img src="./resources/BridgeDiagram.png" width="800px" />

