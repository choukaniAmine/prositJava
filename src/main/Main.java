package main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        entities.Animal lion = new entities.Animal("family1", "Lion", 5, true);
        entities.Animal tiger = new entities.Animal("family2", "Tiger", 3, true);
        entities.Animal zebra = new entities.Animal("family3", "Zebra", 4, false);

        entities.Zoo myZoo = new entities.Zoo("zoo1", "tunis");
/*
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(zebra);
        myZoo.displayAnimals();
       System.out.println( myZoo.addAnimal(zebra));
        myZoo.displayAnimals();
        /* myZoo.removeAnimal(tiger);
        System.out.println("**");
        myZoo.displayAnimals();
        System.out.println( myZoo.isZooFull());

        entities.Zoo myZoo2 = new entities.Zoo("zoo2", "tunis");
        myZoo2.addAnimal(lion);
        System.out.println(myZoo.comparerZoo(myZoo,myZoo2));
*/
       myZoo.setName("");
      lion.setAge(-2);

    }






}