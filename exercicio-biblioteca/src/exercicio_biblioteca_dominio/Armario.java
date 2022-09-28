package exercicio_biblioteca_dominio;

public class Armario {

    //Atributos
    private String nome;

    //Construtor
    public Armario(String nome){
        this.setNome(nome);
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
