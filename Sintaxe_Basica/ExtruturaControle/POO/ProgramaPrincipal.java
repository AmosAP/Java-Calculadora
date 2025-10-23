package Sintaxe_Basica.ExtruturaControle.POO;


// Criar Objetos novos  para fazer accoes 

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Laurindo");
        pessoa1.setIdade(28);
        pessoa1.setAltura(1.77);
        pessoa1.setPeso(80.1);



        System.out.println("o nome da pessoa e:" + pessoa1.getNome() + " e a idade e: " + pessoa1.getIdade() + " e a altura e: " + pessoa1.getAltura() + " e o peso e: " + pessoa1.getPeso());

    }
    
}
