package main;

import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
/*
        entities.Animal lion = new entities.Animal("family1", "Lion", 5, true);
        entities.Animal tiger = new entities.Animal("family2", "Tiger", 3, true);
        entities.Animal zebra = new entities.Animal("family3", "Zebra", 4, false);

        entities.Zoo myZoo = new entities.Zoo("zoo1", "tunis");

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

       myZoo.setName("");
      lion.setAge(-2);
      */

    //    Aquatic aquatic = new Aquatic("family1", "aquatic1", 5, true, "habitat1");
     /*   Terrestres terrestres=new Terrestres("family1","aquatic1",5,true,5);
        Penguin penguin=new Penguin("family1","aquatic1",5,true,"habitat1",50F);
        Dolphin dolphin=new Dolphin("family1","aquatic1",5,true,"habitat1",70F);
        System.out.println( aquatic.toString());
        System.out.println("**");
        System.out.println(terrestres.toString());
        System.out.println("**");
        System.out.println(penguin.toString());
        System.out.println("**");
        System.out.println(dolphin.toString());
        System.out.println("**");
        aquatic.swim();
        dolphin.swim();
        penguin.swim();*/

        Zoo myZoo = new Zoo("zoo1", "tunis");
        Aquatic penguin1 = new Penguin("family1", "Peng", 5, true, "habitat1", 20.0f);
        Aquatic penguin2 = new Penguin("family1", "Pengo", 5, true, "habitat1", 25.0f);
        Aquatic dolphin1 = new Dolphin("Family2", "dolph", 3, true, "habitat2", 100.5f);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(dolphin1);
        System.out.println("max penguin swim"+myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        Aquatic dolphin2 = new Dolphin("Family2", "Peng", 5, true, "habitat1", 100.5f);
        System.out.println(dolphin2.equals(penguin1));
    }






}