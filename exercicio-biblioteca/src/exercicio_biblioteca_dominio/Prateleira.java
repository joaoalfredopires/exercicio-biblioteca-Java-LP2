package exercicio_biblioteca_dominio;

public class Prateleira {

    //Atributos
    private int numero;
    private Armario armario;

    //Construtor
    public Prateleira(int numero, Armario armario){
        this.setNumero(numero);
        this.setArmario(armario);
    }

    //Getters e Setters
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public Armario getArmario() {
        return armario;
    }
    public void setArmario(Armario armario) {
        this.armario = armario;
    }
}
