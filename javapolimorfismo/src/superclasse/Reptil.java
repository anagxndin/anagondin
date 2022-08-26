package superclasse;
public class Reptil extends Animal {

    private String corEscama;

    public Reptil(double peso, int idade, int numeroMembro, String corEscama) {
        super(peso, idade, numeroMembro);
        
    }

    public void locomover(){
        System.out.println("Réptil está rastejando");
    }

    public void alimentar(){
        System.out.println("Réptil está comendo");
    }

    public void emitirSom(){
        System.out.println("Réptil está emitindo som.");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    

    

    
    
}
