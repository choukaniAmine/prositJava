//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Animal lion = new Animal("family1", "Lion", 5, true);
        Animal tiger = new Animal("family2", "Tiger", 3, true);
        Animal zebra = new Animal("family3", "Zebra", 4, false);

        Zoo myZoo = new Zoo("zoo1", "tunis");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(zebra);
        myZoo.displayAnimals();
       System.out.println( myZoo.addAnimal(zebra));
        myZoo.displayAnimals();
        /* myZoo.removeAnimal(tiger);
        System.out.println("**");
        myZoo.displayAnimals();*/
        System.out.println( myZoo.isZooFull());

        Zoo myZoo2 = new Zoo("zoo2", "tunis");
        myZoo2.addAnimal(lion);
        System.out.println(myZoo.comparerZoo(myZoo,myZoo2));
    }


}