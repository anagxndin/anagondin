package superclasse;
public class Ave extends Animal{

    private String corPena;

    public Ave(double peso, int idade, int numeroMembro, String corPena) {
        super(peso, idade, numeroMembro);
        this.corPena = corPena;
    }

    
    public void alimentar() {
        System.out.println("Ave está se alimentando.");
    }

   
    public void emitirSom() {
        System.out.println("piu piu piu");
    }

   
    public void locomover() {
        System.out.println("Ave está voando.");
    }

    public void fazendoNinho(){
        System.out.println("Ave acaba de comprar a casa propria pela MRV.");
    }


    public String getCorPena() {
        return corPena;
    }


    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    

    
    
}
