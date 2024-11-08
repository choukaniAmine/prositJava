package entities;

public class Dolphin extends Aquatic{
    protected Float  swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
public Dolphin(){};
    public void swim(){
        System.out.println("This dolphin is swimming");
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
               super.toString();
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(this.name + " mange de la viande");
        } else {
            System.out.println(this.name + " ne mange pas ");
        }

    }
}
