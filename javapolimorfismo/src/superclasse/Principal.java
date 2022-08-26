package superclasse;

public class Principal {

    public static void main(String[] args) throws Exception{
      
        Mamifero m = new Mamifero(55, 17, 2, "preto");
        Reptil r = new Reptil(0.500, 4, 0, "verde");
        Peixe p = new Peixe(0.300, 1, 1, "laranja");
        Ave a = new Ave(0.200, 5, 2, "amarelo");
        Tartaruga t = new Tartaruga(20, 50, 4, "verde");
        Cobra c = new Cobra(1, 4, 0, "azul");
        m.alimentar();
        r.alimentar();
        p.alimentar();
        a.alimentar();

        Veterinário v = new Veterinário();
        v.atendeAnimal(m);
        v.atendeAnimal(r);
        v.atendeAnimal(p);
        v.atendeAnimal(a);

        t.locomover();
        c.locomover();
                
                

        
    }
    
}
