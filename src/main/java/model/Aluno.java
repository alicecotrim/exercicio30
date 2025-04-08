package model;

/**
 *
 * @author 1072511349
 */
public class Aluno {
    private String nome;
    private int id;
    private int idade;
    private double altura;
    private double peso;

    public Aluno() {
    }

    public Aluno(String nome, int id, int idade, double altura, double peso) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getIMC(){
        return (getPeso()/(getAltura()*getAltura()));
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", id=" + id + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
}
