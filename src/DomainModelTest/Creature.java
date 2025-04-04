package DomainModelTest;

import java.util.*;

abstract class Creature {
    protected String name;
    protected int intelligence;

    public Creature(String name, int intelligence) {
        this.name = name;
        this.intelligence = intelligence;
    }

    public String getName() { return name; }
    public int getIntelligence() { return intelligence; }
}