# ☕ Java Design Patterns

## Template Method

As the name says, it defines a template for an operation. Template Method lets subclasses to redefine certain steps of an method without changing the algorithm's structure.

For example, let's say we are at a restaurant and we want to call an employee. 

If the employee is the Waiter, he would introduce himself as the waiter, and will ask us how he can serve us.
If the employee is the chef, he would introduce himself as the chef, and will ask if there's something wrong with the food.

#### Waiter
```
Hello, my name is NAME and I am a WAITER. How can I serve you today?
```

### Chef
```
Hello, my name is NAME and I am a COOKER. Is there any problem with your food?
```


In those lines we can see that only a few changes were made. The method that returns those lines only needs to change the role and the line the employees say at the end.

```java

public abstract class Employee {

    private String name;
    private Role role;

    public abstract String serve();

    public String introduce() {
        return "Hello, my name is " + this.name + " and I am a " + this.role.toString() + ". " + this.serve();
    }

}

```

As the Waiter and Chef class are created, they will need to implement the serve() method that will return their respective lines. And both of them also have different roles, witch transforms the method introduce() into a template.