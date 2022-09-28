package exercicio_biblioteca_dominio;

public class Livro {

    //Atributos:
    private String codigo;
    private boolean disponivel = true;
    private Prateleira prateleira;

    //Construtor
    public Livro(String codigo, Prateleira prateleira){
        this.setCodigo(codigo);
        this.setPrateleira(prateleira);
    }

    //Getters e Setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Prateleira getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(Prateleira prateleira) {
        this.prateleira = prateleira;
    }
}
