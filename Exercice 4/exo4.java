public class Zoo {

    public void nourrirAnimal(String type) {
        switch (type){
            case "Chien":
                Chien.nourrir();
            case "Chat":
                Chat.nourrir();
            case "Oiseau":
                Oiseau.nourrir();
        }
    }

}

abstract class Animal {
    protected String nom;
    protected int age;

    public abstract void parler();
    public abstract void nourrir();
    
}

public class Chien extends Animal {
    super();
    String type="Chien";

    public void parler(){
        System.out.println("Woof Woof");
    }

    public void nourrir (){
        System.out.println("Donner de la nourriture pour chien à " + this.nom);
        System.out.println(this.nom + " aboie après avoir mangé.");
    }
}

public class Chat extends Animal {
    super();
    String type="Chat";

    public void parler(){
        System.out.println("Miaou");
    }

    public void decrire(){
        System.out.println("Nom: "+this.nom+", Âge: "+this.age+" ans, Type: "+this.type);
    }

    public void nourrir (){
        System.out.println("Donner de la nourriture pour chat à " + this.nom);
        System.out.println(this.nom + " ronronne après avoir mangé.");
    }
}

public class Oiseau extends Animal {
    super();
    String type="Oiseau";

    public void parler(){
        System.out.println("Cui Cui");
    }

    public void decrire(){
        System.out.println("Nom: "+this.nom+", Âge: "+this.age+" ans, Type: "+this.type);
    }

        public void nourrir (){
            System.out.println("Donner des graines à " + this.nom);
            System.out.println(this.nom + " chante après avoir mangé.");
    }
}