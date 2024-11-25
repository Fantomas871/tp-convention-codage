public class Analyseur {

    public String analyserDonnees(int[] donnees) {
        return "Minimum = "+minimum(donnees)+" Maximum = "+maximum(donnees)+" Moyenne = "+calculMoyenne(donnees);
    }

    public double calculMoyenne (int[] donnees){
        int somme = 0;
        double moyenne = 0;
        for (int valeur : donnees) {
            somme += valeur;
        }
        moyenne = (double) somme / donnees.length;

        return moyenne;
    }

    public int minimum (int[] donnees){
        int min = Integer.MAX_VALUE;
        for (int valeur : donnees) {
            if (valeur < min) {
                min = valeur;
            }
        }

        return min;
    }

    public int maximum (int[] donnees){
        int max = Integer.MIN_VALUE;
        for (int valeur : donnees) {
            if (valeur > max) {
                max = valeur;
            }
        }
    }
}
