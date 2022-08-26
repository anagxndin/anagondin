package superclasse;
public class Peixe extends Animal{

    private String corEscama;

    public Peixe(double peso, int idade, int numeroMembro, String corEscama) {
        super(peso, idade, numeroMembro);
        
    }

    public void locomover(){
        System.out.println("Peixe está nadando");
    }

    public void alimentar(){
        System.out.println("Peixe está filtrando a água");
    }

    public void emitirSom(){
        System.out.println("glub glub glub");
    }

    public void soltarBolha(){
        System.out.println("blob blob blob");
    }

    @Override
    public int getIdade() {
        // TODO Auto-generated method stub
        return super.getIdade();
    }

    @Override
    public int getNumeroMembro() {
        // TODO Auto-generated method stub
        return super.getNumeroMembro();
    }

    @Override
    public double getPeso() {
        // TODO Auto-generated method stub
        return super.getPeso();
    }

    @Override
    public void setIdade(int idade) {
        // TODO Auto-generated method stub
        super.setIdade(idade);
    }

    @Override
    public void setNumeroMembro(int numeroMembro) {
        // TODO Auto-generated method stub
        super.setNumeroMembro(numeroMembro);
    }

    @Override
    public void setPeso(double peso) {
        // TODO Auto-generated method stub
        super.setPeso(peso);
    }

    
    
}
