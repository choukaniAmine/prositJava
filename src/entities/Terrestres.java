package entities;

public class Terrestres extends Animal implements Omnivore<Food>{
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

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(this.name + " mange les deux");
        } else {
            System.out.println(this.name + " ne mange pas les deux ");
        }
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(this.name + " mange de la viande");
        } else {
            System.out.println(this.name + " ne mange pas de viande");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println(this.name + " mange de plant");
        } else {
            System.out.println(this.name + " ne mange pas de plant");
        }
    }
}
