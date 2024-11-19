public class Calculateur {

    public double calculerPourClientNormal(double montant, boolean vip) {
        double total = montant * 1.2; // TVA 20%
        if (vip){
            total -= montant * 0.1; // Réduction 10%
        }
        return total;
    }
}
