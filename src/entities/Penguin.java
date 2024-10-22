package entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
public Penguin(){}

    @Override
    public void swim() {
        System.out.println("Penguin");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
              super.toString();
    }
}
