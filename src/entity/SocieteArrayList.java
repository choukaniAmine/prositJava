package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{
    private ArrayList <Employe> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int departementComparison = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (departementComparison != 0) {
                    return departementComparison;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}


