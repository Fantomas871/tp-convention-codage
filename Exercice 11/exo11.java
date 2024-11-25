public class CalculateurPrix {

    public double calculerPrixTotal(int quantite, String categorie) {
        double prixUnitaire = 0;
        prixUnitaire+=type(categorie);
        return prixUnitaire * quantite * enGros(quantite);
    }

    public double type (String categorie){
        if (categorie.equals("Standard")) {
             return 10.0;
        } else if (categorie.equals("Premium")) {
            return = 20.0;
        } else if (categorie.equals("Luxe")) {
            return = 50.0;
        }
    }

    public double enGros (int quatite){
        if (quantite>10){
            return 0.9;
        }else{
            return 1;
        }
    }

}
