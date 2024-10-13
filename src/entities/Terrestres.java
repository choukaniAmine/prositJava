package entities;

public class Terrestres extends Animal {
    protected   int nbrLegs;

    public Terrestres(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
public Terrestres(){};
    @Override
    public String toString() {
        return super.toString()+
                "nbrLegs=" + nbrLegs;

    }
}
