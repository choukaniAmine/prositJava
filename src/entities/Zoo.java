package entities;

public class Zoo {
   protected Animal[] animals;
   protected String name;
   protected String city;
   protected final int nbrCages=25;
protected  int nbranimal=0;
    public Zoo( String name, String city) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }
    public void displayZoo() {
        System.out.println("entities.Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "entities.Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbranimal=" + nbranimal +
                '}';
    }

    public boolean addAnimal(Animal animal){
        if(this.searchAnimal(animal)!=-1 || isZooFull() ){
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
public int searchAnimal(Animal animal){
        for(int i=0;i<nbranimal;i++){
            if (this.animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
}

public boolean removeAnimal(Animal animal){
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
    public boolean isZooFull() {
        return nbranimal >= nbrCages;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if(z1.nbranimal>z2.nbranimal)
        {
            return z1;
        }
        else return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
      if(name.isEmpty()){
          System.out.println("nom invalide");
      }
      else
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbranimal() {
        return nbranimal;
    }

    public void setNbranimal(int nbranimal) {
        this.nbranimal = nbranimal;
    }
}
