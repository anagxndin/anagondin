package superclasse;

import javax.print.event.PrintEvent;

public class Mamifero extends Animal{

    String corDePelo;

    public Mamifero(double peso, int idade, int numeroMembro, String corDePelo) {
        super(peso, idade, numeroMembro);
        this.peso = peso;
        this.corDePelo = corDePelo;
    }

    public void alimentar(){
        System.out.println("Mamífero está mamando.");
    }

    public void locomover(){
        System.out.println("Mamífero está andando.");
    }

    public void emitirSom(){
        System.out.println("Som padrão do mamífero.");
    }

    public String getCorDePelo() {
        return corDePelo;
    }

    public void setCorDePelo(String corDePelo) {
        this.corDePelo = corDePelo;
    }

    
    
}
