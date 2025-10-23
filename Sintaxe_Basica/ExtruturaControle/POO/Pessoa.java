package Sintaxe_Basica.ExtruturaControle.POO;

public class Pessoa {

    // Atributos - Caracteristicas da classe
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(){
        this.nome = "sem nome";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;

    }
   
    // Metodos - Accoes que a classe pode fazer 
    // setters e getters setters adiciona valores 
    //getters pega valores 
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
}
