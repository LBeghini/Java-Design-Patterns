# ☕ Java Design Patterns

## About

This application is a simple Java Console Application that aims to implement design pattern examples to a Programmin Language Class. A set of design patterns will be developed
each week, and they are divided in different [branches](https://github.com/LBeghini/Java-Design-Patterns/branches).  

The main branch is just a template for every other branch.

Also, to make it easier to download the source code, [releases](https://github.com/LBeghini/Java-Design-Patterns/releases) are created related to the task of the week, giving a snapshot of the code for that specific implementation.

## Implemented design patterns

### Behavioural patterns

- [ ] Chain of responsability
- [ ] Command
- [ ] Iterator
- [ ] Memento
- [ ] Observer
- [ ] State
- [ ] Strategy
- [ ] Template method

### Creational patterns

- [ ] Abstract factory
- [x] [Builder](https://github.com/LBeghini/Java-Design-Patterns/releases/tag/1.builder)
- [ ] Factory method
- [ ] Prototype
- [x] [Singleton](https://github.com/LBeghini/Java-Design-Patterns/releases/tag/1.singleton)

### Structural patterns

- [ ] Adapter
- [ ] Bridge
- [ ] Composite
- [ ] Decorator
- [ ] Facade
- [ ] Flyweight
- [ ] Mediator
- [ ] Proxy

## Technologies

- Java
- JUnit
- Maven

## Requirements 

To run and edit the project, be sure to have installed in your computer the following softwares:
- A code editor

After that, you'll need to clone this repo:

```bash
git clone https://github.com/LBeghini/Java-Design-Patterns.git
```

## Change branch

To change to a different branch, run the command:

```bash
git checkout name-of-the-branch
```

The branch names have the pattern:

```bash
{number-of-the-week}-{pattern-name}
```

> `number-of-the-week` corresponds to the week asked to be implemented certain pattern 

## Testing

This project has no aim to run any of the implemented classes, as the goal is the code itself. However, the classes will be tested to visualize the behaviour and implementation 
of the patterns.  

You can run the tests using the maven wrapper:

```bash
./mvnw test 
```

## :balance_scale: License

[MIT License](https://github.com/LBeghini/Java-Design-Patterns/blob/main/LICENSE)
