public class Animal {
    protected String nom;
    protected int age;

    public void parler(){
        System.out.println("Je suis un animal.");
    }

    public void afficherInfo(){
        System.out.println("Nom: "+this.nom+", Âge: "+this.age+" ans");
    }
}

//Cette classe défini un animal