import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages=25;
int nbranimal=0;
    public Zoo( String name, String city) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbranimal=" + nbranimal +
                '}';
    }

    boolean addAnimal(Animal animal){
        if(this.searchAnimal(animal)!=-1 || nbranimal>=nbrCages ){
            return false;
        }
else{

    this.animals[nbranimal]=animal;
            nbranimal++;
    return true;
}
    }
    public void displayAnimals() {

            for (int i = 0; i < nbranimal; i++) {
                System.out.println(animals[i]);
            }

    }
int searchAnimal(Animal animal){
        for(int i=0;i<nbranimal;i++){
            if (this.animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
}

boolean removeAnimal(Animal animal){
        int pos=this.searchAnimal(animal);
        if(pos==-1){
            return false;
        }
        else {
            for(int i=pos;i<=nbranimal;i++){
                this.animals[i]=this.animals[i+1];
            }
            return true;
        }
}
     boolean isZooFull() {
        return nbranimal >= nbrCages;
    }
     Zoo comparerZoo(Zoo z1, Zoo z2) {
        if(z1.nbranimal>z2.nbranimal)
        {
            return z1;
        }
        else return z2;
    }
}
