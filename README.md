# ☕ Java Design Patterns

## Composite

Composite lets you compose objects into tree structures and then work with these structures as if they were individual objects.

For example, lets say you have an order, and thar order can be composed by many packages that contains boxes with products.

Composite can solve this by making an abstraction of package, and every item and box inherits from it. All the boxes can have different packages inside it, and the item is the final content.
