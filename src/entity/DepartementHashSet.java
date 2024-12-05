package entity;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{
    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements) {
            if (dep.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
    departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement dep : departements) {
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> departementstriee = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        departementstriee.addAll(departements);
        return departementstriee;
    }
}
