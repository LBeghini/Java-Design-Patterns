# ☕ Java Design Patterns

## Factory Method

Factory Method is a pattern that defines an interface for creating an object, and let its subclasses decide which class to instantiate.

For example, you are in a game creating your character, and there is four different races:

- Human
- Orc
- Dwarf
- Elf
  
```java
Character character = new Character("Aragorn", Race.HUMAN);
```

Each one of these has different sizes and peculiarities, and their weapons must be built specifically for each race. You will need a special blacksmith to create your weapon.

First, we'll need a Interface Blacksmith:

```java
public interface Blacksmith {
    Weapon forge(WeaponType weaponType);
}
```

Then, for each race we have, we'll create a specific Blackmith by implementing the interface:

```java
class DwarfBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 20f, 15f, 10f);
    }

}

class ElfBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 30f, 10f, 6f);
    }

}

class HumanBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 20f, 10f, 10f);
    }

}

class OrcBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 40f, 30f, 15f);
    }

}
```

Realize that each Blacksmith return different weapons.  
When finishing creating you character, just go to the factory and ask to a blacksmith of your class to build your weapon.

```java
Blacksmith blacksmith = new Factory().getHumanBlacksmith();
character.setWeapon(blacksmith.forge(WeaponType.SWORD));

```

After that, get your weapon and follow your adventure!
