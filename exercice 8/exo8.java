public class UserManager {

    public void gererUtilisateur(String action, String nom) {
        if (nom != null && !nom.isEmpty()){
            return;
        }else if (action.equals("ajouter")) {
            ajouterUtilisateur(nom);
        }else if(action.equals("supprimer")) {
            supprimerUtilisateur(nom);
        }else if (action.equals("rechercher")) {
            rechercherUtilisateur(nom);
        } else {
            System.out.println("Action inconnue.");
        }
    }

    public void ajouterUtilisateur (String nom){
        System.out.println("Utilisateur " + nom + " ajouté.");
    }

    public void supprimerUtilisateur (String nom){
        System.out.println("Utilisateur " + nom + " supprimé.");
    }

    public void rechercherUtilisateur (String nom){
        System.out.println("Recherche de l'utilisateur " + nom + ".");
    }
}
