# ☕ Java Design Patterns

## Strategy

Strategy pattern lets the implementation of the method vary independently for whoever uses it.

For example, let's say we have an app that calculates the shortest path depending of the means of transportation. 

- If you are going on foot, you want the shortest walking path. 
- If you are going by car, you want the shortest driving path.
- If you are going by bicycle, you want the shortest cycling path.

The calculation algorithms of each method may vary. On foot, it might be benefitial to search for paths that doesn't have many climbs. By car, traffic must be taken under consideration. By bicycle, the path must be calculated throught streets that have a bike lane.

So each one of these calculations would be a different strategy.