package superclasse;

public class Veterinário {

    public void atendeAnimal(Animal a){
        System.out.println("Veterinário está atendendo.");
        a.emitirSom();
    }
    
}
