abstract class Animal {
    protected String nom;
    protected int age;

    public abstract void parler();
    
}

public class Chien extends Animal {
    super();
    String type="Chien";

    public void parler(){
        System.out.println("Woof Woof");
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

}