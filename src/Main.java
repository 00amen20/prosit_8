
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Création de la société
        SocieteArrayList societe = new SocieteArrayList();

        // Création des employés
        Employe e1 = new Employe(
                3, "Ali", "Ahmed", "Informatique", 2);

        Employe e2 = new Employe(
                1, "Sami", "Mohamed", "Finance", 3);

        Employe e3 = new Employe(
                4, "Ahmed", "Ali", "Informatique", 1);

        Employe e4 = new Employe(
                2, "Yassine", "Omar", "Marketing", 2);

        Employe e5 = new Employe(
                5, "Amine", "Hedi", "Finance", 1);

        // 1. Ajouter les employés
        System.out.println("=== AJOUT ===");

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        // 2. Afficher les employés
        System.out.println("\n=== AFFICHAGE ===");
        societe.displayEmploye();

        // 3. Recherche par nom
        System.out.println("\n=== RECHERCHE PAR NOM ===");

        System.out.println(
                societe.rechercherEmploye("Ali"));

        // 4. Recherche par objet
        System.out.println("\n=== RECHERCHE PAR OBJET ===");

        System.out.println(
                societe.rechercherEmploye(e1));

        // 5. Supprimer un employé
        System.out.println("\n=== SUPPRESSION ===");

        societe.supprimerEmploye(e4);

        // 6. Tri par ID
        System.out.println("\n=== TRI PAR ID ===");

        societe.trierEmployeParId();
        societe.displayEmploye();

        // 7. Tri par département, grade et nom
        System.out.println("\n=== TRI PERSONNALISE ===");

        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // 8. Recherche par département
        System.out.println("\n=== RECHERCHE DEPARTEMENT ===");

        List<Employe> resultat =
                societe.rechercherParDepartement("Informatique");

        for (Employe e : resultat) {
            System.out.println(e);
        }
    }
}
