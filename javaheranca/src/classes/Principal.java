package classes;
public class Principal {

    public static void main(String[] args) {
        Aluno a = new Aluno("Pedro", 17,'M', "12345678", "Tecnico em informatica");

        Professor p = new Professor("Andre", 36 , 'M', "Programacao", 10000);

        Pedagogo pe = new Pedagogo("Maria", 25, 'F', "Setor Pedagogico", "Tecnico em Informática");

        a.fazerAniversario();
        p.fazerAniversario();
        System.out.println("O salário do professor é "+ p.getSalario() + ".");
        p.receberAumento();
        System.out.println("O salário do professor é: " + p.getSalario());
        pe.fazerAniversario();
        pe.mudarTrabalho("Técnico em Química");






    }

}

   
    

