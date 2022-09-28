package exercicio_biblioteca_tela;
import exercicio_biblioteca_dominio.Armario;
import exercicio_biblioteca_dominio.Prateleira;
import exercicio_biblioteca_dominio.Livro;

public class Tela {

    public void imprimeInfosLivro(Livro livro){
        System.out.println("Livro: " + livro.getCodigo());
        System.out.println("Prateleira: " + livro.getPrateleira().getNumero());
        System.out.println("Armário: " + livro.getPrateleira().getArmario().getNome());
        System.out.println("Status: " + livro.isDisponivel());
    }
}
