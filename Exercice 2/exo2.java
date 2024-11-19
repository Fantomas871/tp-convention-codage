public class Veterinaire {
    
    public void soignerAnimal(String type, String nom) {
        
        Soins(type,nom);
        Examens(type);
        effectuer(type);
        
    }
    
    public void Soins(String type, String nom){
        System.out.println("Soins pour le " + type + nom);
    }
    
    public void Examens(String type){
        if (type.equals("Chien")) {
            System.out.println("Examen des pattes");
        } else if (type.equals("Chat")) {
            System.out.println("Examen des griffes");
        }
    }
    
    public void effectuer(String type){
        if (type.equals("Chien")) {
            System.out.println("Injection de vaccin");
        } else if (type.equals("Chat")) {
            System.out.println("Nettoyage des oreilles");
        }
    }
    
    
}

//Cette classe décrit un vétérinaire