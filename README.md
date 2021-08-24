# ☕ Java Design Patterns

## About

This application is a simple Java Console Application that aims to implement design pattern examples to a Programmin Language Class. A set of design patterns will be developed
each week, and they are divided in different [branches](https://github.com/LBeghini/Java-Design-Patterns/branches).  

The main branch is just a template for every other branch.

Also, to make it easier to download the source code, [releases](https://github.com/LBeghini/Java-Design-Patterns/releases) are created related to the task of the week, giving a snapshot of the code for that specific implementation.

## Implemented design patterns

### Behavioural patterns

- [x] [Chain of responsibility](https://github.com/LBeghini/Java-Design-Patterns/tree/4-chain-of-responsibility)
- [x] [Command](https://github.com/LBeghini/Java-Design-Patterns/tree/6-command)
- [x] [Interpreter](https://github.com/LBeghini/Java-Design-Patterns/tree/9-interpreter)
- [x] [Iterator](https://github.com/LBeghini/Java-Design-Patterns/tree/4-iterator)
- [x] [Mediator](https://github.com/LBeghini/Java-Design-Patterns/tree/9-mediator)
- [x] [Memento](https://github.com/LBeghini/Java-Design-Patterns/tree/5-memento)
- [x] [Observer](https://github.com/LBeghini/Java-Design-Patterns/tree/5-observer)
- [x] [State](https://github.com/LBeghini/Java-Design-Patterns/tree/3-state)
- [x] [Strategy](https://github.com/LBeghini/Java-Design-Patterns/tree/6-strategy)
- [x] [Template method](https://github.com/LBeghini/Java-Design-Patterns/tree/4-template-method)
- [x] [Visitor](https://github.com/LBeghini/Java-Design-Patterns/tree/11-visitor)

### Creational patterns

- [ ] Abstract factory
- [x] [Builder](https://github.com/LBeghini/Java-Design-Patterns/tree/1-builder)
- [x] [Factory method](https://github.com/LBeghini/Java-Design-Patterns/tree/2-factory-method)
- [x] [Prototype](https://github.com/LBeghini/Java-Design-Patterns/tree/2-prototype)
- [x] [Singleton](https://github.com/LBeghini/Java-Design-Patterns/tree/1-singleton)

### Structural patterns

- [x] [Adapter](https://github.com/LBeghini/Java-Design-Patterns/tree/7-adapter)
- [x] [Bridge](https://github.com/LBeghini/Java-Design-Patterns/tree/7-bridge)
- [x] [Composite](https://github.com/LBeghini/Java-Design-Patterns/tree/8-composite)
- [x] [Decorator](https://github.com/LBeghini/Java-Design-Patterns/tree/11-decorator)
- [x] [Facade](https://github.com/LBeghini/Java-Design-Patterns/tree/8-facade)
- [x] [Flyweight](https://github.com/LBeghini/Java-Design-Patterns/tree/10-flyweight)
- [x] [Proxy](https://github.com/LBeghini/Java-Design-Patterns/tree/10-proxy)


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
