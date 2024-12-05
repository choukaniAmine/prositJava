package main;


import entity.AffectationHashMap;
import entity.Departement;
import entity.Employe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AffectationHashMap gestionAffectations = new AffectationHashMap();

        Employe e1 = new Employe(1, "chouka","chouka","informatique",8);
        Employe e2 = new Employe(2, "amine","choukani","RH",5);

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "RH", 15);

        gestionAffectations.ajouterEmployeDepartement(e1, d1);
        gestionAffectations.ajouterEmployeDepartement(e2, d2);


        gestionAffectations.ajouterEmployeDepartement(e1, d2);


        gestionAffectations.afficherEmployesEtDepartements();
    }
}