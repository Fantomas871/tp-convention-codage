public class CommandeManager {

    public void traiterCommande(String status, boolean estUrgente, double montant) {
        
        if (status.equals("NOUVELLE")) {
            if (estUrgente) {
                System.out.println("Traiter la commande immédiatement.");
            } else {
                if (montant > 1000) {
                    System.out.println("Appliquer une remise spéciale.");
                } else {
                    System.out.println("Traiter la commande normalement.");
                }
            }
        } else if (status.equals("ANNULEE")) {
            System.out.println("Commande annulée. Envoyer une notification au client.");
        } else {
            System.out.println("Statut de commande inconnu.");
        }
    }
}