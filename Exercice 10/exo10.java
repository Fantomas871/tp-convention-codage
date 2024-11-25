public class ValidateurUtilisateur {

    public boolean estValide(String nom, String email, int age) {

        if (verificationNom(nom) && verificationEmail(email) && verificationAge(age)){
            return true;
        }
        return false;
    }

    public boolean verificationNom (String nom){
        if (nom == null || nom.isEmpty()) {
            System.out.println("Nom invalide.");
            return false;
        }
        return true;
    }

    public boolean verificationEmail (String email){
        if (email == null || !email.contains("@")) {
            System.out.println("Email invalide.");
            return false;
        }
        return true;
    }

    public boolean verificationAge (int age){
        if (age <= 0) {
            System.out.println("Âge invalide.");
            return false;
        }
        return true;
    }
}
