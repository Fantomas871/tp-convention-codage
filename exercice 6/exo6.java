public class Facture {
    
    public double calculervip(double montant, boolean vip){
        total=montant;
        if (clientVIP && montant > 1000) {
            total -= montant * 0.1; // Réduction de 10%
    }
    return total;
    }

    public double calculerfrais (double montant, boolean fraisLivraison){
        if (fraisLivraison && montant < 500) {
                total += 20; // Frais de livraison
            }
        return total;
    }

    double total=calculervip(montant,vip)+calculerfrais(montant,frais);
}
