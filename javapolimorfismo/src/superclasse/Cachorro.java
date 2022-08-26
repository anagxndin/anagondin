package superclasse;

public class Cachorro extends Mamifero {

    public Cachorro(double peso, int idade, int numeroMembro, String corDePelo) {
        super(peso, idade, numeroMembro, corDePelo);
    }

    public void enterrarOSSOS(){
        System.out.println("Cachorro está enterrando ossos");
    }

    public void abanarRabo(){
        System.out.println("Cachorro está feliz e abana o rabo");
    }
    
}
