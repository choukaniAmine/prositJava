package entities;

import java.util.Objects;

public abstract class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
public Aquatic(){};
    public abstract void swim();

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) o;
        return  this.name.equals(other.name) &&
                this.age == other.age &&
                this.habitat.equals(other.habitat);
    }


}
