# ☕ Java Design Patterns

## Iterator

Iterator pattern is used to access sequentially a list of elements inside an object without having to know the object itself.

For example, let's suppose we have a shopping basket and want to add items on it. The cashier just needs to know that there's an item to pass, independent of the quantity.

So, the methot to checkout the shopping items would be like this:

```java
    public static Float checkout(ShoppingBasket shoppingBasket) {
        Float total = 0f;

        Screen.promptBanner();

        for (Item item : shoppingBasket) {
            Screen.promptItem(item);
            total += item.getPrice();
        }
        Screen.promptTotal(total);
        return total;
    }
```

Notice that we can iterate trought the items with the shopping basket only, without having a declaration of a list of these items.
