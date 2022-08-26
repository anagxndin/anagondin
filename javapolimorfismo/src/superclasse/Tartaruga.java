package superclasse;

public class Tartaruga extends Reptil {

    public Tartaruga(double peso, int idade, int numeroMembro, String corEscama) {
        super(peso, idade, numeroMembro, corEscama);
    }

    public void locomover(){
        System.out.println("A tartaruga anda bemmm devagar");
    }
    
}
