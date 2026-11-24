
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements
        IGestion<Employe>,
        IRechercheAvancee<Employe> {

    // Liste qui stocke les employés
    private ArrayList<Employe> employes;

    // Constructeur
    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    // 1. Ajouter un employé
    @Override
    public void ajouterEmploye(Employe e) {
        if (!rechercherEmploye(e)) {
            employes.add(e);
            System.out.println("Employe ajoute avec succes !");
        } else {
            System.out.println("Employe deja existant !");
        }
    }

    // 2. Rechercher un employé par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // 3. Rechercher un employé par objet
    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    // 4. Supprimer un employé
    @Override
    public void supprimerEmploye(Employe e) {
        if (employes.remove(e)) {
            System.out.println("Employe supprime !");
        } else {
            System.out.println("Employe introuvable !");
        }
    }

    // 5. Afficher tous les employés
    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // 6. Tri naturel par ID (Comparable)
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // 7. Tri personnalisé par département,
    // puis grade, puis nom (Comparator)
    @Override
    public void trierEmployeParNomDepartementEtGrade() {

        Collections.sort(employes,
                Comparator.comparing(Employe::getNomDepartement)
                        .thenComparingInt(Employe::getGrade)
                        .thenComparing(Employe::getNom)
        );
    }

    // 8. Recherche avancée par département
    @Override
    public List<Employe> rechercherParDepartement(
            String nomDepartement) {

        List<Employe> resultat = new ArrayList<>();

        for (Employe e : employes) {
            if (e.getNomDepartement()
                    .equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }

        return resultat;
    }
}
